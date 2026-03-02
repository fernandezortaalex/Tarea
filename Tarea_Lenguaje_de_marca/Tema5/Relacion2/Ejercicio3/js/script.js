//Defino la constante noticias
const noticias = document.querySelectorAll(".noticia");
//Recorro todos los parrafos con etiquetas noticias
for (let i = 0; i < noticias.length; i++) {
    //Si es multiplo de dos le cambio el color de fondo y si no le cambio el color
    if (i % 2 == 0) {
        noticias[i].style.backgroundColor = "lightgray";
    }else{
        noticias[i].style.color = "blue";
    }
    //Ah cada noticia le añado el contenido de una llama + el propio contenido
    noticias[i].textContent = "🔥" + noticias[i].textContent
}