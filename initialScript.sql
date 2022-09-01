
-- create
create table if not exists usuarios (
  id bigint unsigned not null primary key auto_increment,
  nombre varchar(255) not null,
  prefijo varchar(3),
  celular varchar(10),
  correo varchar(255) unique,
  usuario varchar(20) unique,
  clave varchar(20)
) auto_increment = 1;

create table if not exists tiendas (
  id bigint unsigned not null primary key auto_increment,
  nombre varchar(255) not null,
  direccion varchar (255) not null,
  latitud decimal(8,6) not null,
  longitud decimal(8,6) not null,
  unique(latitud,longitud)
) auto_increment = 1;

create table if not exists productos (
  id bigint unsigned not null primary key auto_increment,
  nombre varchar(255) not null,
  marca varchar(255) null,
  descriptor varchar(255) not null,
  ean13 varchar(20) null unique key
) auto_increment = 1;

create table if not exists precios (
  id bigint unsigned not null primary key auto_increment,
  id_productos_producto bigint unsigned not null,
  id_tiendas_tienda bigint unsigned not null,
  id_usuarios_usuario bigint unsigned not null,
  precio decimal(12,2) not null,
  instante timestamp not null default current_timestamp
) auto_increment = 1;
