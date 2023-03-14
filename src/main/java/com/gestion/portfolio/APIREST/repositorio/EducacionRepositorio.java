package com.gestion.portfolio.APIREST.repositorio;

import com.gestion.portfolio.APIREST.modelo.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EducacionRepositorio extends JpaRepository<Educacion, Integer>{
    
}
