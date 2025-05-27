// File: event-api-fetch.js
function fetchEvents() {
  return fetch("events.json")
    .then(res => res.json())
    .then(data => console.log(data))
    .catch(err => console.error("Fetch error", err));
}
async function loadEvents() {
  document.getElementById("loading").style.display = "block";
  try {
    const res = await fetch("events.json");
    const data = await res.json();
    console.log(data);
  } catch (e) {
    console.error(e);
  } finally {
    document.getElementById("loading").style.display = "none";
  }
}