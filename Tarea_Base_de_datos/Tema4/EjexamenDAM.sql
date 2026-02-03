use andalucia_db;
select * from personas;
-- 1 dime el nombre y apellido de los cinco malagueños (provincia) de más edad
select nombre, apellido from personas where provincia = "Málaga" order by fecha_nacimiento asc limit 5;
-- 2 dime el maximo de ingresos anuales que tiene una persona con estudios primarios.
select max(ingresos_anuales), nivel_estudios from personas where nivel_estudios = 'Primarios';
-- 3  dime la edad media de las personas cuya ocupación comience por la letra A
select floor(avg(datediff(now(), fecha_nacimiento))/365) as media_edad from personas where ocupacion like 'A%';
-- 4  Dime las 3 primeras letras del estado civil de las personas de Dos Hermanas (pueblo, no que tengan hermanas).
select substring(estado_civil, 1, 3) as estado_civil, municipio from personas where municipio = 'Dos Hermanas';
-- 5  Cuenta el numero de personas que son padre siendo mujer o madre siendo hombre
select id from personas where sexo = "M" and id in (select padre from personas where padre is not null) or sexo = "H" and id in (select madre from personas where madre is not null);
-- 6  Dime la moda del estado civil
select count(*) as total, estado_civil from personas group by estado_civil order by count(*) desc limit 1;
-- 7  Dime cuantos municipios diferentes de la provincia de Cádiz aparecen en la base de datos. 
-- select provincia, count(municipio) as municipios from personas group by provincia;
select municipio from personas where provincia = "Cádiz" group by municipio;
-- 8  Dime la media de ingresos_anuales agrupada por estado_civil.
select avg(ingresos_anuales) as media_ingresos_anuales, estado_civil from personas group by estado_civil;
-- 9  Dime los abuelos de la persona con id 2002

select id, madre, padre from personas where id = (select madre from personas where id = 2002) or id = (select padre from personas where id = 2002);

-- 10 Dime los nietos de la persona con id 1093
-- select * from personas where padre in (select id from personas where padre = 1093) or madre in (select id from personas where padre = 1093)
-- 11 Dime la media de numero de hijos por mujer.
select avg(num_hijos) as numeroHijos, sexo from personas group by sexo having sexo = 'M';
-- 12 Dime los 5 granadinos (provincia) que más cobran ordenados por la longitud en letras de su ocupacion. 
select ingresos_anuales  from personas 
-- 13 Dime la provincia con menos ingresos anuales de media.

-- 14 Dime la provincia que tiene a los jubilados con menores ingresos anuales de media.

-- 15 Dime el municipio con mas ingresos anuales sin contar a las personas que no cobran nada.

-- 16 dime la media de edad de las personas con algun hijo con nombre empezando por la L.

-- 17 Dime la edad media de las personas que sean hermanas (de padre o de madre) de las personas de Málaga municipio.

-- 18 Dime la media de salarios anuales agrupados por el dia del mes en el que nacieron.

-- 19 Muestra la fecha de nacimiento en dia, mes y año de los jubilados que viven en Córdoba.

-- 20 Muestra la cantidad de personas que nacieron en cada década del siglo XX.

-- 21. Muestra las 3 provincias con más edad media entre las personas casadas.

-- 22. Muestra el municipio (o municipios) con más personas paradas.

-- 23. Muestra cada municipio junto con el valor máximo de ingresos_anuales de entre las personas que son padres.