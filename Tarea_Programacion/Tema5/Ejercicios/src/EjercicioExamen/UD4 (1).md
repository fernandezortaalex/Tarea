# Unidad Didáctica 4: Introducción a Java

---

## Introducción

Java es uno de los lenguajes de programación más populares y ampliamente utilizados en el mundo. Su versatilidad, robustez y orientación a objetos lo hacen ideal tanto para principiantes como para desarrolladores experimentados. En esta unidad, exploraremos los fundamentos de Java, desde su sintaxis básica hasta estructuras de datos.

---

## Características de Java

Java destaca por las siguientes características principales:

1. **Lenguaje Orientado a Objetos (OOP)**: Java organiza el código en clases y objetos.
2. **Portabilidad**: Escribir una vez, ejecutar en cualquier lugar ("Write Once, Run Anywhere").
3. **Robustez**: Manejo automático de memoria y sistema de excepciones.
4. **Seguridad**: Proporciona un entorno seguro para la ejecución de aplicaciones.
5. **Multithreading**: Soporte para procesos concurrentes.
6. **Gran Comunidad**: Amplia documentación y soporte en línea.

---

## Sintaxis Básica de Java

La sintaxis de Java es simple y estricta, lo que ayuda a evitar errores comunes. A continuación, se presentan los elementos básicos:

### Estructura de un Programa Java

Cuando escribimos un programa en Java, debemos seguir una estructura específica. A continuación, te explico cómo se organiza y por qué cada parte tiene un nombre particular. 

Aquí tienes un ejemplo básico de un programa que muestra "Hola, mundo!" en la pantalla:

```java
public class Main {
    public static void main(String[] args) {
        // Código aquí
        System.out.println("Hola, mundo!");
    }
}
```

### ¿Por qué se escribe así?

Vamos a desglosarlo paso a paso para que comprendas el significado de cada línea.

### Componentes clave:

#### 1. `public class Main`

- **`class`**: Esta palabra indica que estamos definiendo una **clase**. Una clase en Java es como una plantilla que contiene el código que queremos ejecutar. Por ahora, puedes pensar en ella como un "contenedor" que agrupa las instrucciones que forman nuestro programa.  
- **`Main`**: El nombre de la clase. **Es obligatorio que el archivo donde guardes este programa se llame `Main.java`**, porque en Java el nombre del archivo debe coincidir con el nombre de la clase pública (en este caso, `Main`).  
- **`public`**: Significa que esta clase es accesible desde cualquier parte del programa. Esto es necesario porque cuando el programa empieza, Java necesita encontrar esta clase.

#### 2. `public static void main(String[] args)`

- **`main`**: Esta es una palabra especial en Java. **Es el punto de entrada del programa**. Cuando ejecutas el programa, Java empieza a leer el código desde esta función.  
- **`public`**: Al igual que con la clase, `public` significa que este método (función) debe ser accesible desde cualquier lugar, lo que permite que Java lo encuentre y lo ejecute al inicio.  
- **`static`**: Indica que este método pertenece a la clase y no a una instancia específica. Sin preocuparte por esto ahora, piensa que `static` ayuda a que el programa pueda iniciarse sin necesidad de crear un objeto.  
- **`void`**: Esta palabra significa que el método `main` **no devuelve ningún valor**. Solo ejecuta el código que se encuentra dentro de las llaves `{}`.  
- **`String[] args`**: Aunque puede parecer complicado, por ahora basta con saber que esto permite que el programa reciba información adicional al ejecutarlo. No te preocupes demasiado por esta parte por ahora.

#### 3. `System.out.println("Hola, mundo!");`

- **`System.out.println`**: Esta línea se encarga de mostrar texto en la pantalla.  
  - `System` es una clase que maneja la entrada y salida del sistema (como el teclado o la pantalla).  
  - `out` indica que queremos enviar información hacia la pantalla.  
  - `println` (print line) muestra el texto y salta a la siguiente línea.  
- **`"Hola, mundo!"`**: Es el mensaje que aparecerá en la pantalla. Puedes cambiar este texto para mostrar cualquier otro mensaje.

### ¿Qué ocurre cuando ejecutamos el programa?

