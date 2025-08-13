function checkLength() {
  let inputText = document.getElementById("myInput").value;
  let length = inputText.length;
  document.getElementById("result").innerHTML = "Length: " + length;
}
