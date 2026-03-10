const precios = document.querySelectorAll(".precio")

for (const precio of precios) {
    precio.style.fontWeight = "bold"
    if (precio.textContent > 50) {
        precio.style.color = "red"
    }
}
