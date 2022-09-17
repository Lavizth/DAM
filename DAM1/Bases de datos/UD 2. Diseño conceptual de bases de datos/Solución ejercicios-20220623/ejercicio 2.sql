/* ----------------------------------------------------------------------
	Creación del esquema del ejercicio de transporte de paquetes.
   ---------------------------------------------------------------------- */
drop database if exists ejercicio_02;
create database ejercicio_02;
use ejercicio_02;

/* ----------------------------------------------------------------------
	Relación con información del Camión
   ---------------------------------------------------------------------- */
create table Camión (
	Matrícula				varchar(12)		NOT NULL,
    Modelo					varchar(20)		NOT NULL,
    Tipo					enum('Ligero','Medio','Pesado','Extra') 	NOT NULL,
    Potencia				int				NOT NULL,
    primary key( Matrícula )
);

create table Camionero (
	DNI						varchar(9)		NOT NULL, /* DNI del camionero */
    Nombre 					varchar(30)		NOT NULL,
    Teléfono 				varchar(9)		NOT NULL,
    Dirección 				varchar(50)		NOT NULL,
    Población 				varchar(30)		NOT NULL,
    Salario 				int				NOT NULL,
    primary key( DNI )
);

create table Paquete (
	Código 					int auto_increment		NOT NULL,
    Descripción 			varchar(70)		NOT NULL,
    Destinatario 			varchar(50)		NOT NULL,
    DirecciónDestinatario 	varchar(50)		NOT NULL,
    primary key( Código )
);

create table Provincia (
	Código					int				NOT NULL,
    Nombre 					varchar(30)		NOT NULL,
    primary key( Código )
);

create table conduce( 
	Matrícula 				varchar(12)		NOT NULL,
	DNI 					varchar(9)		NOT NULL,
    primary key( Matrícula, DNI ),
    foreign key(Matrícula) 	references Camión(Matrícula),
    foreign key(DNI) 		references Camionero(DNI)
);

create table lleva (
	DNI 					varchar(9)		NOT NULL,
	Código					int				NOT NULL,
    primary key(Código),
    foreign key(DNI) 		references Camionero(DNI),
    foreign key(Código) 	references Paquete(Código)
);
/*
*/
create table llega (
	CódigoPaquete 			int				NOT NULL,
    CódigoProvincia 		int				NOT NULL,
    primary key(CódigoPaquete),
    foreign key(CódigoPaquete) 		references Paquete(Código),
    foreign key(CódigoProvincia) 	references Provincia(Código)
);