// File: event-interaction.js
document.getElementById("registerBtn").onclick = () => {
  alert("Registered!");
};
document.getElementById("categorySelect").onchange = e => {
  console.log(`Selected: ${e.target.value}`);
};
document.getElementById("searchInput").onkeydown = e => {
  console.log(`Key pressed: ${e.key}`);
};
