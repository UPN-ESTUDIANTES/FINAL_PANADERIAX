-- INSERT A TABLA CLIENTES
insert into CLIENTES values('14156576', 'HUGO', 957786321, 'CERCADO DE LIMA', 'HUGO1015@GMAIL.COM');
insert into CLIENTES values('43542131', 'ORLANDO', 963789023, 'CERCADO DE LIMA', 'ORLA1325@GMAIL.COM');

-- PROCESOS ALMACENADOS
-- CLIENTES
create procedure SP_Listar_CLI()
select * from CLIENTES;
call SP_Listar_CLI();

create procedure SP_Insertar_CLI(
id VARCHAR(30),
nom VARCHAR(100),
tel VARCHAR(20),
dire VARCHAR(150),
email VARCHAR(100))
insert into CLIENTES values(id, nom, tel, dire, email);

call SP_Insertar_CLI('54637289', 'FERNANDO', 943576823, 'CERCADO DE LIMA', 'FER6780@GMAIL.COM');
call SP_Listar_CLI();

create procedure SP_Eliminar_CLI(
id VARCHAR(30))
delete from CLIENTES where ID_CLIENTE = id;

call SP_Eliminar_CLI('43542131');
call SP_Listar_CLI();

create procedure SP_Editar_CLI(
id VARCHAR(30),
nom VARCHAR(100),
tel VARCHAR(20),
dire VARCHAR(150),
email VARCHAR(100))
update CLIENTES set Nombre_CLI=nom, Telefono_CLI=tel, Direccion_CLI=dire, Email_CLI=email
where ID_CLIENTE=id;

call SP_Editar_CLI('54637289', 'LUIS', 978943560, 'CERCADO DE LIMA', 'LUIS6780@GMAIL.COM');
call SP_Listar_CLI();

create procedure SP_ConsultarCod_CLI(
id VARCHAR(30))
select * from CLIENTES where ID_CLIENTE=id;

call SP_ConsultarCod_CLI('54637289');