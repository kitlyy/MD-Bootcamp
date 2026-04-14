function delay(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

async function handleLunch() {
  try {

    const testResult = true;
    console.log("Step 1: start");
    await delay(300);

    console.log("Step 2: do something async");
    await delay(300);


    if (testResult) {
        // simulate success
        console.log("We were successful")
    } else {
        // simulate failure
        throw new Error("Something went wrong");
    }

    // console.log("Step 3: success");
  } catch (err) {
    console.log("Protocol failed:", err.message);
  } finally {
    console.log("Step 4: cleanup always runs");
  }
}

handleLunch();