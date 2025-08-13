function updateCounter() {
  const maxLength = 50;
  const input = document.getElementById("myInput");
  const remaining = maxLength - input.value.length;

  document.getElementById("charCount").innerHTML = remaining + " characters remaining";
}