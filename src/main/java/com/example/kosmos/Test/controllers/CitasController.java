package com.example.kosmos.Test.controllers;

import com.example.kosmos.Test.entities.CitaEntity;
import com.example.kosmos.Test.repositories.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitasController {

    @Autowired
    private  CitaRepository citaRepository;


    @GetMapping
    public List<CitaEntity> getCitas(){
        return citaRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<CitaEntity> crearCita(@RequestBody CitaEntity cita) {
        CitaEntity nuevoUsuario = citaRepository.save(cita);
        return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
    }

}