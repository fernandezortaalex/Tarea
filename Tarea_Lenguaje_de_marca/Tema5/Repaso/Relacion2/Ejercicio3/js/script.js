const noticias = document.querySelectorAll(".noticia")

let contador = 0;
for (let i = 0; i < noticias.length; i++) {
    contador++
    noticias[i].textContent= "🔥" + noticias[i].textContent;
    if (contador % 2 == 0) {
        noticias[i].style.color = "blue"
    }else{
        noticias[i].style.backgroundColor = "red"
    }
    
}