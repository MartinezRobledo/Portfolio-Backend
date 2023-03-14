package com.gestion.portfolio.APIREST.servicio;

import com.gestion.portfolio.APIREST.modelo.Skills;
import com.gestion.portfolio.APIREST.repositorio.SkillsRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsServicio {
    
    @Autowired
    private SkillsRepositorio repositorio;
    
    public List<Skills> listarSkills(){
        return repositorio.findAll();
    }
    
    public void guardarSkill(Skills skill){
        repositorio.save(skill);
    }
    
    public Skills obtenerSkillPorId(Integer id){
        return repositorio.findById(id).get();
    }
    
    public void eliminarSkill(Integer id){
        repositorio.deleteById(id);
    }
}
