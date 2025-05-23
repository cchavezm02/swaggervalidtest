package org.example.ep3.Controllers;

import org.example.ep3.DTO.EmpresaDTO;
import org.example.ep3.DTO.MinaDTO;
import org.example.ep3.DTO.QueryDTO;
import org.example.ep3.Entities.Empresa;
import org.example.ep3.Entities.Mina;
import org.example.ep3.ServiceInterfaces.IEmpresaService;
import org.example.ep3.ServiceInterfaces.IMinaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mina")
public class MinaController {
    @Autowired
    private IMinaService mS;

    @PostMapping
    @PreAuthorize("hasAuthority ('PRINTER')")
    public void insertar(@RequestBody MinaDTO mDTO) {
        ModelMapper m = new ModelMapper();
        Mina mn = m.map(mDTO, Mina.class);
        mS.insertar(mn);
    }
    @GetMapping("/query")
    @PreAuthorize("hasAuthority ('PRINTER')")
    public List<QueryDTO> mineincountry(@RequestParam("country") String country)
    {
        List<String[]> fila = mS.mineincountry(country);
        List<QueryDTO> dtoLista=new ArrayList<>();
        for(String[] columna: fila){
            QueryDTO dto=new QueryDTO();
            dto.setName(columna[0]);
            dto.setWorkforce(Integer.valueOf(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