1. Java busca una clase pública que coincida con el nombre del archivo (`Main`).
2. Dentro de esa clase, busca el método `main`.
3. Ejecuta las instrucciones dentro de `main`, comenzando con `System.out.println`.

---

## Tipos de Datos en Java

En Java, los tipos de datos son fundamentales para almacenar y manipular información. Se dividen en dos grandes categorías: **tipos primitivos** y **tipos de referencia**. A continuación, exploraremos cada uno con detalle, con un enfoque especial en `String` y sus funciones más útiles.

### Tipos Primitivos

Los tipos primitivos son la base del almacenamiento de datos en Java. Son simples, eficientes y almacenan valores directamente en memoria. Java ofrece varios tipos primitivos para cubrir diferentes necesidades.

#### 1. Tipos Numéricos

Estos tipos almacenan valores numéricos y se dividen en enteros y decimales.

**Enteros (sin decimales):**  
- **`byte`**: Tamaño de 8 bits, almacena valores de `-128` a `127`.  
   *Ideal para ahorrar memoria cuando sabemos que el valor no será mayor que 127.*  
   **Ejemplo:**  
   ```java
   byte edadMinima = 18;
   ```

- **`short`**: Tamaño de 16 bits, valores de `-32,768` a `32,767`.  
   *Útil para datos como identificadores o códigos que requieren más capacidad que `byte`.*  
   **Ejemplo:**  
   ```java
   short temperatura = 24000;
   ```

- **`int`**: Tamaño de 32 bits, valores entre `-2,147,483,648` y `2,147,483,647`.  
   *Es el tipo más utilizado para números enteros.*  
   **Ejemplo:**  
   ```java
   int poblacion = 1000000;
   ```

- **`long`**: Tamaño de 64 bits, se usa para valores muy grandes.  
   *Se debe agregar una `L` al final del número.*  
   **Ejemplo:**  
   ```java
   long distanciaEstrellas = 9223372036854775807L;
   ```

**Decimales (con punto flotante):**  
- **`float`**: Precisión simple de 32 bits. Se debe agregar una `F` al final del valor.  
   **Ejemplo:**  
   ```java
   float peso = 72.5F;
   ```

- **`double`**: Precisión doble de 64 bits. Es el tipo por defecto para decimales.  
   **Ejemplo:**  
   ```java
   double altura = 1.75;
   ```

#### 2. Tipo Carácter

- **`char`**: Almacena un solo carácter Unicode (16 bits). Se escribe entre comillas simples (`'`).  
   **Ejemplo:**  
   ```java
   char inicial = 'A';
   ```

#### 3. Tipo Lógico

- **`boolean`**: Almacena solo dos valores: `true` o `false`.  
   **Ejemplo:**  
   ```java
   boolean esMayor = true;
   ```

### Tipos de Referencia

Los tipos de referencia apuntan a objetos y permiten almacenar estructuras más complejas que un simple valor. A diferencia de los tipos primitivos, los tipos de referencia almacenan direcciones de memoria.

#### 1. `String` (Cadenas de Texto)

El tipo `String` es uno de los más usados en Java. Representa una secuencia de caracteres y se comporta como un objeto, lo que permite realizar múltiples operaciones sobre las cadenas.

**Creación de un `String`:**  
```java
String nombre = "Juan";
```

**Principales Operaciones con `String`:**

1. **Concatenación (`+` o `concat`)**:  
   Permite unir dos o más cadenas.  
   ```java
   String saludo = "Hola, ";
   String completo = saludo + "Mundo!";
   System.out.println(completo);  // Resultado: Hola, Mundo!
   ```

   Otra forma:  
   ```java
   String resultado = saludo.concat("Amigos!");
   ```

2. **Longitud de la cadena (`length`)**:  
   Devuelve el número de caracteres en el `String`.  
   ```java
   int longitud = nombre.length();
   System.out.println(longitud);  // Resultado: 4
   ```

3. **Obtener un carácter (`charAt`)**:  
   Extrae un carácter de una posición específica (comienza desde `0`).  
   ```java
   char primeraLetra = nombre.charAt(0);
   System.out.println(primeraLetra);  // Resultado: J
   ```

4. **Subcadenas (`substring`)**:  
   Permite obtener una parte de la cadena.  
   ```java
   String subcadena = nombre.substring(1, 3);
   System.out.println(subcadena);  // Resultado: ua
   ```

