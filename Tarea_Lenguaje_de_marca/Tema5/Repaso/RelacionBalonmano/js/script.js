// =========================
// RELACIÓN 1 — PLANTILLA CON PSEUDOCÓDIGO
// (Deja las constantes y completa las funciones)
// =========================

let jugadorSeleccionado = null;

// ====== CONSTANTES (NO TOCAR) ======
const listaJugadores = document.getElementById("listaJugadores");

const detalleNombre = document.getElementById("detalleNombre");
const detallePosicion = document.getElementById("detallePosicion");
const detalleGoles = document.getElementById("detalleGoles");

const btnSumarGol = document.getElementById("btnSumarGol");
const btnBorrar = document.getElementById("btnBorrar");
const filtroPosicion = document.getElementById("filtroPosicion");

const formNuevoJugador = document.getElementById("formNuevoJugador");
const mensajeForm = document.getElementById("mensajeForm");

// ====== FUNCIONES A IMPLEMENTAR (las más importantes) ======

function quitarSeleccionATodos() {
  /*
  PSEUDOCÓDIGO:
  1) Obtener todas las tarjetas con ".jugador"
  2) Recorrerlas
  3) A cada una, quitarle la clase "seleccionado"
  */
  //Selecciono todos los jugadores y a cada jugador le quito la clase seleccionado
  const tarjetaJugadores = document.querySelectorAll(".jugador");
  for (const jugador of tarjetaJugadores) {
    jugador.classList.remove("seleccionado");
  }
}

function actualizarPanel(jugador) {
  /*
  PSEUDOCÓDIGO:
  SI jugador existe:
    1) Leer el nombre desde el DOM (h3.nombre dentro de la tarjeta)
    2) Leer dorsal, posición y goles desde jugador.dataset
       - dorsal: jugador.dataset.dorsal
       - posicion: jugador.dataset.posicion
       - goles: jugador.dataset.goles
    3) Pi (#dorsal)" (o solo nombre, como prefieras)
       - detallePosicion: posicion
       - detalleGoles: goles
  SI NO existe jugador:
    4) Poner "—" en los 3 campos del panel
  */
  if (jugador) {
    const nombre = jugador.querySelector(".nombre").textContent;
    const dorsal = jugador.dataset.dorsal;
    const posicion = jugador.dataset.posicion;
    const goles = jugador.dataset.goles;

    detalleNombre.textContent = nombre + dorsal;
    detallePosicion.textContent = posicion;
    detalleGoles.textContent = goles;
  }
}

function seleccionarJugador(jugador) {
  /*
  PSEUDOCÓDIGO:
  1) Si jugador es null, no hacer nada (o actualizarPanel(null))
  2) Llamar a quitarSeleccionATodos()
  3) Añadir clase "seleccionado" al jugador clicado
  4) Guardarlo en la variable global jugadorSeleccionado
  5) Llamar a actualizarPanel(jugadorSeleccionado)
  */

  //Si jugador no es null
  if (jugador) {
    //Llama a este metodo
    quitarSeleccionATodos();
    //Le añado la clase seleccionado al jugador
    jugador.classList.add("seleccionado");
    // en la variable jugadorSeleccionado guardo el jugador clickado
    jugadorSeleccionado = jugador;
    actualizarPanel(jugadorSeleccionado);
  }
}

function engancharClickTarjeta(tarjeta) {
  /*
  PSEUDOCÓDIGO:
  1) Añadir un addEventListener("click", ...)
  2) Dentro del handler, llamar a seleccionarJugador(tarjeta)
     (ojo: si usas function() puedes usar this)
  */
  //Llama a la funcion seleccionarJugador cuando le de click a una tarjeta
  tarjeta.addEventListener("click", function () {
    seleccionarJugador(this);
  });
}

function engancharClicksJugadoresExistentes() {
  /*
  PSEUDOCÓDIGO:
  1) Seleccionar todas las tarjetas ".jugador"
  2) Recorrerlas
  3) A cada una, llamarle a engancharClickTarjeta(tarjeta)
  */
  const tarjetas = document.querySelectorAll(".jugador");

  for (const tarjeta of tarjetas) {
    engancharClickTarjeta(tarjeta);
  }
}

