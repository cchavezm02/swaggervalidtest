package org.example.ep3.ServiceImplements;

import org.example.ep3.Entities.Mina;
import org.example.ep3.Repositories.IMinaRepository;
import org.example.ep3.ServiceInterfaces.IMinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MinaServiceImplement implements IMinaService {
    @Autowired
    private IMinaRepository mR;
    @Override
    public void insertar(Mina m){
        mR.save(m);
    }
    @Override
    public List<String[]> mineincountry(String country)
    {
        return mR.mineincountry(country);
    }
}
