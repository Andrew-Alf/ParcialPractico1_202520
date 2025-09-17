package co.edu.uniandes.dse.ParcialPractico1_202520.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity

public class PlanetaEntity extends BaseEntity {
    private String nombrePlaneta;
    private int poblacionPlaneta;
    private int diamPlaneta;

    @PodamExclude
    @ManyToOne
    private SistemaSolar sistemaSolar;


}
