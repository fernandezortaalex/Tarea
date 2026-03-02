// 1. Capturamos el elemento contenedor (el padre) donde se encuentran los integrantes
let integrantes = document.getElementById("integrantes");

// 2. Creamos un nuevo elemento de lista (<li>) en la memoria del navegador
const nuevoParrafo = document.createElement("li");

// 3. Asignamos el texto al nuevo elemento y lo insertamos dentro del contenedor
nuevoParrafo.textContent = "Trompetista";
integrantes.appendChild(nuevoParrafo);

// 4. Obtenemos una colección de todos los elementos <li> que hay dentro de integrantes
const items = integrantes.getElementsByTagName("li");

// 5. Recorremos la lista para buscar un texto específico y eliminar el elemento coincidente
for (const elemento of items) {
    // Si el texto del elemento es exactamente "Batería", lo eliminamos del DOM
    if (elemento.textContent === "Batería") {
        integrantes.removeChild(elemento);
    }
}