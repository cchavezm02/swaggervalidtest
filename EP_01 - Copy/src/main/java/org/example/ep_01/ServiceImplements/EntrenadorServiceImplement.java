package org.example.ep_01.ServiceImplements;

import org.example.ep_01.Entitites.Entrenador;
import org.example.ep_01.Repositories.IEntrenadorRepository;
import org.example.ep_01.ServiceInterfaces.IEntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntrenadorServiceImplement implements IEntrenadorService {
    @Autowired
    private IEntrenadorRepository eR;
    @Override
    public void insertar(Entrenador e)
    {
        eR.save(e);
    }
}
