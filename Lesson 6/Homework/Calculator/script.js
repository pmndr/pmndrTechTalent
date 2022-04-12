const firstNumber = parseFloat(prompt('What is your first number?'));
const operator = prompt('What is your operator? choose: +, -, *, /, ^');
const secondNumber = parseFloat(prompt('What is your second number?'));
let output;


if (operator == '+') {
    output = firstNumber + secondNumber;
} else if (operator == '-') {
    output = firstNumber - secondNumber;
} else if (operator == '*') {
    output = firstNumber * secondNumber;
}  else if (operator == '/') {
    output = firstNumber / secondNumber;
} else if (operator == '^') {
    output = firstNumber ^ secondNumber;
}

alert(firstNumber + operator + secondNumber + ' = ' + output); 
console.log(firstNumber + operator + secondNumber + ' = ' + output); 




// Hello, I tried my best with the calculator but honestly could not wrap my head around how or why to use functions and then case.switching. This is what I managed to figure out at the end.
