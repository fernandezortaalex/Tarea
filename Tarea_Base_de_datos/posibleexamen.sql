create table carrera (
    id_carrera varchar(50) primary key,
    hora_inicio time,
    hora_fin time,
    fecha date,
    id_curriculum varchar(50)
    -- foreign key (id_curriculum) references director(id_curriculum)
    --ALTER TABLE carrera add foreign key (id_curriculum) references director(id_curriculum)
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
    id_curriculum varchar(50) primary key,
    foreign key (id_curriculum) references organizador(id_DNI_organizador)
);

