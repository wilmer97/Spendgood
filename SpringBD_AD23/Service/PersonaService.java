package com.example.SpringBD_AD23.Service;

import com.example.SpringBD_AD23.InterfaceService.IPersonaService;
import com.example.SpringBD_AD23.Model.Persona;
import com.example.SpringBD_AD23.Repository.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersona repositorio;


    @Override
    public List<Persona> listar() {

        return repositorio.findAll();
    }

    @Override
    public void guardar(Persona per) {
        repositorio.save(per);
    }
}
