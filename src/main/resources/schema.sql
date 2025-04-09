CREATE TABLE product (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nombre NVARCHAR(100) NOT NULL,
    seleccion_c INT,
    seleccion_u INT,
    seleccion_t INT,
    seleccion_cn INT,
    seleccion_md INT,
    salida DATE NOT NULL
);