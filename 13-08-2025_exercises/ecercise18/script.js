function calculate(operation) {
  const num1 = parseFloat(document.getElementById("num1").value);
  const num2 = parseFloat(document.getElementById("num2").value);
  const resultEl = document.getElementById("result");

  if (isNaN(num1) || isNaN(num2)) {
    resultEl.textContent = "Result: Please enter valid numbers.";
    return;
  }

  let result;

  switch (operation) {
    case 'add':
      result = num1 + num2;
      break;
    case 'subtract':
      result = num1 - num2;
      break;
    case 'multiply':
      result = num1 * num2;
      break;
    case 'divide':
      if (num2 === 0) {
        resultEl.textContent = "Result: Cannot divide by zero.";
        return;
      }
      result = num1 / num2;
      break;
    default:
      result = "Unknown operation";
  }

  resultEl.textContent = "Result: " + result;
}
