USE turismo_ocp;

CREATE TABLE IF NOT EXISTS clientes (
                                        id_cliente INT AUTO_INCREMENT PRIMARY KEY,
                                        nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    tipo_cliente VARCHAR(50)
    );

CREATE TABLE IF NOT EXISTS destinos (
                                        id_destino INT AUTO_INCREMENT PRIMARY KEY,
                                        nombre VARCHAR(100) NOT NULL,
    pais VARCHAR(100),
    precio_base DECIMAL(10,2) NOT NULL
    );

CREATE TABLE IF NOT EXISTS descuentos (
                                          id_descuento INT AUTO_INCREMENT PRIMARY KEY,
                                          nombre VARCHAR(100) NOT NULL,
    porcentaje DECIMAL(5,2) NOT NULL
    );

CREATE TABLE IF NOT EXISTS reservas (
                                        id_reserva INT AUTO_INCREMENT PRIMARY KEY,
                                        id_cliente INT,
                                        id_destino INT,
                                        id_descuento INT,
                                        cantidad_personas INT NOT NULL,
                                        fecha_reserva DATE NOT NULL,
                                        precio_final DECIMAL(10,2),

    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
    FOREIGN KEY (id_destino) REFERENCES destinos(id_destino),
    FOREIGN KEY (id_descuento) REFERENCES descuentos(id_descuento)
    );