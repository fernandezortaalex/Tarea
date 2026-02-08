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
-- 5  Cuenta el numero de personas que son padre siendo mujer o madre siendo h ombre
select id from personas where sexo = "M" and id in (select padre from personas where padre is not null) or sexo = "H" and id in (select madre from personas where madre is not null);
-- 6  Dime la moda del estado civil
select count(*) as total, estado_civil from personas group by estado_civil order by count(*) desc limit 1;
-- 7  Dime cuantos municipios diferentes de la provincia de Cádiz aparecen en la base de datos. 
-- select provincia, count(municipio) as municipios from personas group by provincia;
select municipio from personas where provincia = "Cádiz" group by municipio;
-- 8  Dime la media de ingresos_anuales agrupada por estado_civil.
select avg(ingresos_anuales) as media_ingresos_anuales, estado_civil from personas group by estado_civil;
-- 9  Dime los abuelos de la persona con id 2002
SELECT * FROM personas 
WHERE id IN (
    SELECT padre FROM personas WHERE id IN (SELECT padre FROM personas WHERE id = 2002 UNION SELECT madre FROM personas WHERE id = 2002)
    UNION
    SELECT madre FROM personas WHERE id IN (SELECT padre FROM personas WHERE id = 2002 UNION SELECT madre FROM personas WHERE id = 2002)
);
select id, madre, padre from personas where id = (select madre from personas where id = 2002) or id = (select padre from personas where id = 2002);

-- 10 Dime los nietos de la persona con id 1093
-- select * from personas where padre in (select id from personas where padre = 1093) or madre in (select id from personas where padre = 1093)
-- 11 Dime la media de numero de hijos por mujer.
select avg(num_hijos) as numeroHijos, sexo from personas group by sexo having sexo = 'M';
-- 12 Dime los 5 granadinos (provincia) que más cobran ordenados por la longitud en letras de su ocupacion. 
SELECT * FROM personas 
WHERE provincia = 'Granada' 
ORDER BY ingresos_anuales DESC, CHAR_LENGTH(ocupacion) ASC 
LIMIT 5;
-- 13 Dime la provincia con menos ingresos anuales de media.
SELECT provincia, AVG(ingresos_anuales) AS media 
FROM personas 
GROUP BY provincia 
ORDER BY media ASC 
LIMIT 1;
-- 14 Dime la provincia que tiene a los jubilados con menores ingresos anuales de media.
SELECT provincia, AVG(ingresos_anuales) AS media 
FROM personas 
WHERE ocupacion = 'Jubilado' 
GROUP BY provincia 
ORDER BY media ASC 
LIMIT 1;
-- 15 Dime el municipio con mas ingresos anuales sin contar a las personas que no cobran nada.
SELECT municipio, SUM(ingresos_anuales) AS total 
FROM personas 
WHERE ingresos_anuales > 0 
GROUP BY municipio 
ORDER BY total DESC 
LIMIT 1;
-- 16 dime la media de edad de las personas con algun hijo con nombre empezando por la L.
SELECT AVG(DATEDIFF(NOW(), fecha_nacimiento) / 365) 
FROM personas 
WHERE id IN (SELECT padre FROM personas WHERE nombre LIKE 'L%')
   OR id IN (SELECT madre FROM personas WHERE nombre LIKE 'L%');
-- 17 Dime la edad media de las personas que sean hermanas (de padre o de madre) de las personas de Málaga municipio.
SELECT AVG(DATEDIFF(NOW(), fecha_nacimiento) / 365) 
FROM personas 
WHERE (madre IN (SELECT madre FROM personas WHERE municipio = 'Málaga') 
   OR padre IN (SELECT padre FROM personas WHERE municipio = 'Málaga'))
   AND municipio <> 'Málaga';
-- 18 Dime la media de salarios anuales agrupados por el dia del mes en el que nacieron.
SELECT EXTRACT(DAY FROM fecha_nacimiento) AS dia, AVG(ingresos_anuales) 
FROM personas 
GROUP BY dia;
-- 19 Muestra la fecha de nacimiento en dia, mes y año de los jubilados que viven en Córdoba.
SELECT DATE_FORMAT(fecha_nacimiento, '%d/%m/%Y') as fecha_nacimiento, municipio
FROM personas 
WHERE ocupacion = 'Jubilado' AND municipio = 'Córdoba';
-- 20 Muestra la cantidad de personas que nacieron en cada década del siglo XX.
SELECT FLOOR(EXTRACT(YEAR FROM fecha_nacimiento) / 10) * 10 AS decada, COUNT(*) 
FROM personas 
WHERE EXTRACT(YEAR FROM fecha_nacimiento) BETWEEN 1901 AND 2000
GROUP BY decada;
-- 21. Muestra las 3 provincias con más edad media entre las personas casadas.
SELECT provincia, AVG(DATEDIFF(NOW(), fecha_nacimiento) / 365) AS edad_media 
FROM personas 
WHERE estado_civil LIKE 'Casad%' 
GROUP BY provincia 
ORDER BY edad_media DESC 
LIMIT 3;
-- 22. Muestra el municipio (o municipios) con más personas paradas.
SELECT municipio 
FROM personas 
WHERE ocupacion = 'Parado' 
GROUP BY municipio 
ORDER BY COUNT(*) DESC 
LIMIT 1;
-- 23. Muestra cada municipio junto con el valor máximo de ingresos_anuales de entre las personas que son padres.
SELECT municipio, MAX(ingresos_anuales) 
FROM personas 
WHERE id IN (SELECT padre FROM personas) 
   OR id IN (SELECT madre FROM personas) 
GROUP BY municipio;