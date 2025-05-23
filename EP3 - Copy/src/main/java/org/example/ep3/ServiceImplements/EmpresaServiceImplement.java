package org.example.ep3.ServiceImplements;

import org.example.ep3.Entities.Empresa;
import org.example.ep3.Repositories.IEmpresaRepository;
import org.example.ep3.ServiceInterfaces.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImplement implements IEmpresaService {
    @Autowired
    private IEmpresaRepository eR;
    @Override
    public void insertar(Empresa e) {
        eR.save(e);
    }
}
