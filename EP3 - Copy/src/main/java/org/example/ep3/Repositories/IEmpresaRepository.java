package org.example.ep3.Repositories;

import org.example.ep3.Entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpresaRepository extends JpaRepository<Empresa,Long> {
}
