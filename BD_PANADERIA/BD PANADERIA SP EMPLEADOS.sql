-- INSERT A TABLA EMPLEADOS
insert into EMPLEADOS values(71814524, 'PEDRO', 'JUAREZ', 'CAJERO', 1200, 'AFP');
insert into EMPLEADOS values(31838526, 'JUAN', 'DIAZ', 'PANADERO', 1500, 'ONP');

-- PROCESOS ALMACENADOS
-- EMPLEADOS
create procedure SP_Listar_EMP()
select * from EMPLEADOS;

call SP_Listar_EMP();

create procedure SP_Insertar_EMP(
id VARCHAR(30),
nom VARCHAR(100),
ape VARCHAR(100),
cargo VARCHAR(50),
sala REAL,
afilia VARCHAR(30))
insert into EMPLEADOS values(id, nom, ape, cargo, sala, afilia);

call SP_Insertar_EMP('12345678', 'FABIAN', 'TORRE', 'ADMINISTRADOR', 2000, 'AFP');
call SP_Listar_EMP();

create procedure SP_Eliminar_EMP(
id VARCHAR(30))
delete from EMPLEADOS where ID_EMPLEADO = id;

call SP_Eliminar_EMP('71814524');
call SP_Listar_EMP();

create procedure SP_Editar_EMP(
id VARCHAR(30),
nom VARCHAR(100),
ape VARCHAR(100),
cargo VARCHAR(50),
sala REAL,
afilia VARCHAR(30))
update EMPLEADOS set Nombre_EMP=nom, Apellido_EMP=ape, Cargo_EMP=cargo, Salario=sala, Afiliacion=afilia
where ID_EMPLEADO=id;

call SP_Editar_EMP('12345678', 'LUIS', 'PEREZ', 'PANADERO', 1200, 'ONP');
call SP_Listar_EMP();

create procedure SP_ConsultarCod_EMP(
id VARCHAR(30))
select * from EMPLEADOS where ID_EMPLEADO=id;

call SP_ConsultarCod_EMP('12345678');