//today's weather
const degreesKelvin = 293;

// kelvin into celsius
const degreesCelcius = (degreesKelvin - 273);

//temperature into fahrenheit
let degreesFahrenheit = (degreesCelcius * (9/5) + 32);

//rounding fahrenheit into an integer
let myFahrenheit = Math.floor(degreesFahrenheit);

console.log(`The temperature is ${myFahrenheit} degrees Fahrenheit.`);
