const primerBoton  = document.querySelector(".boton")
const todosLosBotones = document.querySelectorAll(".boton")
const botonCambiarEstilo = document.getElementById("cambiarEstilo")

botonCambiarEstilo.addEventListener("click", function () {
    // todosLosBotones.style.backgroundColor = "red"
    for (const boton of todosLosBotones) {
        boton.style.backgroundColor = "red"
    }
})