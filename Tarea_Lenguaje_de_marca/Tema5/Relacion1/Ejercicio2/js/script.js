/**
 * Creo la constante para los elementos li y el boton
 */
const frutas = document.getElementsByTagName("li")
const elementBoton = document.getElementById("marcarFrutas")

/**
 * Para cada frutas de li le ponog un borde
 */
for (const fruta of frutas) {
    fruta.style.border = "3px solid red"
}

/**
 * Cuando le de al boton ah cada fruta se le añade al final un tick azul y cambiar el borde
 */
elementBoton.addEventListener("click", function(){
    for (const fruta of frutas) {
        fruta.style.border = "3px solid #ff98a1"
        fruta.textContent += "✅"
    }
})
