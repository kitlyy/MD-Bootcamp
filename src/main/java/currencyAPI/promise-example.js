function getData(shouldFail) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (shouldFail) {
        reject(new Error("Something went wrong"));
      } else {
        resolve({ message: "Success!" }); //javascript object {json object is a key-value pair}
      }
    }, 500);
  });
}

// Using the Promise
getData(false)
  .then((result) => {
    console.log("Resolved:", result.message);
  })
  .catch(error => {
    console.error("Rejected:", error.message);
  })
  .finally(() => {
    console.log("Promise finished");
  });
