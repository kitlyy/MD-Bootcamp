console.log("Hello from the separated js file B^)")
console.log(document.getElementById("content"));
const allDivs = document.querySelectorAll("div");
console.log(allDivs)



const echoOutput = (event) => {
                echoBlock.textContent = event.target.value;
            }
            const inputBox = document.querySelector("input");
            const echoBlock = document.getElementById("echo");
            //inputBox.addEventListener('input', echoOutput);
            //first arg is event type, second arg is the method you want to execute
            //calling echoOutput in eventlister will run echoOutput when clicked
            //if defined as ('input', echoOutput()) then it will automatically run ?????




const echoButtonOutput = (event) => {
    if (inputBox.value === '') {
        inputBox.classList.add('error');
        alert('Please enter a value');
    } else {
        input.classList.remove('error');
        echoButtonTargetBlock.textContent = input.value;
        echoButtonTargetBlock.classList.add('text');
    }
} 


const input = document.querySelector('input');
const btn = document.querySelector('button');
const echoButtonTargetBlock = document.getElementById('echoButton');
btn.addEventListener('click', echoButtonOutput);



