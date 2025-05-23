package org.example.ep2.Repositories;

import org.example.ep2.Entities.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IWeatherRepository extends JpaRepository<Weather,Long> {
    @Query(value="select c.cityname, AVG(w.temperature) from weather w inner join city c on w.id = c.id WHERE w.localdate BETWEEN :startDate AND :endDate group by c.cityname", nativeQuery = true)
    List<String[]> getmedianweather(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
}
