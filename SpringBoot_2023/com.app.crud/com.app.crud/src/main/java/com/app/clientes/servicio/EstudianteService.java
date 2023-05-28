package com.app.clientes.servicio;

import com.app.clientes.entidad.Estudiante;
import com.app.clientes.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private static EstudianteRepositorio repo;

    public static List<Estudiante> listarpersonas(){
        return (List<Estudiante>) repo.findAll();
    }


}
