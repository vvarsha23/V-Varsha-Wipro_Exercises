function validateEmail() {
  const emailInput = document.getElementById("email");
  const emailError = document.getElementById("emailError");
  const email = emailInput.value.trim();
  const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

  if (email === "") {
    emailError.textContent = "Email cannot be empty.";
    return false;
  } else if (!emailPattern.test(email)) {
    emailError.textContent = "Please enter a valid email.";
    return false;
  } else {
    emailError.textContent = "";
    return true;
  }
}

function validatePassword() {
  const passwordInput = document.getElementById("password");
  const passwordError = document.getElementById("passwordError");
  const password = passwordInput.value.trim();

  if (password === "") {
    passwordError.textContent = "Password cannot be empty.";
    return false;
  } else {
    passwordError.textContent = "";
    return true;
  }
}

function validateForm() {
  const isEmailValid = validateEmail();
  const isPasswordValid = validatePassword();

  if (isEmailValid && isPasswordValid) {
    alert("Login successful (if this were real)!");
  }
}
