/*user interaction*/
var userName = prompt("What is your name?");

alert(null ? "Hello!" : `Hello, ${userName}`);

var userQuestion = prompt(
  "Look into the Magic Eight Ball... what is your question?"
);

alert(
  `${userName}, your question is: ${userQuestion} The Magic Eight Ball says:`
);

/*Random no generator* for magic 8 ball*/
let randomNumber = Math.floor(Math.random() * 8);

/* Magic 8 Ball answers*/
if (randomNumber == 0) {
  var eightBall = alert("It is certain");
} else if (randomNumber == 1) {
  var eightBall = alert("It is decidedly so");
} else if (randomNumber == 2) {
  var eightBall = alert("Reply hazy, try again");
} else if (randomNumber == 3) {
  var eightBall = alert("Cannot predict now");
} else if (randomNumber == 4) {
  var eightBall = alert("Do not count on it");
} else if (randomNumber == 5) {
  var eightBall = alert("My sources say no");
} else if (randomNumber == 6) {
  var eightBall = alert("Outlook not so good");
} else if (randomNumber == 7) {
  var eightBall = alert("Signs point to yes");
} else {
  var eightBall = alert("Try again later");
}
