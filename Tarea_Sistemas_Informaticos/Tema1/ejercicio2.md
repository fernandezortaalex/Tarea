# Queremos hacer un script para organizar nuestras carpetas
## 1
Dentro de docs, crea dos carpetas "documentacion" y "documentacion2", dos archivos, archivo1.txt y archivo2.txt
```bash
mkdir documentacion documentacion2
touch archivo1.txt archivo2.txt
touch programa1.sh touch programa2.sh
```

Crea un script dentro de docs que haga lo siguiente: crea 3 archivos que se llamen carpetas, programas y archivos
```bash
 nano prueba1.sh
    #!/bin/bash
    touch carpetas programas archivos

sudo chmod +x prueba1.sh

./prueba1.sh
 ```

Quiero que almaceneis en "carpetas" los nombres de las carpetas que esten en docs, en "programas" los nombres de los programas (.sh) y en "archivos" los nombres de los archivos(.txt)
```bash
nano prueba2.sh
    #!/bin/bash
    find . -type f -name "*.txt" > archivos
    find . -type f -name "*.sh" > programas
    find . -type d > carpetas
```
## 2
Rellena archivo1.txt y archivo2.txt con algo de texto, el que tu quiera.
Escribe un script que almacene dentro de archivo2.txt el contenido de archivo2.txt y detras el contenido de archivo1.txt
```bash
nano prueba3.sh
    #!/bin/bash
    cat archivo1.txt archivo2.txt > archivo3.txt
    cat archivo3.txt > archivo1.txt
```
