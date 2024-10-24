create database petshop;

use petshop;

create table appointment (
id_appoinment int,
race varchar(50),
phone varchar(50),
address varchar(50),
medical_formula varchar(50)
);

create table bill (
id_bill int,
phone varchar(50),
address varchar(100),
ownername varchar(50)
);

create table medical_record (
id_record varchar(50),
patientage varchar(50),
address varchar(50),
phone varchar(50)
);

create table owner (
id_owner varchar(50),
lastname varchar(50),
email varchar(100),
address varchar(50),
phone  varchar(50)
);

create table pet (
id_pet int,
pet_name varchar(50),
species varchar(50),
age int,
gender varchar(50)
);

create table product (
id_product int,
medicine varchar(100),
food varchar(50),
toy varchar(50)
);

create table customer_bill (
id int,
id_ouwner int,
id_bill int,
date_created date,
relation_ship_details varchar(100)
);

create table supplier (
id_supplier int,
commodity varchar(50),
address varchar(50),
phone varchar(50)
);

create table cliente_factura (
id int auto_increment primary key,
id_factura int,
date_created int,
relationship_detail varchar(100),
foreign key (id_cliente) references cliente_factura(id)
);