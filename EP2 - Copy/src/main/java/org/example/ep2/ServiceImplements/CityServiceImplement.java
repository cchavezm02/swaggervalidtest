package org.example.ep2.ServiceImplements;

import org.example.ep2.Entities.City;
import org.example.ep2.Repositories.ICityRepository;
import org.example.ep2.ServiceInterfaces.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImplement implements ICityService {
    @Autowired
    private ICityRepository cR;
    @Override
    public void insertar(City c) {
        cR.save(c);
    }
}
