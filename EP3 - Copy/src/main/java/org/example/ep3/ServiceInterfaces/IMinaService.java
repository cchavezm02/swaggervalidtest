package org.example.ep3.ServiceInterfaces;

import org.example.ep3.Entities.Mina;

import java.util.List;

public interface IMinaService {
    public void insertar(Mina m);
    public List<String[]> mineincountry(String country);
}
