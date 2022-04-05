/* racer information */
var raceNumber = Math.floor(Math.random() * 1000);
var earlyRegister = true;
let runnerAge = 21;

/*racer ID and timing */
if (earlyRegister == true && runnerAge >= 18) {
  let racerID = raceNumber + 1000;
  console.log(`Racer ID ${racerID}, your race will begin at 9:30am.`);
} else if (runnerAge >= 18 && earlyRegister == false) {
  console.log(`Racer ID ${racerID}, your race will begin at 11:00am.`);
} else if (runnerAge < 18) {
  console.log(`Racer ID ${racerID}, all youth registrants run at 12:20pm`);
} else {
  console.log("Please see the registration desk if you have any queries.");
}
