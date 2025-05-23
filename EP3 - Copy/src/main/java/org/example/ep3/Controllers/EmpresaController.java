package org.example.ep3.Controllers;

import org.example.ep3.DTO.EmpresaDTO;
import org.example.ep3.Entities.Empresa;
import org.example.ep3.ServiceInterfaces.IEmpresaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.security.authorization.AuthorityReactiveAuthorizationManager.hasAuthority;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    private IEmpresaService eS;
    @PostMapping
    @PreAuthorize("hasAuthority ('PRINTER')")
    public void insertar(@RequestBody EmpresaDTO eDTO) {
        ModelMapper m = new ModelMapper();
        Empresa e = m.map(eDTO, Empresa.class);
        eS.insertar(e);
    }
}
