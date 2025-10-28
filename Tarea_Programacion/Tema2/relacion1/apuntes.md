## Refleja el numero de elementos en el array
```bish
array.length
```

## Acceso a elementos
```bish
let frutas = ['manzana', 'banana', 'naranja', 'uva']

console.log(frutas[0])  // 'manzana' (primer elemento, índice 0)
console.log(frutas[2])  // 'naranja' (tercer elemento, índice 2)
```

## Acceso al ultimo elemento del array
```bish
array[array.length - 1]
```

## Modificacion de un valor del array
```bish
let numeros = [10, 20, 30, 40]

numeros[1] = 25  // Cambia el valor en el índice 1 (20) por 25
console.log(numeros)  // [10, 25, 30, 40]
```

## Añadir elemento al final
```bish
array.push(elemento1, elemento2, ..., elementoN)
```

## Añadir elemento al inicio
```bish
array.unshift(elemento1, elemento2, ..., elementoN)
```

## Eliminar el ultimo elemento
```bish
let array = array.pop()
```

## Eliminar el primer elemento
```bish
let array = array.shift()
```