5. **Reemplazo de caracteres (`replace`)**:  
   Reemplaza todas las ocurrencias de un carácter o cadena por otra.  
   ```java
   String modificado = nombre.replace('J', 'L');
   System.out.println(modificado);  // Resultado: Luan
   ```

6. **Conversión a mayúsculas y minúsculas:**  
   ```java
   System.out.println(nombre.toUpperCase());  // JUAN
   System.out.println(nombre.toLowerCase());  // juan
   ```

7. **Eliminar espacios en blanco (`trim`)**:  
   ```java
   String conEspacios = "  Hola  ";
   System.out.println(conEspacios.trim());  // "Hola"
   ```

8. **Comparación de cadenas (`equals`)**:  
   ```java
   String palabra1 = "Hola";
   String palabra2 = "hola";

   boolean sonIguales = palabra1.equals(palabra2);  // false
   boolean sinDistinguir = palabra1.equalsIgnoreCase(palabra2);  // true
   ```

---

## Entrada y Salida de Datos en Java: `Scanner` y `System.out.println`

En Java, interactuar con el usuario es una parte fundamental de cualquier programa. Para esto, contamos con herramientas específicas que nos permiten mostrar información en pantalla (salida) y recibir datos del usuario (entrada). Vamos a profundizar en estas herramientas, resaltando sus particularidades.

### Salida: `System.out.println`

La instrucción `System.out.println` es la forma más común de mostrar mensajes en la consola. Esta línea puede parecer simple, pero tiene varias particularidades que debes conocer:

1. **Estructura y Propósito:**
   - **`System`**: Es una clase estándar de Java que agrupa herramientas para interactuar con el sistema (como la consola).
   - **`out`**: Es un atributo de la clase `System` que representa la salida estándar (generalmente la consola).
   - **`println`**: Es un método que imprime texto seguido de un salto de línea.

2. **Diferencia entre `println` y `print`:**
   - `println`: Imprime el mensaje y mueve el cursor a la siguiente línea.
   - `print`: Imprime el mensaje, pero el cursor permanece en la misma línea.

   **Ejemplo:**
   ```java
   System.out.print("Hola");
   System.out.print(" Mundo!");
   // Resultado: Hola Mundo!
   ```

   **Con `println`:**
   ```java
   System.out.println("Hola");
   System.out.println("Mundo!");
   // Resultado:
   // Hola
   // Mundo!
   ```

3. **Imprimir Valores Variables:**
   `System.out.println` puede imprimir cualquier tipo de dato: cadenas, números, caracteres, etc.

   **Ejemplo:**
   ```java
   int edad = 25;
   System.out.println("Tu edad es: " + edad);
   ```

### Entrada: `Scanner`

La clase `Scanner` es una herramienta para leer datos del teclado. Sin embargo, tiene características y particularidades que debes entender para evitar errores.

1. **Importar la Clase:**
   Antes de usar `Scanner`, es necesario importarla, ya que pertenece al paquete `java.util`.

   ```java
   import java.util.Scanner;
   ```

2. **Crear un Objeto `Scanner`:**
   Para usar `Scanner`, debemos crear un objeto que esté conectado a la entrada estándar del sistema (el teclado). Este objeto se declara de la siguiente forma:

   ```java
   Scanner scanner = new Scanner(System.in);
   ```

   - **`System.in`**: Representa la entrada estándar (el teclado).
   - El nombre `scanner` es un identificador; puedes usar otro nombre, pero este es común.

