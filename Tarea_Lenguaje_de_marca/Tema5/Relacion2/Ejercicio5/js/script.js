const contenedor = document.getElementById("contenedor");
//Creo los elementos parrafos
const nuevoParrafo = document.createElement("p")
const nuevoParrafo1 = document.createElement("p")
const nuevoParrafo2 = document.createElement("p")
//A esos elementos les cambio el contenido
nuevoParrafo.textContent = "Descubren una nueva especie en la selva amazónica."
nuevoParrafo1.textContent = "Avances tecnológicos revolucionan la industria de la salud."
nuevoParrafo2.textContent = "El mercado financiero experimenta grandes cambios."

document.body.appendChild(nuevoParrafo)
document.body.appendChild(nuevoParrafo1)
document.body.appendChild(nuevoParrafo2)