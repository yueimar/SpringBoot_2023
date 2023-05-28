package com.app.clientes.controlador;

import com.app.clientes.entidad.Estudiante;
import com.app.clientes.repositorio.EstudianteRepositorio;
import com.app.clientes.servicio.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EstudianteControlador {

    @Autowired
    private EstudianteService servicio;

    @Autowired
    private EstudianteRepositorio repo;

    @GetMapping("/estudiante")
    public String listarEstudiantes(Model modelo){
        modelo.addAttribute("estudiantes", EstudianteService.listarpersonas());
        return "estudiantes";
    }

    @GetMapping("/saludo")
    public String saludo() {
        return "Hello";

    }

    @GetMapping("/listarRepo")               //Esto se agrego
    public List<Estudiante> listarRep(Model model) {
        List<Estudiante> estudiantes = (List<Estudiante>) EstudianteService.listarpersonas();
        model.addAttribute("personas", estudiantes);
        return estudiantes;
    }


}
