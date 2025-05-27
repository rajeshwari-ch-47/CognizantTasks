// event-data.js

// Sample event list
const events = [
  { name: "Music Fest", date: "2025-07-01", category: "Music", seats: 10 },
  { name: "Art Fair", date: "2025-08-10", category: "Art", seats: 0 },
  { name: "Baking Workshop", date: "2025-09-05", category: "Workshop", seats: 15 },
  { name: "Tech Meetup", date: "2025-06-25", category: "Technology", seats: 25 },
  { name: "Yoga Class", date: "2025-07-15", category: "Wellness", seats: 20 },
];

// Utility functions
function getUpcomingEvents() {
  const today = new Date().toISOString().split("T")[0];
  return events.filter(event => event.date > today && event.seats > 0);
}

function getEventsByCategory(category) {
  return events.filter(event => event.category === category);
}

function findEventByName(name) {
  return events.find(event => event.name.toLowerCase() === name.toLowerCase());
}

function registerToEvent(eventName) {
  const event = findEventByName(eventName);
  if (!event) {
    throw new Error("Event not found");
  }
  if (event.seats <= 0) {
    throw new Error("No seats available");
  }
  event.seats--;
  return event;
}

// Export if using modules (optional, if you're using <script type="module">)
// export { events, getUpcomingEvents, getEventsByCategory, findEventByName, registerToEvent };
