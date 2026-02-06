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
for (const element of elementboton) {
    element.style.backgroundColor = "red"
    
}