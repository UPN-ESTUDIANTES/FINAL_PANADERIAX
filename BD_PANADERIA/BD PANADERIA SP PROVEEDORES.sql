-- INSERT A TABLA PROVEEDORES
insert into PROVEEDORES values('123456', 'TAMPICO BEVERAGES INC', 987654321, 'TAMP@GMAIL.COM', 'CALLE LOS JARDINES', 'PUEBLO LIBRE');
insert into PROVEEDORES values('654321', 'AGRO MI PERU', 912345678, 'AGRO@GMAIL.COM','JR. LOS OLIVARES', 'SAN JUAN DE LURIGANCHO');

-- PROCESOS ALMACENADOS
-- PROVEEDORES
create procedure SP_Listar_PROV()
select * from PROVEEDORES;

call SP_Listar_PROV();

create procedure SP_Insertar_PROV(
id VARCHAR(30),
nom VARCHAR(100),
tel VARCHAR(20),
email VARCHAR(100),
dire VARCHAR(150),
distri VARCHAR(50))
insert into PROVEEDORES values(id, nom, tel, email, dire, distri);

call SP_Insertar_PROV('645123', 'SAN FERNANDO', 9783312465, 'SANFER@GMAIL.COM', 'LAS ORQUIDIAS', 'CALLAO');
call SP_Listar_PROV();

create procedure SP_Eliminar_PROV(
id VARCHAR(30))
delete from PROVEEDORES where ID_PROVEEDOR = id;

call SP_Eliminar_PROV('123456');
call SP_Listar_PROV();

create procedure SP_Editar_PROV(
id VARCHAR(30),
nom VARCHAR(100),
tel VARCHAR(20),
email VARCHAR(100),
dire VARCHAR(150),
distri VARCHAR(50))
update PROVEEDORES set Nombre_PROV=nom, Telefono_PROV=tel, Email_PROV=email, Direccion_PROV=dire, Distrito_PROV=distri
where ID_PROVEEDOR=id;

call SP_Editar_PROV('645123', 'COCA COLA', 912834765, 'COCA@GMAIL.COM', 'CALLE LA EMBAJADA', 'MIRAFLORES');
call SP_Listar_PROV();

create procedure SP_ConsultarCod_PROV(
id VARCHAR(30))
select * from PROVEEDORES where ID_PROVEEDOR=id;

call SP_ConsultarCod_PROV('645123');