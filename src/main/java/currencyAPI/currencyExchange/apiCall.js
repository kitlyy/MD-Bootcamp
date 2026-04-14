async function getCurrencyData(targetCurrency) {

    const baseCurrency = `GBP`
    const ratesURL = `https://api.frankfurter.dev/v2/rates?base=${baseCurrency}&quotes=${targetCurrency}`
    const rateFetchResults = await fetch(ratesURL);
    const ratePromise = await rateFetchResults.json();
    if (ratePromise.status === 422) {
        throw new Error("Doiiiiii that's not a currency") // create function and deal with exception within the scope of this function
    }
    console.log(ratePromise)
    console.log("Finish");
}

function addCurrencyToPage() {
    // docment.create
    // looks something like
    // const row = document.createElement('tr');
    //const paragraphContent <p>.getelementbyID
    // paragraphContent.append( content.to.be.added )
}

async function handleClick(event) {
    event.preventDefault();
    const currencyInput = document.getElementById("targetCurrency");
    try {
        await getCurrencyData(currencyInput.value);
        addCurrencyToPage()
    } catch (e) {
        console.error(e.message);
    }
}

// DOM elements
const button = document.getElementById("submitBtn");
button.addEventListener("click", handleClick);

const output = document.getElementById("output");