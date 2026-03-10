const lista = document.getElementById("integrantes")

const nuevoIntegrante = document.createElement("li")
nuevoIntegrante.textContent = "Trompetista"
lista.appendChild(nuevoIntegrante)

const items = lista.getElementsByTagName("li");


for (let i = 0; i < items.length; i++) {
    if (items[i].textContent == "Batería") {
        lista.removeChild(items[i]);
    }
    
}