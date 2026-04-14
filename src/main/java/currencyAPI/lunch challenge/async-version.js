function getTextMessage() {

    const crispFetchResult = true;

    return new Promise ((resolve, reject) => {
        setTimeout(() => {
            if (crispFetchResult) {
                resolve("Crisps available. Plating sandwiches now.")
            } else {
                reject({message : "Crisps not avaialable. Preparing salad instead."})
            }
        }, 2500)
    })
}

function prepareSandwiches() {
    console.log("preparing sandwiches.......");
}

function prepareSalad() {
    console.log("preparing salad")
}

async function handleLunch() {
    //const crispsAvailable =
    prepareSandwiches();
    //print out preparing sandwiches 
    try {
        const textMessageResult = await getTextMessage();
        console.log(textMessageResult);

        // console.log("Step 3: success");
    } catch (err) {
        console.log("Protocol failed:", err.message);
    } finally {
        console.log("Lunch is ready. We are having [.......]");
    }
}

handleLunch();