create database tienda;

use tienda;

create table productos (
	id bigint primary key auto_increment,
    nombre varchar(255) not null,
    precio double not null,
    existencias int not null default 0
);

'delete from productos where id > 9999;