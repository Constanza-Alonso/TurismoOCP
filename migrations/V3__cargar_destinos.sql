USE turismo_ocp;

INSERT INTO destinos(nombre, pais, precio_base)
SELECT 'Bariloche', 'Argentina', 200000
    WHERE NOT EXISTS (SELECT 1 FROM destinos WHERE nombre = 'Bariloche');

INSERT INTO destinos(nombre, pais, precio_base)
SELECT 'Mendoza', 'Argentina', 150000
    WHERE NOT EXISTS (SELECT 1 FROM destinos WHERE nombre = 'Mendoza');

INSERT INTO destinos(nombre, pais, precio_base)
SELECT 'Cancún', 'México', 500000
    WHERE NOT EXISTS (SELECT 1 FROM destinos WHERE nombre = 'Cancún');