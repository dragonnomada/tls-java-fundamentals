use tienda;

select * from productos;

insert into productos (nombre, precio) values ('Coca Cola', 17.5);

update productos set existencias=100 where id=1;
