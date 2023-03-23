package com.example.kosmos.Test.repositories;

import com.example.kosmos.Test.entities.CitaEntity;
import com.example.kosmos.Test.entities.ConsultorioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultorioRepository extends JpaRepository<ConsultorioEntity, Long> {
}