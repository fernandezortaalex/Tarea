function mostrarAlerta(){
    alert("¡Siente la Energía de Burn!")
}

const imagenMensaje = document.getElementById("imgClick")
imagenMensaje.addEventListener("click", mostrarAlerta)

//Ejercicio2
function cambiarImagen(event) {
    //guarda la informacion que le llega en una constante
    const imagenACambiar  = event.target
    //Crea un compartimiento de memoria llamado original y guarda la imagen ahi
    imagenACambiar.dataset.original = imagen.src
    imagenACambiar.src ="https://picsum.photos/id/238/200/300"
}

function restablecerImagen(event){
    const imagenACambiar = event.target
    imagenACambiar.src = imagen.dataset.original
}

const imagen = document.getElementById("imgHover")
const imagenOriginal = cambiarImagen.src

imagen.addEventListener("mouseover", cambiarImagen)
imagen.addEventListener("mouseout", restablecerImagen)

//Ejercicio3

function mostrarTeclas(event){
    console.log("La tecla presionada es " + event.key);
    
}

const teclas = document.getElementById("campoTexto")
teclas.addEventListener("keydown", mostrarTeclas)

//Ejercicio4
function imprimirFormulario(event) {
    event.preventDefault();
    //Creo el nombre al cual le introduzco el texto y .value
    const nombre = textoIntroducido.value
    // Para añadir a resultado texto utilizo innerHTML
    resultado.innerHTML += "<br>nombre</br>"
}
//Llamo al id del formulario
const formulario = document.getElementById("formulario")
const textoIntroducido = document.getElementById("nombre")

const resultado = document.getElementById("resultado")

formulario.addEventListener("submit", imprimirFormulario)

//Ejercicio5
const codigo = getElementById