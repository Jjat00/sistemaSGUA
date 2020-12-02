CREATE TABLE rol
(
    id SMALLINT NOT NULL,
    tipo VARCHAR(13) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT UC_rol UNIQUE (id,tipo)
);

COMMENT ON TABLE rol
    IS 'Almacena los diferentes roles que pueden tener los usuarios';

INSERT INTO rol(id, tipo) VALUES(1,'administrador');
INSERT INTO rol(id, tipo) VALUES(2,'gerente');
INSERT INTO rol(id, tipo) VALUES(3,'operador');
/******************************/

CREATE TABLE usuario
(
    cedula BIGINT NOT NULL,
    rol SMALLINT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    actividad BOOLEAN NOT NULL,
    celular BIGINT NOT NULL,
    email VARCHAR(75) NOT NULL,
    password varchar(25) NOT NULL,
    PRIMARY KEY (cedula),
    CONSTRAINT "UC_usuario" UNIQUE (cedula, celular, email),
    CONSTRAINT "FK_id_rol" FOREIGN KEY (rol) REFERENCES rol (id),
    CONSTRAINT "cedula must be between 8 and 10 digits" CHECK (cedula >= 10000000 AND cedula <= 9999999999),
    CONSTRAINT "celular must have 10 digits and start with 3" CHECK (celular >= 3000000000 AND celular <= 3999999999)
);

COMMENT ON TABLE usuario
    IS 'Almacena la informacion general de cada usuario de la empresa';

INSERT INTO usuario(cedula, rol, nombre, apellido, actividad, celular, email, password) VALUES(1144000000,1,'Nombre1','Apellido1',true,3150000000,'Alguien01@gmail.com','password1');
INSERT INTO usuario(cedula, rol, nombre, apellido, actividad, celular, email, password) VALUES(1144111111,2,'Nombre2','Apellido2',true,3151111111,'Alguien02@gmail.com','password2');
INSERT INTO usuario(cedula, rol, nombre, apellido, actividad, celular, email, password) VALUES(1144222222,3,'Nombre3','Apellido3',true,3152222222,'Alguien03@gmail.com','password3');
INSERT INTO usuario(cedula, rol, nombre, apellido, actividad, celular, email, password) VALUES(1144333333,3,'Nombre4','Apellido4',true,3153333333,'Alguien04@gmail.com','password4');
INSERT INTO usuario(cedula, rol, nombre, apellido, actividad, celular, email, password) VALUES(1144444444,3,'Nombre5','Apellido5',false,3154444444,'Alguien05@gmail.com','password5');
INSERT INTO usuario(cedula, rol, nombre, apellido, actividad, celular, email, password) VALUES(1144555555,3,'Nombre6','Apellido6',true,3155555555,'Alguien06@gmail.com','password6');
/******************************/

CREATE TABLE cliente
(
	cedula BIGINT NOT NULL,
	nombre VARCHAR(50) NOT NULL,
	apellido VARCHAR(50) NOT NULL,
	celular BIGINT NOT NULL,
	actividad BOOLEAN NOT NULL,
	email VARCHAR(75) NOT NULL,
	PRIMARY KEY (cedula),
	CONSTRAINT "Must be unique" UNIQUE (cedula, celular, email),
	CONSTRAINT "cedula must be between 8 and 10 digits" CHECK (cedula >= 10000000 AND cedula <= 9999999999),
	CONSTRAINT "celular must have 10 digits and start with 3" CHECK (celular >= 3000000000 AND celular <= 3999999999)
);

COMMENT ON TABLE cliente
    IS 'Almacena la informacion general de cada cliente de la empresa';

INSERT INTO cliente VALUES (2144000000, 'Nombre1', 'Apellido1', 3150000009, true, 'Cliente01@gmail.com');
INSERT INTO cliente VALUES (2144111111, 'Nombre2', 'Apellido1', 3151111119, true, 'Cliente02@gmail.com');
INSERT INTO cliente VALUES (2144222222, 'Nombre3', 'Apellido1', 3152222229, true, 'Cliente03@gmail.com');
INSERT INTO cliente VALUES (2144333333, 'Nombre4', 'Apellido1', 3153333339, true, 'Cliente04@gmail.com');
INSERT INTO cliente VALUES (2144444444, 'Nombre5', 'Apellido1', 3154444449, false,'Cliente05@gmail.com');
INSERT INTO cliente VALUES (2144555555, 'Nombre6', 'Apellido1', 3155555559, true, 'Cliente06@gmail.com');
/******************************/

CREATE TABLE cliente_ubicacion
(
	cedula BIGINT NOT NULL,
	direccion VARCHAR(50) NOT NULL,
	estrato SMALLINT NOT NULL,
	PRIMARY KEY (cedula),
	CONSTRAINT "UC_cliente_ubicacion" UNIQUE (cedula, direccion),
	CONSTRAINT "estrato must be between 1 and 6" CHECK (estrato >= 1 AND estrato <= 6),
	CONSTRAINT "FK_cedula_cliente" FOREIGN KEY (cedula) REFERENCES cliente (cedula)
	    ON UPDATE CASCADE
		ON DELETE CASCADE
);

