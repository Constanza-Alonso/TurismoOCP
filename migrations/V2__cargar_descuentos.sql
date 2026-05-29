USE turismo_ocp;

INSERT INTO descuentos(nombre, porcentaje)
SELECT 'Sin descuento', 0
    WHERE NOT EXISTS (SELECT 1 FROM descuentos WHERE nombre = 'Sin descuento');

INSERT INTO descuentos(nombre, porcentaje)
SELECT 'Cliente frecuente', 15
    WHERE NOT EXISTS (SELECT 1 FROM descuentos WHERE nombre = 'Cliente frecuente');

INSERT INTO descuentos(nombre, porcentaje)
SELECT 'Promoción web', 10
    WHERE NOT EXISTS (SELECT 1 FROM descuentos WHERE nombre = 'Promoción web');

INSERT INTO descuentos(nombre, porcentaje)
SELECT 'Paquete familiar', 20
    WHERE NOT EXISTS (SELECT 1 FROM descuentos WHERE nombre = 'Paquete familiar');

INSERT INTO descuentos(nombre, porcentaje)
SELECT 'Temporada alta', 5
    WHERE NOT EXISTS (SELECT 1 FROM descuentos WHERE nombre = 'Temporada alta');