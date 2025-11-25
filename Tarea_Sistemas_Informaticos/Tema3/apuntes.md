Aquí tienes **unos apuntes claros, resumidos y bien estructurados** de todo lo que contiene tu Unidad Didáctica 3 de *Desarrollo de Scripts en Bash*, con ejemplos incluidos para que puedas estudiar más fácil.

---

# 📘 **APUNTES – UNIDAD DIDÁCTICA 3: Desarrollo de Scripts en Bash**

---

# **1. Introducción a Bash**

## 🔹 ¿Qué es Bash?

Bash (*Bourne Again SHell*) es un **intérprete de comandos** y **lenguaje de scripting** usado en Linux y macOS.

### ✔ Funciones principales:

* Ejecutar comandos del sistema
* Manipular archivos
* Automatizar tareas
* Administrar procesos
* Crear scripts para mantenimiento, instalación o configuración

---

## 🔹 ¿Por qué aprender Bash?

* Esencial para **administración de sistemas**
* Automatiza tareas repetitivas
* Ahorra tiempo y reduce errores
* Muy usado en **DevOps y servidores Linux**

---

# **2. Crear y ejecutar scripts en Bash**

## 🔹 Estructura básica de un script

```bash
#!/bin/bash
# Comentario
echo "Hola mundo"
```

📌 El encabezado `#!/bin/bash` indica qué intérprete usar.

---

## 🔹 Cómo crear y ejecutar un script

### 1️⃣ Crear el archivo

```bash
nano script.sh
```

### 2️⃣ Dar permisos de ejecución

```bash
chmod +x script.sh
```

### 3️⃣ Ejecutarlo

```bash
./script.sh
```

o

```bash
bash script.sh
```

---

## 🔹 Ejemplo simple

```bash
#!/bin/bash
nombre="Carlos"
echo "Hola $nombre"
```

---

# **3. Variables en Bash**

## 🔹 Declaración

```bash
variable="valor"
```

⚠ No usar espacios antes o después del `=`.

## 🔹 Usar la variable

```bash
echo $variable
```

---

## 🔹 Tipos de variables

### ✔ Locales

Existen solo dentro del script o función.

```bash
mensaje="hola"
```

### ✔ Globales (del sistema)

* `$HOME`
* `$USER`
* `$PATH`

Ejemplo:

```bash
echo "Tu home es $HOME"
```

### ✔ Variables especiales

| Variable       | Significado                            |
| -------------- | -------------------------------------- |
| `$0`         | Nombre del script                      |
| `$1`, `$2` | Argumentos                             |
| `$#`         | Número de argumentos                  |
| `$?`         | Código de salida del comando anterior |

Ejemplo:

```bash
echo "Primer parámetro: $1"
```

---

## 🔹 Operaciones aritméticas

```bash
a=10
b=5
suma=$((a + b))
echo "Suma: $suma"
```

Operadores:

* `+` `-` `*` `/`
* `%` módulo
* `**` potencia

---

# **4. Estructuras de control**

---

# **4.1. Condicionales `if - else`**

### ✔ Sintaxis

```bash
if [ condición ]; then
   comandos
else
   comandos
fi
```

### ✔ Ejemplo

```bash
edad=20
if [ $edad -ge 18 ]; then
   echo "Mayor de edad"
else
   echo "Menor de edad"
fi
```

---

## 🔹 Operadores de comparación

| Operador | Significado   |
| -------- | ------------- |
| `-eq`  | igual         |
| `-ne`  | distinto      |
| `-lt`  | menor         |
| `-le`  | menor o igual |
| `-gt`  | mayor         |
| `-ge`  | mayor o igual |

---

# **4.2. Bucles**

---

## 🔹 Bucle FOR

```bash
for i in {1..5}; do
   echo $i
done
```

Ejemplo con palabras:

```bash
for nombre in Juan Maria Luis; do
  echo "Hola $nombre"
done
```

---

## 🔹 Bucle WHILE

```bash
contador=1
while [ $contador -le 5 ]; do
   echo "Iteración $contador"
   ((contador++))
done
```

---

# **5. Arrays en Bash**

Los arrays almacenan varios valores.

---

## 🔹 Declaración

```bash
mi_array=()
mi_array=("Juan" "Maria" "Luis")
```

---

## 🔹 Acceder a elementos

```bash
echo ${mi_array[0]}
echo ${mi_array[2]}
```

---

## 🔹 Mostrar todos los elementos

```bash
echo ${mi_array[@]}
```

---

## 🔹 Añadir elementos

```bash
mi_array+=("Carlos")
```

---

## 🔹 Modificar elementos

```bash
mi_array[1]="Marta"
```

---

## 🔹 Longitud del array

```bash
echo ${#mi_array[@]}
```

---

## 🔹 Eliminar elementos

```bash
unset mi_array[2]
```

---

## 🔹 Iterar un array

```bash
for nombre in "${mi_array[@]}"; do
  echo "Hola $nombre"
done
```

---

# **6. Aplicaciones típicas de arrays**

### 📂 Listar archivos:

```bash
archivos=(*.txt)
echo ${archivos[@]}
```

### 📌 Guardar resultados de un comando:

```bash
usuarios=($(ps aux | awk '{print $1}'))
echo ${usuarios[@]}
```

### 📥 Guardar argumentos del script:

```bash
args=("$@")
echo "Argumentos: ${args[@]}"
```

---

# ✔ ¿Quieres que te lo convierta en PDF, Markdown o un esquema resumido?
