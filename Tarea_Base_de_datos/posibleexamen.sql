create table carrera (
    id_carrera varchar(50) primary key,
    hora_inicio time,
    hora_fin time,
    fecha date,
    id_curriculum varchar(50)
    -- foreign key (id_curriculum) references director(id_curriculum)
    -- ALTER TABLE carrera add foreign key (id_curriculum) references director(id_curriculum)
    -- Este alter table se crea al final de todo el programa
);

create table participante (
    id_DNI_participante varchar(9) primary key,
    nombre varchar(50)
);

create table etapa (
    id_etapa varchar(20) primary key,
    etapa varchar(20),
    KM decimal(10, 2),
    id_carrera varchar(50),
    foreign key (id_carrera) references carrera(id_carrera)
);

-- Mirar
create table participante_participa_carrera (
    id_carrera varchar(50),
    id_DNI_participante varchar(9),
    primary key (id_carrera, id_DNI_participante),
    foreign key(id_carrera) references carrera(id_carrera),
    foreign key(id_DNI_participante) references participante(id_DNI_participante)
);

create table a_pie(
    desnivel varchar(50) primary key,
    foreign key (desnivel) references carrera(id_carrera)
);

create table ciclista(
    tpmp varchar(50) primary key,
    lluvia char(2),
    foreign key (tpmp) references carrera(id_carrera)
);

create table bicicleta(
    id_bicicleta varchar(50) primary key,
    modelo varchar(100),
    electrica char(2),
    peso int
);

create table ciclista_permite_bicicleta(
    tpmp varchar(50),
    id_bicicleta varchar(50),
    primary key (tpmp, id_bicicleta),
    foreign key (tpmp) references ciclista(tpmp),
    foreign key (id_bicicleta) references bicicleta(id_bicicleta)
);

create table organizador(
    id_DNI_organizador varchar(9) primary key,
    nombre varchar(50),
    edad int,
    cargo varchar(50),
    fecha_inicio date
);

create table organizador_asiste_carrera(
    id_DNI_organizador varchar(9),
    id_carrera varchar(50),
    primary key (id_DNI_organizador, id_carrera),
    foreign key (id_DNI_organizador) references organizador (id_DNI_organizador),
    foreign key (id_carrera) references carrera (id_carrera)
);

create table director(
    id_curriculum varchar(9) primary key,
    foreign key (id_curriculum) references organizador(id_DNI_organizador)
);





insert into carrera (id_carrera, hora_inicio, hora_fin, fecha, id_curriculum) values
('C001', '08:00:00', '12:00:00', '2024-07-15', '98765432E'),
('C002', '09:00:00', '13:00:00', '2024-08-20', null),
('C003', '07:30:00', '11:30:00', '2024-09-10', '98765432E'),
('C004', '10:00:00', '14:00:00', '2024-10-05', '98765432E');

insert into participante (id_DNI_participante, nombre) values
('12345678A', 'Juan Perez'),
('87654321B', 'Maria Lopez'),
('11223344C', 'Carlos Garcia'),
('44332211D', 'Ana Martinez');

insert into etapa (id_etapa, etapa, KM, id_carrera) values
('E001', 'Montaña', 50.5, 'C001'),
('E002', 'Contrarreloj', 20.0, 'C001'),
('E003', 'Llanura', 70.0, 'C002'),
('E004', 'Montaña', 60.0, 'C003');

insert into participante_participa_carrera (id_carrera, id_DNI_participante) values
('C001', '12345678A'),
('C001', '87654321B'),
('C002', '11223344C'),
('C003', '44332211D');

insert into a_pie (desnivel) values
('C001'),
('C002');

insert into ciclista (tpmp, lluvia) values
('C003', 'SI'),
('C004', 'NO');

insert into bicicleta (id_bicicleta, modelo, electrica, peso) values
('B001', 'Modelo A', 'SI', 15),
('B002', 'Modelo B', 'NO', 10),
('B003', 'Modelo C', 'SI', 12);

insert into ciclista_permite_bicicleta (tpmp, id_bicicleta) values
('C003', 'B001'),
('C003', 'B002'),
('C004', 'B003');

insert into organizador (id_DNI_organizador, nombre, edad, cargo, fecha_inicio) values
('98765432E', 'Luis Fernandez', 45, 'Jefe de Carrera', '2020-01-15'),
('87654321F', 'Sofia Ruiz', 38, 'Coordinadora', '2019-03-22'),
('76543210G', 'Miguel Torres', 50, 'Director Técnico', '2018-07-30'),
('65432109H', 'Elena Gomez', 42, 'Asistente', '2021-11-05'),
('54321098I', 'David Sanchez', 36, 'Supervisor', '2022-05-18');

insert into organizador_asiste_carrera (id_DNI_organizador, id_carrera) values
('98765432E', 'C001'),
('87654321F', 'C002'),
('76543210G', 'C003'),
('65432109H', 'C004');

insert into director (id_curriculum) values
('98765432E')
