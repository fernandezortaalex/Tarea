const albumes = document.getElementById("albumes")
const nuevoParrafo = document.createElement("li")
nuevoParrafo.textContent = "Xapomelon - La Pegatina"

const talco = document.getElementById("talco")
albumes.insertBefore(nuevoParrafo, talco)

const nuevoParrafo1 = document.createElement("li")
nuevoParrafo1.textContent = "Xapomelon - La Pegatina"
albumes.appendChild(nuevoParrafo1)
