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
public class SistemaSolarService {
    @Autowired
    private SistemaSolarRepository sistemaSolarRepository;

    @Transactional
    public SistemaSolar createSistemaSolar(SistemaSolar sistemaSolar) throws IllegalOperationException {
        log.info("Inicia proceso de creación de un Sistema Solar");
        if (sistemaSolar.getNombreSistemaSolar() != null){
            throw new IllegalOperationException("El nombre del Sistema Solar no es válido.");
            }
            
        if(sistemaSolar.getRatioFuerzaSistemaSolar()<= 0.2 && sistemaSolar.getRatioFuerzaSistemaSolar()>=0.6){
            throw new IllegalOperationException("El Ratio de la fuerza de los Stormtroopers no es válido.");
            }

        if(sistemaSolar.getStormtroopersSistemaSolar()<= 1000){
            throw new IllegalOperationException("La cantidad de Stormtroopers no es válida.");
        }
    return sistemaSolarRepository.save(sistemaSolar);
    }

}
