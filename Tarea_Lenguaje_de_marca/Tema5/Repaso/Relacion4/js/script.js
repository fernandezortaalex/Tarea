function mostrarAlerta(){
    alert("¡Siente la Energía de Burn!")
}

const imagenMensaje = document.getElementById("imgClick")
imagenMensaje.addEventListener("click", mostrarAlerta)

//Ejercicio2
function cambiarImagen() {
    const nuevaImagen = event.target
}

const imagen = document.getElementById("imgHover")
const imagenOriginal = cambiarImagen.src

imagen.addEventListener("mouseover", cambiarImagen)