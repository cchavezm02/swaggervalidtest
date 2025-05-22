package org.example.ep_01.Controllers;

import org.example.ep_01.DTO.EntrenadorDTO;
import org.example.ep_01.DTO.JugadorDTO;
import org.example.ep_01.DTO.QueryDTO;
import org.example.ep_01.Entitites.Entrenador;
import org.example.ep_01.Entitites.Jugador;
import org.example.ep_01.ServiceInterfaces.IEntrenadorService;
import org.example.ep_01.ServiceInterfaces.IJugadorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jugador")
public class JugadorController {
    @Autowired
    private IJugadorService jS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR') || hasAuthority('ENTRENADOR')")
    public void insertar(@RequestBody JugadorDTO jDTO) {
        ModelMapper m = new ModelMapper();
        Jugador j = m.map(jDTO, Jugador.class);
        jS.insertar(j);
    }
    @GetMapping("/agetrainer")
    @PreAuthorize("hasAuthority('ADMINISTRADOR') || hasAuthority('ENTRENADOR')")
    public List<QueryDTO> agetrainer() {
        List<String[]> fila = jS.agetrainer();
        List<QueryDTO> dtoLista=new ArrayList<>();
        for(String[] columna: fila){
            QueryDTO dto=new QueryDTO();
            dto.setTrainerName(columna[0]);
            dto.setCounter(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
