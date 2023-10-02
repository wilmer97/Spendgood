package com.example.SpringBD_AD23.InterfaceService;

import com.example.SpringBD_AD23.Model.Persona;

import java.util.List;

public interface IPersonaService {
    // AQUI SE VAN A CREAR TODOS LOS MÉTODOS QUE VOY A UTILIZAR


    public List<Persona> listar();

    public void guardar(Persona per);
}
