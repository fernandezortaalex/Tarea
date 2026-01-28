use andalucia_db;
-- Muestra la media de salario agrupada por ocupación
select avg(ingresos_anuales) as media_salarios, ocupacion from personas group by ocupacion;
-- Muestra la media de salarios en cada provincia
select avg(ingresos_anuales) as media_salarios, provincia from personas group by provincia;
-- Muestra la media de edad de cada nivel socioeconómico
select ceil(avg(datediff(now(), fecha_nacimiento))/365) as media_edad from personas;
-- Dime la edad de las personas de menos de 60 años ordenadas por situación laboral.
  select nombre, apellido, floor(datediff(now(), fecha_nacimiento)/365) as edad, situacion_laboral from personas where floor(datediff(now(), fecha_nacimiento)/365) < 60 order by situacion_laboral ;


-- Muestra el nombre de la persona parada de más edad.
select nombre, situacion_laboral, floor(datediff(now(), fecha_nacimiento)/365) as edad from personas where situacion_laboral = 'jubilado' ;
-- Dime la provincia con la máxima edad media.
-- Dime los hijos del ciudadano con id 1190
-- Muestra los nietos del ciudadano con id = 1190
-- Muestra la madre con más hijos
-- Muestra la media de hijos por hombre
-- Dime la media de hijos de personas con menos de 30 años.
-- Muestra el valor de numero de hijos que más se repite entre las mujeres.
-- Dime la media de edad de las mujeres sin hijos de Sevilla provincia
-- Dime la media de las modas del campo edad.
-- Dime la provincia con menor edad media de las personas estudiantes.
-- Órdename los municipios por numero total de hijos en cada uno.
-- ordena las provincias por mayor número medio de hijos por mujer (tasa de natalidad)
-- Dime los municipios que no superan la tasa de reemplazo (más de 2 hijos por mujer) pero tienen un salario medio mayor a 3000 euros al mes
-- Dime la provincia con la moda de edad más alta.
-- Dime los 5 sevillanos (municipio) de más edad ordenados por la longitud de su apellido.
-- Dime el municicpio con menos tasa de natalidad (num_hijos por mujer) de entre los municipios de Huelva con salario medio menor de 20000 euros anuales .