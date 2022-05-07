package com.inserta.proyecto.controllers;

import com.inserta.proyecto.models.Actividad;
import com.inserta.proyecto.models.Socio;
import com.inserta.proyecto.models.Usuario;
import com.inserta.proyecto.repos.ActividadesRepo;
import com.inserta.proyecto.repos.SocioRepo;
import com.inserta.proyecto.repos.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ApiController {
    @Autowired
    private ActividadesRepo actividadesRepo;

    @Autowired
    private SocioRepo socioRepo;

    @Autowired
    private UsuarioRepo usuarioRepo;

    @GetMapping("/actividades")
    public List<Actividad> getActividad() {
        return actividadesRepo.findAll();
    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioRepo.findAll();
    }

    @GetMapping("/socios")
    public List<Socio> getSocios(){
        return socioRepo.findAll();
    }

}
