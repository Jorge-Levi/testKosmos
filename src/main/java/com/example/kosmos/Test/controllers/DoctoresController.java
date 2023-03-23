package com.example.kosmos.Test.controllers;


import com.example.kosmos.Test.entities.CitaEntity;
import com.example.kosmos.Test.entities.ConsultorioEntity;
import com.example.kosmos.Test.entities.DoctorEntity;
import com.example.kosmos.Test.repositories.CitaRepository;
import com.example.kosmos.Test.repositories.ConsultorioRepository;
import com.example.kosmos.Test.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctores")
public class DoctoresController {
    @Autowired
    private DoctorRepository doctorRepository;


    @GetMapping
    public List<DoctorEntity> getDoctores(){
        return doctorRepository.findAll();
    }


}
