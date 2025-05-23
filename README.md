Query Examples: 

SELECT
    c.id AS caballo_id,
    c.nombre AS nombre_caballo,
    COUNT(r.torneo_id) AS torneos_ganados
FROM
    caballos c
JOIN resultados r ON c.id = r.caballo_id
JOIN torneos t ON r.torneo_id = t.id
WHERE
    r.posicion = 1
    AND t.fecha >= CURRENT_DATE - (INTERVAL '1 year' * $1)
GROUP BY
    c.id, c.nombre
ORDER BY
    torneos_ganados DESC;
