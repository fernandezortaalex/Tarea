- [**Como configurar github en tu pc con linux**](#como-configurar-github-en-tu-pc-con-linux)
  - [**¿Que es git?**](#que-es-git)
  - [**Diferencia entre Git y Github**](#diferencia-entre-git-y-github)
  - [**Asociacion de Nombre y correo electronico**](#asociacion-de-nombre-y-correo-electronico)
- [**Instalacion de GitHub Desktop desde windows**](#instalacion-de-github-desktop-desde-windows)
  - [**Descargar GitHub Desktop**](#descargar-github-desktop)
    - [**1 Ve al sitio oficial:**](#1-ve-al-sitio-oficial)
    - [**2 Haz clic en el botón:**](#2-haz-clic-en-el-botón)
    - [**4 Iniciar sesión con GitHub**](#4-iniciar-sesión-con-github)
    - [**5 Configurar tu identidad Git (nombre y correo)**](#5-configurar-tu-identidad-git-nombre-y-correo)
    - [**6. Clonar, crear o agregar repositorios**](#6-clonar-crear-o-agregar-repositorios)

# **Como configurar github en tu pc con linux**

## **¿Que es git?**
Git es un programa que te ayuda a guardar y controlar los cambios en tus archivos, especialmente en proyectos de programación.

## **Diferencia entre Git y Github**
**Git** permite hacer los cambios de los codigos de manera local(offline), facilitandote el poder volver a versiones anteriores

**Github** es la plataforma que aloja los repositorios Git

## **Asociacion de Nombre y correo electronico**

**Instalacion:** instalamos github desktop desde el navegador, lo cual es necesario para que git pueda asociar los cambios que realizas y subirlos a github. Los parametros que tienes que configurar son el nombre y el correo electronico
```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tuemail@ejemplo.com"
```
En mi caso seria 
```bash
git config --global user.name "fernandezortaalex"
git config --global user.email "
fernandezortaalex001.alu@stemgranada.com"
```

**Verificacion github:** Para verificar si la instalacion se ha hecho correctamente escribimos el siguiente comando:
```bash
git --version
```
Esto nos deberia devolver la version de github

**Verificacion usuario:** Para verificar la configuracion del correo y la contraseña que hemos puesto escribimos este comando:
```bash
git config --list
```

# **Instalacion de GitHub Desktop desde windows**

## **Descargar GitHub Desktop**

### **1 Ve al sitio oficial:**
https://desktop.github.com
### **2 Haz clic en el botón:**
Descarga el archivo y lo instalas normal
### **4 Iniciar sesión con GitHub**
Al abrir GitHub Desktop por primera vez, verás una pantalla para iniciar sesión. 

Haz clic en "Sign in to GitHub.com".

Se abrirá una ventana del navegador.

Inicia sesión con tu cuenta de GitHub (o créala si no tienes una).

Autoriza a GitHub Desktop a acceder a tu cuenta.

Vuelve a la app: ahora estás conectado.

### **5 Configurar tu identidad Git (nombre y correo)**
GitHub Desktop lo hace automáticamente con los datos de tu cuenta de GitHub, pero puedes cambiarlos

### **6. Clonar, crear o agregar repositorios**
Clonar un repo de GitHub → Usa la opción "Clone a repository"

Crear uno nuevo en tu PC → "Create a new repository"

Agregar uno existente → "Add an existing repository"