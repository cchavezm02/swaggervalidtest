package org.example.ep2.Controllers;

import org.example.ep2.DTO.CityDTO;
import org.example.ep2.DTO.QueryDTO;
import org.example.ep2.DTO.WeatherDTO;
import org.example.ep2.Entities.City;
import org.example.ep2.Entities.Weather;
import org.example.ep2.ServiceInterfaces.ICityService;
import org.example.ep2.ServiceInterfaces.IWeatherService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private IWeatherService wS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR') || hasAuthority('CLIMA')")
    public void insertar(@RequestBody WeatherDTO wDTO) {
        ModelMapper m = new ModelMapper();
        Weather c = m.map(wDTO, Weather.class);
        wS.insertar(c);
    }
    @GetMapping("/query1")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<QueryDTO> getmedianweather(@RequestParam("startDate") LocalDate startDate,
        @RequestParam("endDate") LocalDate endDate) {
        List<String[]> fila = wS.getmedianweather(startDate, endDate);
        List<QueryDTO> dtoLista=new ArrayList<>();
        for(String[] columna: fila){
            QueryDTO dto=new QueryDTO();
            dto.setCityName(columna[0]);
            dto.setMedian(Double.parseDouble(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
