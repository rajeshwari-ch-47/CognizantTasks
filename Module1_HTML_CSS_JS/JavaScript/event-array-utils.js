const eventList = ["Music", "Art", "Workshop"];
eventList.push("Seminar");
const musicOnly = eventList.filter(name => name.includes("Music"));
const formatted = eventList.map(name => `Workshop on ${name}`);