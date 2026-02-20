/**
 * Creo una constante para todos los elementos de la clase animal
 */
const elemento = document.getElementsByClassName("animal")
const elementboton = document.getElementById("resaltarAnimales")
/**
 * Para cada elemento de esa clase le pongo un color de fondo
 */
for (const element of elemento) {
    element.style.backgroundColor = "lightyellow"
}
/**
 * Asociamos a la constante creada para el boton que si escucha un evento de tipo
 * "click" cambie el color de fondo para cada elemento de esa clase
 */
elementboton.addEventListener("click", function (){
    for (const element of elemento) {
    element.style.backgroundColor = "red"
}
} )