COMMENT ON TABLE cliente_ubicacion
    IS 'Almacena la direccion y estrato de cada cliente de la empresa';

INSERT INTO cliente_ubicacion VALUES (2144000000, 'Cra. XX #XX-XX', 3);
INSERT INTO cliente_ubicacion VALUES (2144111111, 'Cra. YY #YY-YY', 3);
INSERT INTO cliente_ubicacion VALUES (2144222222, 'Cra. ZZ #ZZ-ZZ', 3);
INSERT INTO cliente_ubicacion VALUES (2144333333, 'Cra. XY #XX-XX', 3);
INSERT INTO cliente_ubicacion VALUES (2144444444, 'Cra. XZ #XX-XZ', 3);
INSERT INTO cliente_ubicacion VALUES (2144555555, 'Cra. YX #XX-YX', 3);
/******************************/

CREATE TABLE metodo_pago
(
    id SMALLINT NOT NULL,
    nombre VARCHAR(16) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT UC_metodo_pago UNIQUE (id,nombre)
);

COMMENT ON TABLE metodo_pago
    IS 'Almacena los diferentes metodos de pago de lo clientes';

INSERT INTO metodo_pago VALUES (2, 'directo');
INSERT INTO metodo_pago VALUES (2, 'banco1');
INSERT INTO metodo_pago VALUES (3, 'banco2');
/******************************/

CREATE TABLE uso
(
	id SMALLINT NOT NULL,
	tipo varchar(11) NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT "UC_uso" UNIQUE (id)
);

COMMENT ON TABLE uso
    IS 'Almacena la informacion de los tipos de uso';

INSERT INTO uso VALUES (1, 'residencial');
INSERT INTO uso VALUES (2, 'comercial');
INSERT INTO uso VALUES (3, 'industrial');
INSERT INTO uso VALUES (4, 'oficial');
INSERT INTO uso VALUES (5, 'especial');
/******************************/

CREATE TABLE fases
(
	id SMALLINT NOT NULL,
	tipo varchar(10) NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT "UC_fases" UNIQUE (id)
);

COMMENT ON TABLE fases
    IS 'Almacena la informacion de las fases';

INSERT INTO fases VALUES (1, 'monofasico');
INSERT INTO fases VALUES (2, 'bifasico');
INSERT INTO fases VALUES (3, 'trifasico');
/******************************/

CREATE TABLE medidor
(
	id SERIAL NOT NULL,
	lectura_actual NUMERIC(10,3) NOT NULL,
	lectura_anterior NUMERIC(10,3) NOT NULL,
	consumo_actual int NOT NULL, 
	fecha_medicion DATE NOT NULL DEFAULT CURRENT_DATE,
	PRIMARY KEY (id),
	CONSTRAINT "UC_medidor" UNIQUE (id)
);

COMMENT ON TABLE medidor
    IS 'Almacena la informacion de todos los medidores';

INSERT INTO medidor(lectura_actual, lectura_anterior, consumo_actual) VALUES (51.213, 51.213, 136);
INSERT INTO medidor(lectura_actual, lectura_anterior, consumo_actual) VALUES (50.943, 49.124, 136);
INSERT INTO medidor(lectura_actual, lectura_anterior, consumo_actual) VALUES (51.077, 49.147, 136);
INSERT INTO medidor(lectura_actual, lectura_anterior, consumo_actual) VALUES (50.823, 48.144, 136);
INSERT INTO medidor(lectura_actual, lectura_anterior, consumo_actual) VALUES (49.981, 50.102, 136);
INSERT INTO medidor(lectura_actual, lectura_anterior, consumo_actual) VALUES (48.213, 50.134, 136);
/******************************/

CREATE TABLE factura
(
	id SERIAL NOT NULL,
	cedula_cliente BIGINT NOT NULL,
	pago BOOLEAN NOT NULL,
	uso INT NOT NULL, 
	medidor INT NOT NULL,
	valor_unitario NUMERIC(7,2) NOT NULL,
	subsidio NUMERIC(7,2) NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT "UC_factura" UNIQUE (id, cedula_cliente),
	CONSTRAINT "FK_uso" FOREIGN KEY (uso) REFERENCES uso (id),
	CONSTRAINT "FK_medidor" FOREIGN KEY (medidor) REFERENCES medidor (id),
	CONSTRAINT "FK_cedula" FOREIGN KEY (cedula_cliente) REFERENCES cliente (cedula)
		ON UPDATE CASCADE
		ON DELETE CASCADE
);

COMMENT ON TABLE factura
    IS 'Almacena las facturas que emite la empresa';

