package org.example.ep_01.ServiceImplements;

import org.example.ep_01.Entitites.Jugador;
import org.example.ep_01.Repositories.IJugadorRepository;
import org.example.ep_01.ServiceInterfaces.IJugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorServiceImplement implements IJugadorService {
    @Autowired
    private IJugadorRepository jR;
    @Override
    public void insertar(Jugador j)
    {
        jR.save(j);
    }
    @Override
    public List<String[]> agetrainer()
    {
        return jR.agetrainer();
    }
}
