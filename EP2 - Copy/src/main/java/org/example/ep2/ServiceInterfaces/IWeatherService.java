package org.example.ep2.ServiceInterfaces;

import org.example.ep2.Entities.Weather;
import org.example.ep2.Repositories.IWeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public interface IWeatherService {
    public void insertar(Weather w);
    public List<String[]> getmedianweather(LocalDate startDate, LocalDate endDate);
}
