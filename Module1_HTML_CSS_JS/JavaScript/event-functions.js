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
