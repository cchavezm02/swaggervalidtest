package org.example.ep_01.Repositories;

import org.example.ep_01.Entitites.Entrenador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEntrenadorRepository extends JpaRepository<Entrenador, Long> {
}
