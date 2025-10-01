- [**Comandos basicos de git**](#comandos-basicos-de-git)
  - [**¿Como funciona git?**](#como-funciona-git)
    - [**1 Inicializar un repositorio**](#1-inicializar-un-repositorio)
    - [**2 Agregar archivos al seguimiento**](#2-agregar-archivos-al-seguimiento)
    - [**3 Remover ficheros del arbol de trabajo**](#3-remover-ficheros-del-arbol-de-trabajo)
    - [**4 Guardar un cambio (commit)**](#4-guardar-un-cambio-commit)
    - [**5 Subida de repositorios**](#5-subida-de-repositorios)
    - [**6 Creacion de una nueva rama**](#6-creacion-de-una-nueva-rama)
    - [**6 Cambiar a una rama existente**](#6-cambiar-a-una-rama-existente)
    - [**7 Mueve tu trabajo de una rama a otra**](#7-mueve-tu-trabajo-de-una-rama-a-otra)
    - [**8 El ultimo punto donde has tocado**](#8-el-ultimo-punto-donde-has-tocado)
    - [**9 moverse una cantidad determinadas de commit**](#9-moverse-una-cantidad-determinadas-de-commit)
    - [**10 ver los hashes**](#10-ver-los-hashes)

# **Comandos basicos de git**
Git guarda versiones de tu proyecto como si hicieras un guardado cada vez que haces cambios importantes de tus proyectos
## **¿Como funciona git?**
### **1 Inicializar un repositorio**
Le decimos a Git que empieze a controlar nuestro proyecto:
```bash
git ini
```
### **2 Agregar archivos al seguimiento**
Cuando haces cambios en tus archivos tienes que decirle a Git que archivos quieres guardar:
```bash
git add archivo.txt
```
Si quieres agregar todos los archivos 
```bash
git add .
```

### **3 Remover ficheros del arbol de trabajo**
```bash
git-rm
```

### **4 Guardar un cambio (commit)**
Una vez agregados, guardas ese cambio con un mensaje
```bash
git commit -m "mensaje"
```
### **5 Subida de repositorios**
```bash
git commit "archivo1.txt"
```

### **6 Creacion de una nueva rama**
```bash
git branch nombrerama
```

### **6 Cambiar a una rama existente**
```bash
git checkout nombrerama
```

### **7 Mueve tu trabajo de una rama a otra**
```bash
git rebase nombrerama
```

### **8 El ultimo punto donde has tocado**
```bash
head
```

### **9 moverse una cantidad determinadas de commit**
```bash
git checkout
```

### **10 ver los hashes**
```bash
git log
```