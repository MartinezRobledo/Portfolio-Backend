package com.gestion.portfolio.APIREST.repositorio;

import com.gestion.portfolio.APIREST.modelo.Datos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DatosRepositorio extends JpaRepository<Datos, Integer>{
    
}