3. **Leer Diferentes Tipos de Datos:**
   Una de las ventajas de `Scanner` es que puede leer distintos tipos de datos directamente:

   - **Cadenas (`nextLine`)**:
     ```java
     System.out.print("Ingrese su nombre: ");
     String nombre = scanner.nextLine();
     System.out.println("Hola, " + nombre + "!");
     ```
     - **Particularidad:** `nextLine` lee toda la línea completa, incluyendo espacios.

   - **Números Enteros (`nextInt`)**:
     ```java
     System.out.print("Ingrese su edad: ");
     int edad = scanner.nextInt();
     System.out.println("Tienes " + edad + " años.");
     ```

   - **Números Decimales (`nextDouble`)**:
     ```java
     System.out.print("Ingrese su altura: ");
     double altura = scanner.nextDouble();
     System.out.println("Mides " + altura + " metros.");
     ```

   **Nota Importante:** Después de usar `nextInt` o `nextDouble`, es posible que necesites consumir el carácter de nueva línea pendiente si planeas usar `nextLine` después. Esto se debe a cómo `Scanner` maneja el búfer de entrada.

   **Ejemplo de Corrección:**
   ```java
   System.out.print("Ingrese su edad: ");
   int edad = scanner.nextInt();
   scanner.nextLine(); // Consumir el salto de línea restante

   System.out.print("Ingrese su nombre: ");
   String nombre = scanner.nextLine();
   System.out.println("Hola, " + nombre + ", tienes " + edad + " años.");
   ```

4. **Cerrar el Objeto `Scanner`:**
   Aunque no es obligatorio, es una buena práctica cerrar el objeto `Scanner` para liberar recursos:

   ```java
   scanner.close();
   ```

### Ejemplo Completo de Entrada y Salida:

Aquí tienes un programa que combina todo lo aprendido:

```java
import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Leer datos del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Limpiar el búfer
        scanner.nextLine();

        System.out.print("Ingrese su ciudad: ");
        String ciudad = scanner.nextLine();

        // Mostrar datos ingresados
        System.out.println("Hola, " + nombre + "! Tienes " + edad + " años y vives en " + ciudad + ".");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
```

**Salida de Ejemplo:**
```
Ingrese su nombre: Juan
Ingrese su edad: 25
Ingrese su ciudad: Madrid
Hola, Juan! Tienes 25 años y vives en Madrid.
```

---

## Funciones en Java

En Java, una **función**, también conocida como **método** (función que pertenecen a una clase) es un bloque de código reutilizable que realiza una tarea específica. Las funciones son esenciales para organizar y reutilizar código, lo que hace que los programas sean más claros, modulares y fáciles de mantener.

### ¿Qué es una Función y Por Qué Usarla?

Una función nos permite encapsular una tarea o conjunto de instrucciones dentro de un bloque que puede ejecutarse en cualquier momento con solo llamarla por su nombre.  
Esto tiene varias ventajas:  
- **Reutilización de código**: Evita escribir el mismo código varias veces.  
- **Legibilidad**: El programa se divide en partes más pequeñas y fáciles de entender.  
- **Mantenimiento**: Si se necesita cambiar la lógica, solo se modifica la función, no todas las partes del código que la utilizan.  

### Declaración de una Función en Java

A continuación, veremos cómo se declara una función en Java. Este es un ejemplo de una función simple que suma dos números:

```java
public static int sumar(int a, int b) {
    return a + b;
}
```

### Análisis Detallado de la Declaración:

Vamos a desglosar cada parte de esta función para entender su propósito y particularidades.

#### 1. Modificadores de Acceso: `public`  
- **`public`**: Indica que la función puede ser llamada desde cualquier parte del programa.  
- Otros modificadores que puedes encontrar:  
  - **`private`**: Solo accesible dentro de la misma clase.  
  - **`protected`**: Accesible desde clases del mismo paquete o clases que heredan de la actual.  

En este caso, usamos `public` porque queremos que la función esté disponible en todo el programa.  

#### 2. Modificador `static`  
- **`static`**: Significa que esta función pertenece a la **clase** y no a una instancia específica de esa clase.  
- **¿Por qué `static`?**: Si una función no depende de atributos de un objeto (es decir, no necesita acceder a variables que dependen de una instancia de la clase), se declara como `static`.  
- **Ejemplo de Diferencia:**  
   - **Con `static` (Perteneciente a la clase):**  
     ```java
     public static int sumar(int a, int b) {
         return a + b;
     }
     ```
     Llamada: `sumar(5, 10);`  

   - **Sin `static` (Perteneciente a un objeto):**  
     ```java
     public int sumar(int a, int b) {
         return a + b;
     }
     ```
     Llamada:  
     ```java
     MiClase objeto = new MiClase();
     int resultado = objeto.sumar(5, 10);
     ```

