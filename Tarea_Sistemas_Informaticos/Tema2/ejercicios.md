# Ejercicios gestión usuarios UNIX/Linux

Necesitamos crear la siguiente estructura de carpetas en nuestro servidor para albergar nuestro primer proyecto: 

Dentro de la carpeta `/opt` tendremos que crear una estructura de carpetas con la siguiente estructura : 

```bash
/opt$: ls -tlr  
drwxrwxrwx 5 propietario direccion 4096 feb 18 12:05 proyTicketsAlhambra

/opt$: cd proyTicketsAlhambra/  

/opt/proyTicketsAlhambra$: ls -ltr  
drwx------ 2 propietario direccion  4096 feb 18 12:05 gestion_economica    
drwxrwxr-x 2 propietario desarrollo 4096 feb 18 12:29 software    
drwxrwxr-x 2 propietario analisis   4096 feb 18 12:34 analisis 
```


Para ello tendremos que crear los siguientes grupos y usuarios:   

**Grupos:** 
- direccion 
- desarrollo 
- analisis 

```bash
sudo groupadd direccion
sudo groupadd desarrollo
sudo groupadd analisis
```

**Usuarios:**  

- **propietario**: Su grupo principal sera direccion y sus grupos secundarios desarrollo y analisis. Como contraseña tendrá *12345*, tendrá una carpeta personal en `/home/propietario` y su shell asociada sera *bash*.  
- **desarrollador1**: Su grupo principal será desarrollo. No pertenecerá a ningún grupo mas.Como contraseña tendrá *123*, tendrá una carpeta personal en `/home/desarrollador1` y su shell asociada sera *bash*.    
- **analista1**: Su grupo principal será analisis. No pertenecerá a ningún grupo más. Como contraseña tendrá *123*, tendrá una carpeta personal en `/home/analista1` y su shell asociada sera *bash*.    

 
``` bash
sudo adduser propietario
sudo usermod -g direccion propietario
sudo usermod -aG desarrollo propietario
sudo usermod -aG analisis propietario
sudo deluser propietario users
```

```bash
sudo adduser desarrollador1
sudo usermod -g desarrollo desarrollador1
sudo groupmod -R desarrollador1 users
sudo deluser desarrollador1 users
```

```bash
sudo adduser analista1
sudo usermod -g analisis analista1
sudo deluser analista1 users
```


**Realiza las siguientes operaciones:**
1. Entra con el usuario analista1 en la carpeta de software y crea un fichero tickets.java.  
2. Entra con el usuario desarrollador1 en la carpeta gestion_ecomica y haz un listado de los elementos.

* Cambiando los propietarios y los grupos de la estructura de carpetas :  

```bash
sudo mkdir proyTicketsAlhambra
```

```bash
su analista1

```

```bash


```