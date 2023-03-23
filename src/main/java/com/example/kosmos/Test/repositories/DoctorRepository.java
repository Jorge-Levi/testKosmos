package com.example.kosmos.Test.repositories;

import com.example.kosmos.Test.entities.ConsultorioEntity;
import com.example.kosmos.Test.entities.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {
}
