package com.gestion.portfolio.APIREST.repositorio;

import com.gestion.portfolio.APIREST.modelo.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProyectosRepositorio extends JpaRepository<Proyectos, Integer>{
    
}
