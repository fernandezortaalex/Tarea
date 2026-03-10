const parrafos = document.getElementsByTagName("li")

for (const parrafo of parrafos) {
    parrafo.style.color = "blue"
    parrafo.append("🎶")
}