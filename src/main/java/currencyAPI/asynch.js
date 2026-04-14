console.log("Task 1");
setTimeout(() => console.log("Task 2 (Async)"), 1000); //lambda function is used when we're only calling it once
//non blocking timeout
console.log("Task 3");