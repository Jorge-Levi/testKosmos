package com.example.kosmos.Test.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.Date;

@Entity
@EntityScan
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "citas")
public class CitaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "consultorio_id", referencedColumnName = "id")
    private ConsultorioEntity consultorio;
    @ManyToOne
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    private DoctorEntity doctor;
    @Column(name = "horario_consulta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioConsulta;
    @Column(name = "nombre_paciente")
    private String nombrePaciente;

    }
