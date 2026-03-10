const elementoLista = document.getElementsByTagName("li")

for (const element of elementoLista) {
    element.style.border = "3px solid red"
}

const boton = document.getElementById("marcarFrutas")

boton.addEventListener("click", function () {
    for (const element of elementoLista) {
        element.style.backgroundColor = "green"
        element.append("✅")
    }
})