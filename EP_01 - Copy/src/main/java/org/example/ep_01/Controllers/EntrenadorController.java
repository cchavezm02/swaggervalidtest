package org.example.ep_01.Controllers;

import org.example.ep_01.DTO.EntrenadorDTO;
import org.example.ep_01.Entitites.Entrenador;
import org.example.ep_01.ServiceInterfaces.IEntrenadorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Entrenador")
public class EntrenadorController {
    @Autowired
    private IEntrenadorService eS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR') || hasAuthority('ENTRENADOR')")
    public void insertar(@RequestBody EntrenadorDTO eDTO) {
        ModelMapper m = new ModelMapper();
        Entrenador e = m.map(eDTO, Entrenador.class);
        eS.insertar(e);
    }
}
