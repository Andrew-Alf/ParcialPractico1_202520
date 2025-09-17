package co.edu.uniandes.dse.ParcialPractico1_202520.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uniandes.dse.ParcialPractico1_202520.entities.PlanetaEntity;

public interface PlanetaRepository extends JpaRepository<PlanetaEntity, Long> {
    List<PlanetaEntity> findByNombrePlaneta(String nombrePlaneta);
}
