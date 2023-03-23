package com.example.kosmos.Test.controllers;

import com.example.kosmos.Test.entities.CitaEntity;
import com.example.kosmos.Test.entities.ConsultorioEntity;
import com.example.kosmos.Test.repositories.CitaRepository;
import com.example.kosmos.Test.repositories.ConsultorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consultorios")
public class ConsultoriosController {

    @Autowired
    private ConsultorioRepository consultorioRepository;


    @GetMapping
    public List<ConsultorioEntity> getConsultorios(){
        return consultorioRepository.findAll();
    }
}
