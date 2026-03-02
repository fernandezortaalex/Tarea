let precios = document.getElementsByClassName("precio");
let valor;

for (const precio of precios) {
    precio.style.fontWeight = "bold";
    //A calor hago que combierta el texto a numero y que al contenido le quite los espacios(trim)
    valor = parseFloat(precio.textContent.trim());
    if (valor > 50) {
        precio.style.color = "blue";
    }
    
}