function sumarGolSeleccionado() {
  /*
  PSEUDOCÓDIGO (dataset + DOM):
  1) Si no hay jugadorSeleccionado -> no hacer nada
  2) Leer goles actuales desde jugadorSeleccionado.dataset.goles
    - Convertir a número (Number(...))
  3) Calcular nuevosGoles = golesActuales + 1
  4) MODIFICAR dataset:
    - jugadorSeleccionado.dataset.goles = String(nuevosGoles)
  5) Actualizar texto visible en:
    - El <strong class="goles"> dentro de la tarjeta
    - detalleGoles en el panel
  */

    if (jugadorSeleccionado) {
      //Cogo los goles actuales del jugador seleccionado
      golesActuales = Number(jugadorSeleccionado.dataset.goles)
      //Hago el calculo
      nuevosGoles = golesActuales + 1
      //Modifico el dataset ah los nuevos goles
      jugadorSeleccionado.dataset.goles = String(nuevosGoles)
      //Al jugador seleccionado a la clase goles le modifico el contenido a los nuevos goles
      jugadorSeleccionado.querySelector(".goles").textContent = nuevosGoles
      //Llamo a detalleGoles que es una constante creada arriba del todo y le cambio el contenido
      detalleGoles.textContent = nuevosGoles
    }
}

function filtrarPorPosicion(valorFiltro) {
  /*
  PSEUDOCÓDIGO:
  1) Obtener todas las tarjetas ".jugador"
  2) Para cada tarjeta:
     - Leer posicionTarjeta = tarjeta.dataset.posicion
     - Si valorFiltro === "todas" -> mostrar
     - Si no:
         - Si posicionTarjeta === valorFiltro -> mostrar
         - Si no -> ocultar
  3) Para ocultar/mostrar:
     - style.display = "block" / "none"
     (o "grid"/"flex" según tu CSS, pero en el enunciado vale block)
  */
  //Llamo a todos los jugadores con etiqueta jugador
  const tarjetas = document.querySelectorAll(".jugador")
  // recorro los jugadores
  for (const tarjeta of tarjetas) {
    //Guardo su posicion
    const posicionTarjeta = tarjeta.dataset.posicion
    //Si el filtro es todas se muestran todos los jugadores si no solo los que copinciden con valorFiltro
    if (valorFiltro === "todas") {
      tarjeta.style.display = "block"
    }else{
      if (posicionTarjeta === valorFiltro) {
        tarjeta.style.display = "block"
      }else{
        tarjeta.style.display = "none"
      }
    }
  }
}

function crearTarjetaJugador(nombre, dorsal, posicion, goles) {
  /*
  PSEUDOCÓDIGO (crear nodos + dataset):
  1) Crear <article>
  2) Añadir clase "jugador"
  3) (opcional) poner tabIndex = 0
  4) Asignar dataset:
     - tarjeta.dataset.dorsal = dorsal
     - tarjeta.dataset.posicion = posicion
     - tarjeta.dataset.goles = goles
  5) Crear la estructura interna (puedes usar innerHTML):
     - h3.nombre con el nombre
     - p.meta con dorsal y posicion
     - p.stats con <strong class="goles">goles</strong>
  6) Engancharle click (engancharClickTarjeta)
  7) Devolver la tarjeta creada
  */
  // 1) Pide a JavaScript que fabrique una etiqueta <article> vacía en su memoria.
  const nuevoArticle = document.createElement("article")
  
  // 2) A esa etiqueta vacía, le añade la clase CSS "jugador" para que coja los estilos visuales.
  nuevoArticle.classList.add("jugador")

  // 4) Le guarda en sus "bolsillos secretos" (dataset) los datos que hemos recibido 
  // para poder leerlos más adelante cuando hagamos click o filtremos.
  nuevoArticle.dataset.dorsal = dorsal
  nuevoArticle.dataset.posicion = posicion
  nuevoArticle.dataset.goles = goles

  // 5) Rellena el interior (innerHTML) de la caja vacía del <article> con todo este bloque de HTML.
  // Usa la sintaxis ${variable} para incrustar el valor real que escribió el usuario.
  nuevoArticle.innerHTML = `
  <h3 class="nombre">${nombre}</h3>
  <p class="meta">${dorsal} · <span class="posicion">${posicion}</span>
  <p class="stats">Goles: <strong class="goles">${goles}</strong></p>
  `
  
  // 6) Le pone el "vigía" a esta nueva tarjeta. Si no ponemos esto, el usuario 
  // podría ver al jugador nuevo en pantalla, pero no pasaría nada al hacerle click.
  engancharClickTarjeta(nuevoArticle)
  
  // 7) Entrega el "robot" (la tarjeta) ya terminado y funcional a la función que lo pidió, 
  // para que esa otra función sea la encargada de pegarlo finalmente en la página (appendChild).
  return nuevoArticle
}


