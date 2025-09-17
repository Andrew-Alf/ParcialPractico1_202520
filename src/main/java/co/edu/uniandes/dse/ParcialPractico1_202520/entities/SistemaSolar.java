package co.edu.uniandes.dse.ParcialPractico1_202520.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity

public class SistemaSolar extends BaseEntity {

    private String nombreSistemaSolar;
    private double ratioFuerzaSistemaSolar;
    private int stormtroopersSistemaSolar;

    @PodamExclude
    @OneToMany(mappedBy = "sistemaSolar",cascade = CascadeType.PERSIST, orphanRemoval = true)   
    private List<SistemaSolar> jugadores = new ArrayList<>();

}
