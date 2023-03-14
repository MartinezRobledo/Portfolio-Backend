package com.gestion.portfolio.APIREST.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    
    private String degree;
    private String since;
    private String until;
    private String institution;
    private String syllabus;
    private String linkToSyllabus;
    private String logo;
    
    public Educacion(){
        
    }
}
