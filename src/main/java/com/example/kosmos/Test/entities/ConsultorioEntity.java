package com.example.kosmos.Test.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@EntityScan
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "consultorios")
public class ConsultorioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero_consultorio")
    private int numeroConsultorio;
    private int piso;

}
