package com.gestion.portfolio.APIREST.repositorio;

import com.gestion.portfolio.APIREST.modelo.Skills;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SkillsRepositorio extends JpaRepository<Skills, Integer> {
    
}
