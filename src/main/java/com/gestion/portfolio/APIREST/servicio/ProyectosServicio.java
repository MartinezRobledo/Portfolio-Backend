package com.gestion.portfolio.APIREST.servicio;

import com.gestion.portfolio.APIREST.modelo.Proyectos;
import com.gestion.portfolio.APIREST.repositorio.ProyectosRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosServicio {
    @Autowired
    private ProyectosRepositorio repositorio;
    
    public List<Proyectos> obtenerProyectos(){
        return repositorio.findAll();
    }
    
    public void guardarProyecto(Proyectos datos){
        repositorio.save(datos);
    }
    
    public Proyectos obtenerProyectoPorId(Integer id){
        return repositorio.findById(id).get();
    }
    
    public void eliminarProyecto(Integer id){
        repositorio.deleteById(id);
    }
}
