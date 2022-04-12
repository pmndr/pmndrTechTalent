// user input
let temperature = prompt("In Celcius, what is the temperature?");
let condition = prompt(
  "What are the weather conditions? Choose from: sunny, cloudy, raining, snowing, thunder"
);

// script for calculating variables
if (temperature >= 10 && temperature < 20) {
  switch (condition) {
    case "sunny":
      goToWork = "have a nice day! dont forget sunscreen";
      break;
    case "cloudy":
      goToWork = "bit gloomy, but off you go!";
      break;
    case "raining":
      goToWork = "na, leave it - no one likes being cold and wet";
      break;
    case "snowing":
      goToWork = "na, stay inside and drink some soup";
      break;
    case "thunder":
      goToWork = "...do you have a death wish?? you work with metal!";
      break;
    default:
      goToWork = "lets get this bread!";
      break;
  }
} else if (temperature > 20 && temperature < 30) {
  switch (condition) {
    case "sunny":
      goToWork = "have a nice day! dont forget sunscreen";
      break;
    case "cloudy":
      goToWork = "bit gloomy, but off you go!";
      break;
    case "raining":
      goToWork = "well, being warm and wet isn't the worst";
      break;
    case "snowing":
      goToWork =
        "what? no dont go, the weather is too weird, something nefarious is definitely happening";
      break;
    case "thunder":
      goToWork = "...do you have a death wish?? you work with metal!";
      break;
    default:
      goToWork = "lets get this bread!";
      break;
  }
} else if (temperature > 30) {
  switch (condition) {
    case "snowing":
      goToWork =
        "what? no dont go, the weather is too weird, something nefarious is definitely happening";
      break;
    case "sunny":
    case "cloudy":
    case "raining":
    case "thunder":
    default:
      goToWork = "no way, its way too hot to work properly";
      break;
  }
} else if (temperature < 10) {
  switch (condition) {
    case "snowing":
    case "sunny":
    case "cloudy":
    case "raining":
    case "thunder":
    default:
      goToWork = "no way, its way too cold to work properly";
      break;
  }
} else {
    goToWork = "Have fun building your secret lab!"
}

// script output
let workInstructions = alert(`${goToWork}`);
