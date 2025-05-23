package org.example.ep2.ServiceImplements;

import org.example.ep2.Entities.Weather;
import org.example.ep2.Repositories.IWeatherRepository;
import org.example.ep2.ServiceInterfaces.IWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class WeatherServiceImplement implements IWeatherService {
    @Autowired
    private IWeatherRepository wR;
    @Override
    public void insertar(Weather w)
    {
        wR.save(w);
    }
    @Override
    public List<String[]> getmedianweather(LocalDate startDate, LocalDate endDate) {
        return wR.getmedianweather(startDate, endDate);
    }
}
