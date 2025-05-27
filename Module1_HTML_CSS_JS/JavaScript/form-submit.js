function sendRegistration(userData) {
  setTimeout(() => {
    fetch("https://mockapi.io/register", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(userData),
    })
      .then(res => res.json())
      .then(data => alert("Registration Successful"))
      .catch(err => alert("Registration Failed"));
  }, 1000);
}