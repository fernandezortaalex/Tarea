# 🧠 APUNTES DE HTML — EXAMEN

## 🔹 Estructura básica de una página HTML
```html
<!DOCTYPE html> 
<html lang="es">
<head>
    <meta charset="UTF-8"> <!-- Codificación para acentos y ñ -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- Ajusta la vista en móviles -->
    <meta name="description" content="Descripción breve de la página."> <!-- Descripción que aparece en buscadores -->
    <title>Título de la página</title>
</head>
<body>
    <!-- Contenido visible -->
</body>
</html>
```

---

## 🔹 Estructura de la página

### 🧭 `<header>` — Encabezado
Se usa para mostrar el título principal y la navegación.
```html
<header id="inicio">
    <h1>Nombre del sitio o sección</h1>

    <!-- Lista de enlaces a otras páginas -->
    <ul>
        <li><a href="index.html">Inicio</a></li>
        <li><a href="productos.html">Productos</a></li>
        <li><a href="promociones.html">Promociones</a></li>
        <li><a href="opiniones.html">Opiniones</a></li>
    </ul>

    <!-- Menú interno de navegación -->
    <nav>
        <ul>
            <li><a href="#inicio">Inicio</a></li>
            <li><a href="#productos">Productos</a></li>
            <li><a href="#ofertas">Ofertas</a></li>
            <li><a href="#contacto">Contacto</a></li>
        </ul>
    </nav>
</header>
```
📘 **Notas:**
- `id="inicio"` permite hacer enlaces internos (`href="#inicio"`).  
- `<ul>` crea una lista no ordenada, `<li>` los elementos.  
- `<a>` crea enlaces (internos o externos).

---

### 🧩 `<main>` — Contenido principal
Contiene el cuerpo principal de la web.
```html
<main>
    <section id="descripcion">
        <h2>Subtítulo o descripción</h2>
        <p>Texto explicativo.</p>
    </section>
</main>
```
📘 **Notas:**
- `<section>` agrupa contenido relacionado.
- Cada `id` sirve para anclas o estilos CSS.

---

### 🎥 Multimedia y descargas
```html
<video src="ruta/video.mp4" controls width="200" height="300"></video>
<a href="archivos/catalogo.pdf" download>Descargar catálogo</a>
```
📘 **Notas:**
- `controls` muestra los botones de reproducción.  
- `download` descarga el archivo directamente.

---

### 💬 Opiniones con `<blockquote>`
```html
<blockquote>
    Texto de la opinión.
    <br>-Nombre del cliente
</blockquote>
```
📘 Sirve para citar o destacar comentarios.

---

### 🖼️ Imágenes y figuras
```html
<figure>
    <img src="fotos/imagen.jpg" alt="Descripción de la imagen" width="300" height="200">
    <figcaption>Texto explicativo de la imagen</figcaption>
</figure>
```
📘 **Notas:**
- `alt` es texto alternativo (accesibilidad).
- `<figcaption>` describe la imagen.

---

### 🧾 Listas ordenadas (enumeradas)
```html
<ol>
    <li>Elemento 1</li>
    <li>Elemento 2</li>
    <li>Elemento 3</li>
</ol>
```
📘 Se usa para mostrar pasos, productos, etc.

---

### 📍 Enlaces externos
```html
<a target="_blank" href="https://www.google.com/maps">Ver en Google Maps</a>
```
📘 `target="_blank"` abre en nueva pestaña.

---

### 🧱 Secciones temáticas con enlaces internos
```html
<section id="rebajas">
    <h2>Rebajas</h2>
    <p>Texto descriptivo.</p>
    <a href="#inicio">Volver arriba</a>
</section>
```
📘 Permite moverse dentro de la misma página.

---

### 📱 Redes sociales en el footer
```html
<footer>
    <h2>Redes sociales</h2>
    <ul>
        <li><a target="_blank" href="https://www.instagram.com/">Instagram</a></li>
        <li><a target="_blank" href="https://twitter.com/">Twitter</a></li>
    </ul>
</footer>
```
📘 **Notas:**
- El pie de página suele incluir contacto o redes.  
- `<a href="mailto:correo@ejemplo.com">` crea un enlace para enviar email.

---

### 🧩 Ejemplo de footer con contacto
```html
<footer>
    <h2 id="contacto">Contáctanos</h2>
    <p><a href="mailto:correo@ejemplo.com">reservados &copy;2024 NombreEmpresa</a></p>
</footer>
```

---

## 🧭 RESUMEN GENERAL (para repasar rápido)
| Elemento | Función |
|-----------|----------|
| `<!DOCTYPE html>` | Indica que es HTML5 |
| `<html lang="es">` | Idioma del documento |
| `<head>` | Metadatos y título |
| `<body>` | Contenido visible |
| `<header>` | Encabezado, logo, menú |
| `<nav>` | Navegación principal |
| `<main>` | Contenido central |
| `<section>` | Agrupación temática |
| `<figure>` / `<figcaption>` | Imagen con pie |
| `<video>` | Reproduce vídeos |
| `<a>` | Enlace o descarga |
| `<blockquote>` | Opinión o cita |
| `<ol>` / `<ul>` | Listas ordenadas / no ordenadas |
| `<footer>` | Pie de página con info final |
| (https://placehold.co/1200x600/EEE/00000?text=TEXTO) | generador de fotos | |
