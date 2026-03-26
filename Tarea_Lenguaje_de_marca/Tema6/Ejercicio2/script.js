// 🌐 Guardamos la URL base de la API para no tener que escribirla entera cada vez
const URL_BASE = "https://restcountries.com/v3.1";

// 🎯 SELECCIÓN DE ELEMENTOS DEL DOM (HTML)
// Guardamos en variables los formularios, inputs y contenedores de resultados
// para poder leer lo que escribe el usuario y mostrarle los datos después.

// Para la búsqueda por nombre
const formNombre = document.getElementById("form-nombre");
const inputNombre = document.getElementById("input-nombre");
const resultadoNombre = document.getElementById("resultado-nombre");

// Para la búsqueda por región (botones)
const botonesRegion = document.querySelectorAll(".btn-region");
const resultadoRegion = document.getElementById("resultado-region");

// Para la búsqueda por capital
const formCapital = document.getElementById("form-capital");
const inputCapital = document.getElementById("input-capital");
const resultadoCapital = document.getElementById("resultado-capital");

// Para la búsqueda por código de país
const formCodigo = document.getElementById("form-codigo");
const inputCodigo = document.getElementById("input-codigo");
const resultadoCodigo = document.getElementById("resultado-codigo");

// Para mostrar todos los países
const btnTodos = document.getElementById("btn-todos");
const resultadoTodos = document.getElementById("resultado-todos");

// 🔹 UTILIDADES (Funciones de ayuda que usamos varias veces)

// 🧹 Vacía el contenido de un elemento HTML. Útil antes de mostrar nuevos resultados.
function limpiarContenedor(contenedor) {
    contenedor.innerHTML = "";
}

// ⚠️ Muestra un mensaje de error en pantalla si algo falla o no se encuentra.
function mostrarError(contenedor, mensaje) {
    contenedor.innerHTML = `<p class="mensaje-error">${mensaje}</p>`;
}

// 📡 FUNCIÓN CORAZÓN: Se conecta a la API para descargar los datos.
// Usamos 'async/await' porque la respuesta de internet toma un tiempo.
async function obtenerDatos(url) {
    let datos = null;

    try {
        // fetch() hace la llamada a internet a la URL que le pasemos
        const respuesta = await fetch(url);

        // Si la respuesta es exitosa (código 200-299), convertimos la respuesta a formato JSON
        if (respuesta.ok) {
            datos = await respuesta.json();
        } else {
            // Si hay error (ej. error 404 de país no encontrado), forzamos un fallo
            throw new Error("Error");
        }

    } catch (error) {
        // Mostramos el error en la consola oculta para los desarrolladores
        console.error(error);
    }

    // Devuelve los datos listos para usar (o 'null' si falló)
    return datos;
}

// 🔹 EXTRACCIÓN DE DATOS (Limpian y preparan datos complejos de la API)

// Extrae la capital (si existe) y la convierte en texto
function obtenerCapital(pais) {
    let resultado = "No disponible";
    if (pais.capital) {
        resultado = pais.capital.join(", "); // Une los elementos de la lista con comas
    }
    return resultado;
}

// Extrae los idiomas y los devuelve como texto
function obtenerIdiomas(pais) {
    let resultado = "No disponible";
    if (pais.languages) {
        resultado = Object.values(pais.languages).join(", ");
    }
    return resultado;
}

// Extrae el nombre y símbolo de las monedas
function obtenerMonedas(pais) {
    let resultado = "No disponible";
    if (pais.currencies) {
        let texto = "";
        // Recorre cada moneda para formatearla: "Euro (€), Dólar ($)"
        Object.values(pais.currencies).forEach(moneda => {
            const nombre = moneda.name || "Sin nombre";
            const simbolo = moneda.symbol ? ` (${moneda.symbol})` : "";
            texto += `${nombre}${simbolo}, `;
        });
        // Le quita la coma y el espacio que sobran al final
        resultado = texto.slice(0, -2); 
    }
    return resultado;
}

