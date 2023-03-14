package com.gestion.portfolio.APIREST.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class UsuarioRol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usuarioRolId;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private User usuario;
    
    @ManyToOne
    private Rol rol;
    
    public UsuarioRol(){
        
    }
}
