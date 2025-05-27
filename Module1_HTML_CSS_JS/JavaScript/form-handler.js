// File: form-handler.js
document.getElementById("registerForm").addEventListener("submit", e => {
  e.preventDefault();
  const { name, email, event } = e.target.elements;
  if (!name.value || !email.value) {
    document.getElementById("error").textContent = "All fields required";
    return;
  }
  console.log(`Registered ${name.value} for ${event.value}`);
});