function obtenerContinentes(pais) {
    let resultado = "No disponible";
    if (pais.continents) {
        resultado = pais.continents.join(", ");
    }
    return resultado;
}

function obtenerZonasHorarias(pais) {
    let resultado = "No disponible";
    if (pais.timezones) {
        resultado = pais.timezones.join(", ");
    }
    return resultado;
}

// 🔹 TARJETAS (Generan el código HTML visual para inyectarlo en la web)

// Tarjeta grande con todos los detalles (se usa al buscar por nombre)
function crearTarjetaDetallePais(pais) {
    let html = `
        <article class="tarjeta-detalle">
            <img src="${pais.flags.svg}">
            <div>
                <h3>${pais.name.common}</h3>
                <p><strong>Nombre oficial:</strong> ${pais.name.official}</p>
                <p><strong>Capital:</strong> ${obtenerCapital(pais)}</p>
                <p><strong>Región:</strong> ${pais.region}</p>
                <p><strong>Subregión:</strong> ${pais.subregion || "No disponible"}</p>
                <p><strong>Población:</strong> ${pais.population.toLocaleString()}</p>
                <p><strong>Idiomas:</strong> ${obtenerIdiomas(pais)}</p>
                <p><strong>Monedas:</strong> ${obtenerMonedas(pais)}</p>
            </div>
        </article>
    `;
    return html;
}

// Tarjeta pequeña para listar varios países (ej. buscar por región)
function crearTarjetaRegion(pais) {
    let html = `
        <article class="tarjeta">
            <img src="${pais.flags.svg}">
            <h3>${pais.name.common}</h3>
            <p>Capital: ${obtenerCapital(pais)}</p>
            <p>Población: ${pais.population.toLocaleString()}</p>
        </article>
    `;
    return html;
}

// Tarjeta enfocada en la capital, incluye enlace a Google Maps
function crearTarjetaCapital(pais) {
    let html = `
        <article class="tarjeta-detalle">
            <img src="${pais.flags.svg}">
            <div>
                <h3>${pais.name.common}</h3>
                <p>Capital: ${obtenerCapital(pais)}</p>
                <p>Región: ${pais.region}</p>
                <a href="${pais.maps.googleMaps}" target="_blank">Ver mapa</a>
            </div>
        </article>
    `;
    return html;
}

// Tarjeta que muestra los códigos internacionales del país (CCA2 y CCA3)
function crearTarjetaCodigo(pais) {
    let html = `
        <article class="tarjeta-detalle">
            <img src="${pais.flags.svg}">
            <div>
                <h3>${pais.name.common}</h3>
                <p>CCA2: ${pais.cca2}</p>
                <p>CCA3: ${pais.cca3}</p>
                <p>Continentes: ${obtenerContinentes(pais)}</p>
                <p>Zonas horarias: ${obtenerZonasHorarias(pais)}</p>
            </div>
        </article>
    `;
    return html;
}

// Tarjeta simple para la lista general de países
function crearTarjetaListaRapida(pais) {
    let html = `
        <article class="tarjeta">
            <img src="${pais.flags.svg}">
            <h3>${pais.name.common}</h3>
            <p>Capital: ${obtenerCapital(pais)}</p>
            <p>Población: ${pais.population.toLocaleString()}</p>
        </article>
    `;
    return html;
}

// 🔹 FUNCIONES PRINCIPALES (Lógica de cada tipo de búsqueda)

// Busca un país específico por su nombre (ej. "mexico")
async function buscarPaisPorNombre(nombre) {
    limpiarContenedor(resultadoNombre); // Limpiamos pantalla antigua

    if (!nombre) {
        mostrarError(resultadoNombre, "Introduce un país"); // Validamos que el input no esté vacío
    } else {
        // Pedimos los datos a la API añadiendo el nombre a la URL
        const datos = await obtenerDatos(`${URL_BASE}/name/${nombre}`);

        if (datos) {
            // La API devuelve una lista de resultados, cogemos el primero [0] y lo pintamos
            resultadoNombre.innerHTML = crearTarjetaDetallePais(datos[0]);
        } else {
            mostrarError(resultadoNombre, "País no encontrado");
        }
    }
}

