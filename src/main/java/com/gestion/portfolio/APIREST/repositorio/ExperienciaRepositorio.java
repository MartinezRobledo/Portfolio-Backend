package com.gestion.portfolio.APIREST.repositorio;

import com.gestion.portfolio.APIREST.modelo.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExperienciaRepositorio extends JpaRepository<Experiencia, Integer> {
    
}
