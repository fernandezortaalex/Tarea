const animales = document.getElementsByClassName("animal")

for (const animal of animales) {
    animal.style.backgroundColor = "red";
}

const boton = document.getElementById("resaltarAnimales")

boton.addEventListener("click", function() {
    for (const animal of animales) {
        animal.style.color = "green";
    }
})