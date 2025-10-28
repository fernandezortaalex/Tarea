# Comandos Linux

## ls

```bash
-ls -l (Informacion mas detallada)
-ls -r (Lista en orden inverso)
-ls -R (Muestra en forma recursiva, muestra el contenido de los subdirectorios)
-ls -a (Muestra los archivos ocultos)
```

## find (buscar)

```bash
-find (Carpeta donde buscar) -type d (directorio) -name ""(Nombre)
                                    f (archivo)   -size (Segun tamaño)
```

## mkdir (crea directorios)

```bash
-mkdir -p (Si no hay directorios creados crea los necesarios)
```

## cp (Copiar)

```bash
-cp [ruta del archivo] [ruta/archivo donde guardarlo]
-cp carpeta/* [carpeta destino] PARA COPIAR SOLO EL CONTENIDO
```

## ~ (Directorio personal)

## grep (Busca una palabra dentro de un texto)

```bash
-ls carpeta 1 | grep hola
-grep hola archivo1.txt
```

## mv (Mover)

```bash
-mv docs/[Nombre y extension de varios archivos] [Carpeta destino] (Tambien sirve para cp y rm)
-mv [Archivo a mover] [Ubicacion donde moverlo] (Tambien sirve para renombrarlo)
-mv docs/{Nombre varios archivos}.txt [carpeta destino]
```

## > (Redirigir para guardar en un archivo)

```bash
> (Redirige para guardar en un archivo) -ls . > archivo.txt
>> (Hace lo mismo pero añade contenido al final del archivo) -cat archivo1.txt archivo1.txt >> archivo.txt
```

## touch (Crea archivos sin entrar)

## Usuarios

```bash
adduser [nombre usuario] (Crear usuario)
```
