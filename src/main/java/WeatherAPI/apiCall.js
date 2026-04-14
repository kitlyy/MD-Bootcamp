async function getWeatherData() {
    const statusMessage = document.getElementById('statusMessage');
    const weatherBody = document.getElementById("weatherBody");
    const toggleButton = document.getElementById("toggleWeather");

    statusMessage.textContent = "Searching for city...";
    statusMessage.className = "loading";

    try {
        const coords = await getCityData();
        if (!coords) {
            throw new Error("City not found. Please try another name.");
        }

        const url = `https://api.open-meteo.com/v1/forecast?latitude=${coords.latitude}&longitude=${coords.longitude}&hourly=temperature_2m`;
        const response = await fetch(url);
        
        if (!response.ok) {
            throw new Error("Could not fetch weather data. Please try again later.");
        }

        const result = await response.json();
        
        statusMessage.textContent = `Showing weather for ${coords.name}`;
        statusMessage.className = "";
        
        displayCurrentWeather(result.hourly);

    } catch (error) {
        statusMessage.textContent = error.message;
        statusMessage.className = "error";
        weatherBody.innerHTML = `<tr><td colspan="2" class="empty">${error.message}</td></tr>`;
        toggleButton.style.display = "none";
    }
}

async function getCityData() {
    const city = document.getElementById('cityInput').value.trim();
    if (!city) return null;

    const url = `https://geocoding-api.open-meteo.com/v1/search?name=${city}&count=1&language=en&format=json`;
    const response = await fetch(url);
    
    if (!response.ok) {
        throw new Error("Geocoding service unavailable.");
    }

    const result =  await response.json();
    
    if (!result.results || result.results.length === 0) {
        return null;
    }

    const firstResult = result.results[0];
    return {
        latitude: firstResult.latitude,
        longitude: firstResult.longitude,
        name: `${firstResult.name}${firstResult.admin1 ? ', ' + firstResult.admin1 : ''}`
    };
}

function displayCurrentWeather(data) {
    const weatherBody = document.getElementById("weatherBody");
    const toggleButton = document.getElementById("toggleWeather");

    weatherBody.innerHTML = "";
    const maxVisible = 6;


    //const date = new Date();

    data.time.forEach((timeStr, i) => {
        // Format ISO date (2024-05-20T12:00) to something readable
        const date = new Date(timeStr);
        const formattedDate = date.toLocaleDateString([], { 
            month: 'short', 
            day: 'numeric' 
        });
        const formattedTime = date.toLocaleTimeString([], { 
            hour: '2-digit', 
            minute: '2-digit' 
        });

        const row = document.createElement('tr');
        if (i >= maxVisible) {
            row.classList.add('extra-row', 'hidden');
        }

        row.innerHTML = `
            <td>
                <strong>${formattedTime}</strong>
                <div style="font-size: 0.8rem; color: #6b7280">${formattedDate}</div>
            </td>
            <td>${data.temperature_2m[i]}°C</td>
        `;

        weatherBody.appendChild(row);
    });

    if (data.time.length > maxVisible) {
        toggleButton.style.display = "block";
        toggleButton.textContent = "Show more";
    } else {
        toggleButton.style.display = "none";
    }
}

document.getElementById("toggleWeather").addEventListener("click", () => {
    const extraRows = document.querySelectorAll(".extra-row");
    const button = document.getElementById("toggleWeather");
    const isHidden = extraRows[0].classList.contains("hidden");

    extraRows.forEach(row => {
        row.classList.toggle("hidden");
    });

    button.textContent = isHidden ? "Show less" : "Show more";
});
