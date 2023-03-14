package com.gestion.portfolio.APIREST.servicio;

import com.gestion.portfolio.APIREST.modelo.Experiencia;
import com.gestion.portfolio.APIREST.repositorio.ExperienciaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaServicio {
    @Autowired
    private ExperienciaRepositorio repositorio;
    
    public List<Experiencia> obtenerExperiencias(){
        return repositorio.findAll();
    }
    
    public void guardarExperiencia(Experiencia datos){
        repositorio.save(datos);
    }
    
    public Experiencia obtenerExperienciaPorId(Integer id){
        return repositorio.findById(id).get();
    }
    
    public void eliminarExperiencia(Integer id){
        repositorio.deleteById(id);
    }
}