#### 3. Tipo de Retorno: `int`  
- **`int`**: Define el tipo de dato que devolverá la función. En este caso, la función devuelve un número entero.  
- Otros tipos posibles:  
  - **`void`**: La función **no devuelve ningún valor**.  
    ```java
    public static void imprimirMensaje() {
        System.out.println("Hola, mundo!");
    }
    ```  
  - **`double`**: Devuelve un número decimal.  
  - **`String`**: Devuelve una cadena de texto.  
  - **`boolean`**: Devuelve `true` o `false`.  

Si el tipo de retorno no coincide con lo declarado, Java mostrará un error de compilación.  

#### 4. Nombre de la Función: `sumar`  
- El nombre de la función debe ser **descriptivo** y reflejar lo que hace.  
- Se debe usar **camelCase** (empezar con minúscula y capitalizar cada palabra nueva).  
  ```java
  calcularPromedio();
  obtenerEdad();
  imprimirMensaje();
  ```

#### 5. Parámetros: `(int a, int b)`  
- **Parámetros**: Son valores que la función recibe como entrada.  
- En este caso, `a` y `b` son los números que queremos sumar, y ambos son de tipo `int`.  
- Si la función no requiere datos de entrada, se deja el paréntesis vacío:  
  ```java
  public static void imprimirSaludo() {
      System.out.println("Hola!");
  }
  ```  

- **Función con Varios Parámetros de Distinto Tipo:**  
  ```java
  public static double calcularArea(double base, double altura) {
      return (base * altura) / 2;
  }
  ```

### Llamada a una Función

Declarar una función no hace que se ejecute automáticamente. **Para que se ejecute, es necesario "llamarla"** desde el método `main` o desde otra función.

```java
int resultado = sumar(5, 10);
System.out.println("La suma es: " + resultado);
```

### Ejemplo Completo:  

Vamos a crear un programa completo que use varias funciones:  

```java
public class Calculadora {
    // Función para sumar
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Función para restar
    public static int restar(int a, int b) {
        return a - b;
    }

    // Método principal
    public static void main(String[] args) {
        int resultadoSuma = sumar(10, 5);
        int resultadoResta = restar(10, 5);

        System.out.println("El resultado de la suma es: " + resultadoSuma);
        System.out.println("El resultado de la resta es: " + resultadoResta);
    }
}
```

### Explicación del Ejemplo:  
1. **Se definen dos funciones**: `sumar` y `restar`.  
2. Las funciones `sumar` y `restar` devuelven valores enteros (`int`).
3. En el método `main`, se llaman las funciones `sumar` y `restar`.

**Salida Esperada:**  
```
El resultado de la suma es: 15  
El resultado de la resta es: 5
```

---

## `ArrayList` en Java

En Java, la clase `ArrayList` forma parte del paquete `java.util` y proporciona una estructura de datos dinámica que permite almacenar una colección de elementos. A diferencia de los arrays tradicionales, un `ArrayList` no tiene un tamaño fijo; puede crecer o reducirse dinámicamente a medida que se agregan o eliminan elementos.

### ¿Por Qué Usar `ArrayList` en Lugar de un Array Tradicional?

- **Tamaño Dinámico:** Los arrays tienen un tamaño fijo, lo que significa que debes definir su longitud al crearlos. `ArrayList`, en cambio, ajusta su tamaño automáticamente.  
- **Mayor Flexibilidad:** `ArrayList` permite añadir, eliminar e insertar elementos sin preocuparse por la gestión de tamaño o índices manualmente.  
- **Funciones Incorporadas:** `ArrayList` proporciona métodos útiles para manipular elementos, lo que facilita muchas operaciones comunes como búsqueda, ordenamiento y reemplazo.  

### Importar y Crear un `ArrayList`

Antes de poder usar un `ArrayList`, es necesario importar la clase desde el paquete `java.util`:

```java
import java.util.ArrayList;
```

**Creación de un `ArrayList`:**  
```java
ArrayList<String> nombres = new ArrayList<String>();
```

- **`ArrayList<String>`**: Declara un `ArrayList` que almacena elementos de tipo `String`.  
- **`new ArrayList<String>()`**: Crea una nueva instancia del `ArrayList`.  

### Operaciones Básicas con `ArrayList`

El `ArrayList` tiene una amplia variedad de métodos que facilitan su manipulación. A continuación, exploramos las funciones más esenciales:

