const today = new Date().toISOString().split("T")[0];
function getValidEvents() {
  return events.filter(event => event.date > today && event.seats > 0);
}
function safeRegister(event) {
  try {
    if (event.seats <= 0) throw new Error("Event is full!");
    event.seats--;
  } catch (err) {
    console.error(err.message);
  }
}