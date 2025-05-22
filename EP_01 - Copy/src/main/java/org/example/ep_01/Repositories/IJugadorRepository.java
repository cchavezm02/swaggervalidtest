package org.example.ep_01.Repositories;

import org.example.ep_01.Entitites.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IJugadorRepository extends JpaRepository<Jugador, Long> {
    @Query(value = "SELECT e.name, COUNT(j.jid) FROM entrenador e INNER JOIN jugador j ON e.tid=j.tid WHERE j.birth_date < '2002-10-19' GROUP BY e.name ORDER BY e.name",nativeQuery = true)
    List<String[]> agetrainer( );
}