INSERT INTO factura(cedula_cliente, pago, uso, medidor, valor_unitario, subsidio) VALUES (2144000000, true, 1, 1, 592.00 , 11591.27);
INSERT INTO factura(cedula_cliente, pago, uso, medidor, valor_unitario, subsidio) VALUES (2144000000, true, 1, 2, 566.72 , 11561.09);
INSERT INTO factura(cedula_cliente, pago, uso, medidor, valor_unitario, subsidio) VALUES (2144000000, true, 1, 3, 576.68 , 12802.09);
INSERT INTO factura(cedula_cliente, pago, uso, medidor, valor_unitario, subsidio) VALUES (2144000000, false, 1, 4, 550.12 , 11300.09);
INSERT INTO factura(cedula_cliente, pago, uso, medidor, valor_unitario, subsidio) VALUES (2144444444, true, 5, 5, 592.00 , 11600.37);
INSERT INTO factura(cedula_cliente, pago, uso, medidor, valor_unitario, subsidio) VALUES (2144555555, true, 4, 6, 592.00 , 11801.19);
/******************************/

CREATE TABLE pago
(
	id SERIAL NOT NULL,
	fecha DATE NOT NULL DEFAULT CURRENT_DATE,
	metodo_pago SMALLINT NOT NULL,
	id_factura INT NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT "UC_pago" UNIQUE (id,id_factura),
	CONSTRAINT "FK_metodo_pago" FOREIGN KEY (metodo_pago) REFERENCES metodo_pago (id),
	CONSTRAINT "FK_id_factura" FOREIGN KEY (id_factura) REFERENCES factura (id)
);

COMMENT ON TABLE pago
    IS 'Almacena el registro de un pago';

INSERT INTO pago(fecha, metodo_pago, id_factura) VALUES ('2020/06/11', 1, 1);
INSERT INTO pago(fecha, metodo_pago, id_factura) VALUES ('2020/08/13', 2, 2);
INSERT INTO pago(fecha, metodo_pago, id_factura) VALUES ('2020/06/11', 1, 3);
/******************************/

CREATE TABLE transformador
(
	id SERIAL NOT NULL,
	actividad BOOLEAN NOT NULL,
	marca VARCHAR(20) NOT NULL,
	fases SMALLINT NOT NULL,
	snom NUMERIC(4,1) NOT NULL,
	v1nom NUMERIC(4,1) NOT NULL,
	v2nom NUMERIC(5,1) NOT NULL,
	frecuencia NUMERIC(4,1) NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT "UC_transformador" UNIQUE (id),
	CONSTRAINT "FK_fases" FOREIGN KEY (fases) REFERENCES fases (id)
);

COMMENT ON TABLE transformador
    IS 'Almacena la informacion de los transformadores';

INSERT INTO transformador VALUES (100001, true, 'marca1', 1, 15.0, 13.2, 240.0, 60.0);
INSERT INTO transformador VALUES (100002, true, 'marca2', 2, 15.0, 13.2, 246.0, 60.0);
INSERT INTO transformador VALUES (100003, true, 'marca3', 1, 25.0, 13.2, 240.0, 60.0);
INSERT INTO transformador VALUES (100004, true, 'marca1', 1, 25.0, 13.2, 240.0, 60.0);
INSERT INTO transformador VALUES (100005, false, 'marca1', 3, 37.5, 20.5, 245.0, 60.0);
INSERT INTO transformador VALUES (100006, true, 'marca3', 3, 15.0, 13.2, 240.0, 60.0);
/******************************/

CREATE TABLE transformador_ubicacion
(
	id INT NOT NULL,
	georeferenciacion varchar(28) NOT NULL,
	barrio VARCHAR(30) NOT NULL,
	comuna SMALLINT NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT "UC_transformador_ubicacion" UNIQUE (id),
	CONSTRAINT "FK_id" FOREIGN KEY (id) REFERENCES transformador (id)
);

COMMENT ON TABLE transformador_ubicacion
    IS 'Almacena la informacion de la ubicacion de los transformadores';

INSERT INTO transformador_ubicacion VALUES (100001, '3°28 02.3 N 76°30 05.8 W', 'EL SENA', 5);
INSERT INTO transformador_ubicacion VALUES (100002, '3°27 58.8 N 76°29 37.6 W', 'Villa del Prado', 5);
INSERT INTO transformador_ubicacion VALUES (100003, '3°28 09.2 N 76°29 21.0 W', 'Santa Barbara', 5);
INSERT INTO transformador_ubicacion VALUES (100004, '3°27 33.2 N 76°30 48.6 W', 'Porvenir', 5);
INSERT INTO transformador_ubicacion VALUES (100005, '3°27 45.1 N 76°30 27.5 W', 'Las Delicias', 4);
INSERT INTO transformador_ubicacion VALUES (100006, '3°27 54.0 N 76°28 46.6 W', 'Alfonzo Lopez', 4);