// Busca todos los países de una región (ej. "europe")
async function buscarPorRegion(region) {
    limpiarContenedor(resultadoRegion);

    const datos = await obtenerDatos(`${URL_BASE}/region/${region}`);

    if (datos) {
        let html = "";
        // Limitamos a 12 países (.slice) para no saturar la pantalla, y acumulamos el HTML
        datos.slice(0, 12).forEach(pais => {
            html += crearTarjetaRegion(pais);
        });
        resultadoRegion.innerHTML = html; // Inyectamos todo de golpe
    } else {
        mostrarError(resultadoRegion, "Error al cargar región");
    }
}

// Busca qué país tiene cierta capital (ej. "madrid")
async function buscarPorCapital(capital) {
    limpiarContenedor(resultadoCapital);

    if (!capital) {
        mostrarError(resultadoCapital, "Introduce una capital");
    } else {
        const datos = await obtenerDatos(`${URL_BASE}/capital/${capital}`);

        if (datos) {
            resultadoCapital.innerHTML = crearTarjetaCapital(datos[0]);
        } else {
            mostrarError(resultadoCapital, "Capital no encontrada");
        }
    }
}

// Busca un país por su código internacional (ej. "ES", "US", "COL")
async function buscarPorCodigo(codigo) {
    limpiarContenedor(resultadoCodigo);

    if (!codigo) {
        mostrarError(resultadoCodigo, "Introduce un código");
    } else {
        const datos = await obtenerDatos(`${URL_BASE}/alpha/${codigo}`);

        if (datos) {
            // A veces la API devuelve una lista y a veces el país directo, nos aseguramos de tratarlo bien
            //Si es un array te lo saca datos[0] y si no datos
            const pais = Array.isArray(datos) ? datos[0] : datos;
            resultadoCodigo.innerHTML = crearTarjetaCodigo(pais);
        } else {
            mostrarError(resultadoCodigo, "Código no válido");
        }
    }
}

// Carga una lista rápida de países de todo el mundo
async function cargarTodos() {
    limpiarContenedor(resultadoTodos);

    // Filtramos la URL (?fields=...) para que la API nos mande solo lo necesario y vaya más rápido
    const datos = await obtenerDatos(`${URL_BASE}/all?fields=name,flags,capital,population`);

    if (datos) {
        let html = "";
        datos.slice(0, 12).forEach(pais => {
            html += crearTarjetaListaRapida(pais);
        });
        resultadoTodos.innerHTML = html;
    } else {
        mostrarError(resultadoTodos, "Error al cargar países");
    }
}

// 🔹 EVENTOS (Conectan la interacción del usuario con las funciones que acabamos de ver)

// Cuando el usuario pulsa 'Enter' o hace clic en buscar en el formulario de nombre...
formNombre.addEventListener("submit", e => {
    e.preventDefault(); // Evita que la página web se recargue por completo
    // .trim() quita espacios al principio y final. .toLowerCase() lo pasa a minúsculas
    buscarPaisPorNombre(inputNombre.value.trim().toLowerCase());
});

// A cada botón de la clase ".btn-region" le ponemos un "escuchador" de clics
botonesRegion.forEach(boton => {
    boton.addEventListener("click", () => {
        // Lee el atributo HTML 'data-region' del botón pulsado
        buscarPorRegion(boton.dataset.region);
    });
});

// Cuando se envía el formulario de capital...
formCapital.addEventListener("submit", e => {
    e.preventDefault();
    buscarPorCapital(inputCapital.value.trim().toLowerCase());
});

// Cuando se envía el formulario de código...
formCodigo.addEventListener("submit", e => {
    e.preventDefault();
    buscarPorCodigo(inputCodigo.value.trim().toLowerCase());
});

// Cuando se hace clic en el botón de ver todos...
btnTodos.addEventListener("click", cargarTodos);