function validarNuevoJugador(nombre, dorsal, goles) {
  /*
  PSEUDOCÓDIGO:
  1) Crear boolean ok = true
  2) Si nombre vacío -> ok = false
  3) Si dorsal < 1 o NaN -> ok = false
  4) Si goles < 0 o NaN -> ok = false
  5) Devuelve ok (1 return como máximo)
  */
  let ok = true
  if (nombre === "") {
    ok = false
  }else if (dorsal < 1 || isNaN(dorsal)) {
    ok = false
  }else if (goles < 0 || isNaN(goles)) {
    ok = false
  }
  return ok
}

function mostrarMensajeFormulario(texto) {
  /*
  PSEUDOCÓDIGO:
  1) mensajeForm.textContent = texto
  */
  mensajeForm.textContent = texto
}

function anadirJugadorDesdeFormulario() {
  /*
  PSEUDOCÓDIGO (submit):
  1) Leer valores:
     - nombre (trim)
     - dorsal (Number)
     - posicion (value del select)
     - goles (Number)
  2) Validar con validarNuevoJugador(...)
  3) Si OK:
     - crear tarjeta con crearTarjetaJugador(...)
     - appendChild a listaJugadores
     - reset del form
     - mensaje "ok"
  4) Si NO OK:
     - mensaje de error
  */
  // Lee lo que el usuario escribió en "nombre" y le borra los espacios sueltos de los lados
  const nombre = document.getElementById("nuevoNombre").value.trim()
  // Lee lo escrito en "dorsal" y lo convierte de texto a número matemático
  const dorsal = Number(document.getElementById("nuevoDorsal").value)
  // Lee la opción que ha elegido en el desplegable de posición
  const posicion = document.getElementById("nuevaPosicion").value
  // Lee lo escrito en "goles" y lo convierte de texto a número matemático
  const goles = Number(document.getElementById("nuevosGoles").value)
  // Llama al "portero" para comprobar si los datos son correctos
  if (validarNuevoJugador(nombre, dorsal, goles)) {
    // Si están bien, fabrica la tarjeta HTML con esos datos
    const crearTarjeta = crearTarjetaJugador(nombre, dorsal, posicion, goles)
    // Pega esa tarjeta recién creada al final de la lista en la página web
    listaJugadores.appendChild(crearTarjeta)
    // Vacía todas las cajitas del formulario para dejarlo limpio
    formNuevoJugador.reset()
    // Muestra el mensaje de éxito
    mostrarMensajeFormulario("Jugador añadido")
    
  } else {
    // Si los datos estaban mal (vacíos o letras en vez de números), muestra error
    mostrarMensajeFormulario("Jugador no añadido")
  }
}

function borrarSeleccionado() {
  /*
  PSEUDOCÓDIGO:
  1) Si no hay jugadorSeleccionado -> no hacer nada
  2) Guardar referencia: aBorrar = jugadorSeleccionado
  3) Poner jugadorSeleccionado = null (para evitar líos)
  4) aBorrar.remove()
  5) Buscar el primer ".jugador" que quede
     - Si existe: seleccionarJugador(primero)
     - Si no: actualizarPanel(null)
  */
  // Comprueba si hay algún jugador seleccionado en ese momento para poder borrarlo
  if (jugadorSeleccionado) {
    // Guarda el jugador que vamos a borrar en una variable temporal
    const aBorrar = jugadorSeleccionado
    // Vacía la memoria del programa para indicar que ya no hay nadie seleccionado
    jugadorSeleccionado = null
    // Elimina físicamente la tarjeta de ese jugador de la página web
    aBorrar.remove()
    // Busca cuál es la primera tarjeta de jugador que ha quedado viva en la lista
    primer = document.querySelector(".jugador")
    // Si todavía queda algún jugador en la lista...
    if (primer) {
      // ...selecciona a ese primero automáticamente para que el panel no quede vacío
      seleccionarJugador(primer)
    } else {
      // Si acabas de borrar al último y ya no queda nadie, limpia el panel (pone las rayitas "—")
      actualizarPanel(null)
    }
  }
}

// ====== LISTENERS (NO TOCAR estructura, solo llamar a tus funciones) ======
btnSumarGol.addEventListener("click", function () {
  sumarGolSeleccionado();
});

btnBorrar.addEventListener("click", function () {
  borrarSeleccionado();
});

filtroPosicion.addEventListener("change", function () {
  filtrarPorPosicion(this.value);
});

formNuevoJugador.addEventListener("submit", function (event) {
  event.preventDefault();
  anadirJugadorDesdeFormulario();
});

// ====== INICIO ======
engancharClicksJugadoresExistentes();

// Selección inicial del primer jugador (si existe)
const primerJugador = document.querySelector(".jugador");
if (primerJugador) {
  seleccionarJugador(primerJugador);
} else {
  actualizarPanel(null);
}
