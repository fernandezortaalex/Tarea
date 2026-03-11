let productoActivo = null;

// ===== CONSTANTES =====
const zonaProductos = document.getElementById("zonaProductos");
const resumenNombre = document.getElementById("resumenNombre");
const resumenSeccion = document.getElementById("resumenSeccion");
const resumenUnidades = document.getElementById("resumenUnidades");

const btnAnadirUnidad = document.getElementById("btnAnadirUnidad");
const btnPasarPedido = document.getElementById("btnPasarPedido");
const filtroSeccion = document.getElementById("filtroSeccion");

const listaPedido = document.getElementById("listaPedido");

const formNuevoProducto = document.getElementById("formNuevoProducto");
const mensajeForm = document.getElementById("mensajeForm");

// ===== FUNCIONES =====

function quitarActivoATodos() {
  /*
  1. Seleccionar todos los elementos ".producto"
  2. Recorrerlos
  3. Quitar la clase "activo" a todos
  */
    const todosElementos = document.querySelectorAll(".producto")
    for (const elemento of todosElementos) {
        elemento.classList.remove("activo")
    }
}

function actualizarResumen(producto) {
  /*
  SI producto existe:
    1. Leer el nombre desde ".nombre"
    2. Leer la sección desde producto.dataset.seccion
    3. Leer las unidades desde producto.dataset.unidades
    4. Pintar esos datos en el resumen
  SI no existe:
    5. Poner "—" en los tres campos
  */
    if (producto) {
        const nombre = producto.querySelector(".nombre").textContent
        const seccion = producto.dataset.seccion
        const unidades = producto.dataset.unidades
        resumenNombre.textContent = nombre
        resumenSeccion.textContent = seccion
        resumenUnidades.textContent = unidades
    }else{
        resumenNombre.textContent = "--"
        resumenSeccion.textContent = "--"
        resumenUnidades.textContent = "--"

    }
}

function seleccionarProducto(producto) {
  /*
  1. Si producto no existe, no hacer nada
  2. Quitar la clase activa al resto
  3. Añadir la clase "activo" al producto pulsado
  4. Guardarlo en la variable global productoActivo
  5. Actualizar el resumen
  */
    if (producto) {
        quitarActivoATodos()
        producto.classList.add("activo")
        productoActivo = producto
        actualizarResumen(productoActivo)
    }
}

function engancharClickProducto(producto) {
  /*
  1. Añadir un evento click al producto
  2. Dentro del evento, llamar a seleccionarProducto(producto)
  */
    producto.addEventListener("click", function () {
        seleccionarProducto(producto)
    })
}

function prepararProductosExistentes() {
  /*
  1. Seleccionar todos los productos ".producto"
  2. Recorrerlos
  3. Llamar a engancharClickProducto en cada uno
  */
    const todosProducto = document.querySelectorAll(".producto")
    for (const producto of todosProducto) {
        engancharClickProducto(producto)
    }
}

function anadirUnidadAlActivo() {
  /*
  1. Si no hay producto activo, no hacer nada
  2. Leer las unidades desde productoActivo.dataset.unidades
  3. Convertir el valor a número
  4. Sumar 1
  5. Guardar el nuevo valor en dataset
  6. Actualizar el texto visible dentro de ".unidades"
  7. Actualizar el resumen
  */
    if (productoActivo) {
        const unidades = Number(productoActivo.dataset.unidades)
        const aniadirUnidades = unidades + 1
        productoActivo.dataset.unidades = aniadirUnidades
        productoActivo.querySelector(".unidades").textContent = aniadirUnidades
        actualizarResumen(productoActivo)
    }
}

function filtrarProductos(valorFiltro) {
  /*
  1. Seleccionar todos los productos ".producto"
  2. Recorrerlos
  3. Leer la sección de cada producto con dataset.seccion
  4. Si valorFiltro es "Todas", mostrar todos
  5. Si no, mostrar solo los que coincidan
  6. Ocultar los demás
  */
    const todosProductos = document.querySelectorAll(".producto")
    for (const producto of todosProductos) {
        const seccion = producto.dataset.seccion
        if (valorFiltro === "Todas") {
            producto.style.display = "block"
        }else{
            if (seccion === valorFiltro) {
                producto.style.display = "block"
            }else{
                producto.style.display = "none"
            }
        }
    }
}