### 1. Agregar Elementos: `add()`

El método `add()` permite añadir elementos al `ArrayList`. Cada nuevo elemento se agrega al final de la lista.  

```java
nombres.add("Juan");
nombres.add("Ana");
nombres.add("Pedro");
```

### 2. Insertar en una Posición Específica: `add(index, elemento)`

Puedes insertar un elemento en una posición específica usando un índice. Los índices comienzan en `0`.  

```java
nombres.add(1, "Carlos");  // Inserta "Carlos" en la posición 1
```
Después de esta operación, "Carlos" se insertará antes de "Ana", desplazando los demás elementos.  

### 3. Obtener Elementos: `get()`

El método `get()` permite acceder a un elemento en una posición específica usando su índice.  

```java
String primerNombre = nombres.get(0);  // Obtiene el primer elemento
System.out.println(primerNombre);  // Imprime: Juan
```

### 4. Modificar Elementos: `set()`

`set()` permite reemplazar un elemento en una posición dada.  

```java
nombres.set(1, "Lucía");  // Reemplaza "Carlos" por "Lucía"
```

### 5. Eliminar Elementos: `remove()`

Puedes eliminar elementos por índice o por el valor directamente:  

- **Eliminar por índice:**  
   ```java
   nombres.remove(0);  // Elimina el primer elemento
   ```

- **Eliminar por valor:**  
   ```java
   nombres.remove("Ana");  // Elimina "Ana" de la lista
   ```

Si hay varios elementos con el mismo valor, solo se eliminará la **primera aparición**.  

### 6. Obtener el Tamaño de la Lista: `size()`

El método `size()` devuelve la cantidad de elementos que hay en el `ArrayList`.  

```java
System.out.println("Tamaño: " + nombres.size());  // Imprime: 2
```

### 7. Verificar si Está Vacío: `isEmpty()`

El método `isEmpty()` devuelve `true` si el `ArrayList` no contiene elementos, y `false` en caso contrario.  

```java
if (nombres.isEmpty()) {
    System.out.println("La lista está vacía.");
} else {
    System.out.println("Hay elementos en la lista.");
}
```

### 8. Limpiar el `ArrayList`: `clear()`

Si deseas eliminar todos los elementos del `ArrayList`, puedes usar el método `clear()`.  

```java
nombres.clear();
System.out.println("Tamaño después de limpiar: " + nombres.size());  // 0
```

### 9. Buscar Elementos: `contains()`

`contains()` verifica si un elemento está presente en el `ArrayList` y devuelve `true` o `false`.  

```java
if (nombres.contains("Lucía")) {
    System.out.println("Lucía está en la lista.");
} else {
    System.out.println("Lucía no está en la lista.");
}
```

### 10. Iterar sobre un `ArrayList`

Hay varias formas de recorrer un `ArrayList` y mostrar todos sus elementos.  

- **Usando un bucle `for-each`:**  
   ```java
   for (String nombre : nombres) {
       System.out.println(nombre);
   }
   ```

- **Usando un bucle `for` tradicional (con índice):**  
   ```java
   for (int i = 0; i < nombres.size(); i++) {
       System.out.println(nombres.get(i));
   }
   ```

### Ejemplo Completo:  

```java
import java.util.ArrayList;

public class ListaNombres {
    public static void main(String[] args) {
        // Crear un ArrayList de nombres
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Pedro");

        // Insertar en una posición específica
        nombres.add(1, "Carlos");

        // Mostrar elementos
        System.out.println("Lista inicial:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Modificar un elemento
        nombres.set(2, "Lucía");

        // Eliminar por valor
        nombres.remove("Pedro");

        // Mostrar lista después de modificaciones
        System.out.println("\nLista después de modificar y eliminar:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Verificar si contiene un elemento
        if (nombres.contains("Lucía")) {
            System.out.println("\nLucía está en la lista.");
        }

        // Mostrar tamaño final
        System.out.println("\nTamaño final: " + nombres.size());
    }
}
```

### Salida Esperada:

```
Lista inicial:
Juan
Carlos
Ana
Pedro

Lista después de modificar y eliminar:
Juan
Carlos
Lucía

Lucía está en la lista.

Tamaño final: 3
```
