package org.example.ep3.Repositories;

import org.example.ep3.Entities.Mina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMinaRepository extends JpaRepository<Mina,Long> {
    @Query(value="Select e.razon_social, SUM(m.work_force) From Empresa e inner join Mina m on e.eid=m.eid where e.pais = :country group by e.razon_social",nativeQuery = true )
    List<String[]> mineincountry(@Param("country") String country);
}
