function greet(name = "User") {
  console.log(`Welcome, ${name}`);
}
const eventObj = { name: "Music Night", date: "2025-07-20" };
const { name, date } = eventObj;
const copied = [...eventList];