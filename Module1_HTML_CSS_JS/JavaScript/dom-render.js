// File: dom-render.js
document.addEventListener("DOMContentLoaded", () => {
  const container = document.querySelector("#eventContainer");
  events.forEach(ev => {
    const div = document.createElement("div");
    div.textContent = `${ev.name} - ${ev.date}`;
    container.appendChild(div);
  });
});
