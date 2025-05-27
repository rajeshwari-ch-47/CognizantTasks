// main.js

// 01 - JavaScript Basics & Setup
console.log("Welcome to the Community Portal");
window.addEventListener("load", () => {
  alert("Page fully loaded");
});

// 02 - Syntax, Data Types, and Operators
const eventName = "Community Meetup";
const eventDate = "2025-06-15";
let availableSeats = 30;
console.log(`${eventName} on ${eventDate} has ${availableSeats} seats available.`);
availableSeats--;

// 03 - Conditionals, Loops, and Error Handling
const events = [
  { name: "Music Fest", date: "2025-07-01", seats: 10 },
  { name: "Art Fair", date: "2024-12-15", seats: 0 },
];
const today = new Date().toISOString().split("T")[0];
events.forEach(event => {
  if (event.date > today && event.seats > 0) {
    console.log(`Upcoming: ${event.name}`);
  }
});
function register(event) {
  try {
    if (event.seats <= 0) throw "Event is full!";
    event.seats--;
  } catch (err) {
    console.error(err);
  }
}

// 04 - Functions, Scope, Closures, Higher-Order Functions
function addEvent(name, date, category) {
  events.push({ name, date, category, seats: 20 });
}
function registerUser(eventName) {
  console.log(`User registered for ${eventName}`);
}
function filterEventsByCategory(category) {
  return events.filter(e => e.category === category);
}
function categoryTracker() {
  let count = 0;
  return () => ++count;
}
const trackMusic = categoryTracker();

// 05 - Objects and Prototypes
function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}
Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};
const musicEvent = new Event("Jazz Night", "2025-07-01", 20);
console.log(Object.entries(musicEvent));

// 06 - Arrays and Methods
const eventList = ["Music", "Art", "Workshop"];
eventList.push("Seminar");
const musicOnly = eventList.filter(name => name.includes("Music"));
const formatted = eventList.map(name => `Workshop on ${name}`);

// 07 - DOM Manipulation
document.addEventListener("DOMContentLoaded", () => {
  const container = document.querySelector("#eventContainer");
  events.forEach(ev => {
    const div = document.createElement("div");
    div.className = "eventCard";
    div.textContent = `${ev.name} - ${ev.date}`;
    container.appendChild(div);
  });
});

// 08 - Event Handling
document.getElementById("registerBtn").onclick = () => {
  alert("Registered!");
};
document.getElementById("categorySelect").onchange = e => {
  console.log(`Selected: ${e.target.value}`);
};
document.getElementById("searchInput").onkeydown = e => {
  console.log(`Key pressed: ${e.key}`);
};

// 09 - Async JS, Promises, Async/Await
function fetchEvents() {
  return fetch("events.json")
    .then(res => res.json())
    .then(data => console.log(data))
    .catch(err => console.error("Fetch error", err));
}
async function loadEvents() {
  const loading = document.getElementById("loading");
  loading.style.display = "block";
  try {
    const res = await fetch("events.json");
    const data = await res.json();
    console.log(data);
  } catch (e) {
    console.error(e);
  } finally {
    loading.style.display = "none";
  }
}

// 10 - Modern JavaScript Features
function greet(name = "User") {
  console.log(`Welcome, ${name}`);
}
const eventObj = { name: "Music Night", date: "2025-07-20" };
const { name, date } = eventObj;
const copied = [...eventList];

// 11 - Working with Forms
document.getElementById("registerForm").addEventListener("submit", e => {
  e.preventDefault();
  const { name, email, event } = e.target.elements;
  if (!name.value || !email.value) {
    document.getElementById("error").textContent = "All fields required";
    return;
  }
  console.log(`Registered ${name.value} for ${event.value}`);
});

// 12 - AJAX & Fetch API
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

// 13 - Debugging and Testing
console.log("Submitting form...");
// Use breakpoints in browser Dev Tools

// 14 - jQuery and JS Frameworks
$(document).ready(() => {
  $('#registerBtn').click(() => alert("jQuery Registered!"));
  $('.eventCard').fadeIn();
});
// Benefit: React or Vue helps in managing UI state more efficiently
