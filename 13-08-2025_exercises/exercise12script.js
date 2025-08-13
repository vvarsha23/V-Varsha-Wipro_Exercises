function checkPalindrome() {
  const input = document.getElementById("inputText").value;
  const cleaned = input.replace(/[^a-zA-Z0-9]/g, "").toLowerCase();
  const reversed = cleaned.split("").reverse().join("");
  const isPalindrome = cleaned === reversed;
  document.getElementById("result").textContent = isPalindrome
    ? `"${input}" is a palindrome!`
    : `"${input}" is NOT a palindrome.`;
}
