package co.edu.uniandes.dse.ParcialPractico1_202520.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniandes.dse.ParcialPractico1_202520.entities.SistemaSolar;
import co.edu.uniandes.dse.ParcialPractico1_202520.entities.PlanetaEntity;
import co.edu.uniandes.dse.ParcialPractico1_202520.exceptions.EntityNotFoundException;
import co.edu.uniandes.dse.ParcialPractico1_202520.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.ParcialPractico1_202520.repositories.PlanetaRepository;
import co.edu.uniandes.dse.ParcialPractico1_202520.repositories.SistemaSolarRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class PlanetaService {
    @Autowired
    private PlanetaRepository planetaRepository;

    @Transactional
    public PlanetaEntity createPlaneta(PlanetaEntity planetaEntity) throws IllegalOperationException {
        log.info("Inicia proceso de creación de un Planeta.");
        if (planetaEntity.getPoblacionPlaneta()<=0){
            throw new IllegalOperationException("La población del Planeta no puede ser negativa.");
        }

        if (planetaEntity.getNombrePlaneta()+ "*" != "I" || planetaEntity.getNombrePlaneta()+"*" != "II" || planetaEntity.getNombrePlaneta()+"*" != "III"){
            throw new IllegalOperationException("El nombre del Planeta no es válido.");
        }
    return planetaRepository.save(planetaEntity);
    }
}
