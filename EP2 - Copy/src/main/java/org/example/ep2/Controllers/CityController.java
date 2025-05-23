package org.example.ep2.Controllers;

import org.example.ep2.DTO.CityDTO;
import org.example.ep2.DTO.QueryDTO;
import org.example.ep2.Entities.City;
import org.example.ep2.ServiceInterfaces.ICityService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private ICityService cS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR') || hasAuthority('CLIMA')")
    public void insertar(@RequestBody CityDTO cDTO) {
        ModelMapper m = new ModelMapper();
        City c = m.map(cDTO, City.class);
        cS.insertar(c);
    }

}