function crearLineaPedido(producto) {
  /*
  1. Crear un elemento li
  2. Leer nombre, sección y unidades del producto
  3. Construir un texto tipo:
     "Arroz redondo - Despensa - 2 unidades"
  4. Asignar el texto al li
  5. Devolver el li
  */
    const elemento = document.createElement("li")
    const nombre = producto.querySelector(".nombre").textContent
    const seccion = producto.dataset.seccion
    const unidades = producto.dataset.unidades

    elemento.textContent = `
    ${nombre} - ${seccion} - ${unidades}`

    return elemento
}

function pasarProductoAPedido() {
  /*
  1. Si no hay producto activo, no hacer nada
  2. Crear una línea llamando a crearLineaPedido(productoActivo)
  3. Añadir esa línea al final de #listaPedido
  */
    if (productoActivo) {
        listaPedido.appendChild(crearLineaPedido(productoActivo))
    }
}

function crearProducto(nombre, seccion, unidades) {
  /*
  1. Crear un div
  2. Añadir la clase "producto"
  3. Añadir tabindex = 0
  4. Guardar seccion y unidades en dataset
  5. Crear el contenido interno:
     - h3.nombre
     - p.seccion
     - p.cantidad con strong.unidades
  6. Enganchar el click del nuevo producto
  7. Devolver el producto creado
  */
    const elemento = document.createElement("div")
    elemento.classList.add("producto")
    elemento.tabIndex = 0

    elemento.dataset.seccion = seccion
    elemento.dataset.unidades = unidades

    elemento.innerHTML = `
    <h3 class="nombre">${nombre}</h3>
    <p class="seccion">Sección: <span>${seccion}</span></p>
    <p class="cantidad">Pedidas: <strong class="unidades">${unidades}</strong></p>
    `
    engancharClickProducto(elemento)
    return elemento

}

function validarProducto(nombre, unidades) {
  /*
  1. Crear variable ok = true
  2. Si el nombre está vacío, ok = false
  3. Si unidades es menor que 0 o no es número, ok = false
  4. Devolver ok
  */
    let ok = true
    if (nombre === "") {
    ok = false
    }else if (unidades < 0 || isNaN(unidades)) {
        ok = false
    }
    return ok
}

function anadirProductoDesdeFormulario() {
  /*
  1. Leer nombre, sección y unidades del formulario
  2. Hacer trim en el nombre
  3. Convertir unidades a número
  4. Validar
  5. Si es correcto:
      - crear producto
      - añadirlo a zonaProductos
      - resetear el formulario
      - mostrar mensaje correcto
  6. Si no es correcto:
      - mostrar mensaje de error
  */
    const nombre = document.getElementById("nuevoNombre").value.trim()
    const seccion = document.getElementById("nuevaSeccion").value
    const unidades = Number(document.getElementById("nuevasUnidades").value)

    if (validarProducto(nombre, unidades)) {
        const crearTarjeta = crearProducto(nombre, seccion, unidades)
        zonaProductos.appendChild(crearTarjeta)
        formNuevoProducto.reset()
        mensajeForm.textContent = "Producto creado"
    }else{
        mensajeForm.textContent = "Producto no creado"
    }
}

// ===== EVENTOS =====

btnAnadirUnidad.addEventListener("click", function () {
  /*
  llamar a la función para añadir una unidad
  */
    anadirUnidadAlActivo();
});

btnPasarPedido.addEventListener("click", function () {
  /*
  llamar a la función para pasar el producto al pedido
  */
    pasarProductoAPedido();

});

filtroSeccion.addEventListener("change", function () {
  /*
  llamar a la función de filtrar usando this.value
  */
    filtrarProductos(this.value);
});

formNuevoProducto.addEventListener("submit", function (event) {
  /*
  1. Evitar el envío del formulario
  2. Llamar a la función para añadir producto
  */
    event.preventDefault();
    anadirProductoDesdeFormulario();
});

// ===== INICIO =====
/*
1. Preparar los productos existentes
2. Seleccionar el primer producto si existe
3. Si no existe, limpiar el resumen
*/
prepararProductosExistentes()
const primerProducto = document.querySelector(".producto")

if (primerProducto) {
    seleccionarProducto(primerProducto)
}else{
    actualizarResumen(primerProducto)
}