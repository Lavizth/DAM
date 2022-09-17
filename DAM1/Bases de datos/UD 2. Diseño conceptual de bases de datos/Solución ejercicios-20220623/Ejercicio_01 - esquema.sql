drop database if exists Ejercicio_01;
create database Ejercicio_01;
use Ejercicio_01;

create table Cliente(
	DNI int NOT NULL,
    Nombre varchar( 20 ) NOT NULL,
    Apellidos varchar( 30 ) NOT NULL,
    Dirección varchar( 40 ) NOT NULL,
    FechaNacimiento DATE NOT NULL,
    Primary Key ( DNI )
);

create table Producto(
	Código int NOT NULL AUTO_INCREMENT,
    Nombre varchar( 20 ) NOT NULL,
    PrecioUnitario INT NOT NULL,
    Primary Key ( Código )
);

create table Proveedor  (
	CIF int NOT NULL,
    Nombre varchar( 20 ) NOT NULL,
    Dirección varchar( 40 ) NOT NULL,
    Primary Key ( CIF )
);

create table compra (
	DNI int NOT NULL,
    Código int NOT NULL,
    Primary Key ( DNI, Código ),
    Foreign Key ( DNI ) References Cliente( DNI ),
    Foreign Key ( Código ) References Producto( Código )
);

create table suministra (
	Código INT NOT NULL,
	CIF int NOT NULL,
    Primary Key ( Código ),
    Foreign Key ( Código ) References Producto( Código ),
    Foreign Key ( CIF ) References Proveedor (CIF )
);