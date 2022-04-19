function changeFontCol() {
  let fontCol = document.getElementById("samplePara").style.color = "red";
}

function changeFontStyle() {
  let fontStyle = document.getElementById("samplePara").style.fontFamily = "monospace, sans-serif";
}

function changeFontDec() {
  let fontDec = document.getElementById("samplePara").style.textDecorationLine = "line-through";
}

function checkForm(){
  let fname = document.getElementById("fname");
  let lname = document.getElementById("lname");
  let femail = document.getElementById("femail");

  if (fname.value != "" && lname.value != "" && femail.value != "") {
    lert(`Hello, ${fname.value} ${lname.value}, your email address ${femail.value} has been submitted`);
  } else {
    alert("Please fill in all sections.");
  }
}

let minimumWage = document.getElementsByName("collectionAge");
for (var i = 0; i < minimumWage.length; i++){
  if (minimumWage[i].checked){
  alert("The minimum wage for your age group is " + minimumWage[i].value);
    break;
  }
}
