// Dark mode script
function darkMode() {
  var darkMode = document.body;
  darkMode.classList.toggle("dark-mode");
}

// Blog entry submission script
const blog = document.getElementById('blog')
const name = document.getElementById('entryName')
const author = document.getElementById('authorName')
const entry = document.getElementById('blogContent')
const form = document.getElementById('submissionForm')

// prevent form from reloading
form.addEventListener('submit', function (e) {
  e.preventDefault();
})
// submission form validation

function validateForm() {
  let x = document.forms["submissionForm"]["entryName"].value;
  if (x == "") {
    alert("Please give your entry a title.");
    return false;
  }
  let y = document.forms["submissionForm"]["authorName"].value;
  if (y == "") {
    alert("Please enter your name.");
    return false;
  }
  let z = document.forms["submissionForm"]["blogContent"].value;
  if (z == "") {
    alert("Please complete the submission form in full.");
    return false;
  }

}

// print from form
function submitForm() {
  let inputEntry = document.getElementById("entryName").value;
  document.getElementById("newTitle").innerHTML = inputEntry;
  document.getElementById("newTitle").style.fontSize = "20pt";
  document.getElementById("newTitle").style.fontFamily = "Square Peg, cursive";
  document.getElementById("newTitle").style.textDecoration = "underline";
  let inputAuthor = document.getElementById("authorName").value;
  document.getElementById("newAuthor").innerHTML = inputAuthor;
  document.getElementById("newAuthor").style.fontSize = "12pt";
  document.getElementById("newAuthor").style.fontweight = "bold";
  let inputBlog = document.getElementById("blogContent").value;
  document.getElementById("newEntry").innerHTML = inputBlog;
}
