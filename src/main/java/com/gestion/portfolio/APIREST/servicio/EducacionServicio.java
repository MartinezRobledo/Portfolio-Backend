package com.gestion.portfolio.APIREST.servicio;

import com.gestion.portfolio.APIREST.modelo.Educacion;
import com.gestion.portfolio.APIREST.repositorio.EducacionRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServicio {
    @Autowired
    private EducacionRepositorio repositorio;
    
    public List<Educacion> obtenerFormacion(){
        return repositorio.findAll();
    }
    
    public void guardarFormacion(Educacion datos){
        repositorio.save(datos);
    }
    
    public Educacion obtenerFormacionPorId(Integer id){
        return repositorio.findById(id).get();
    }
    
    public void eliminarFormacion(Integer id){
        repositorio.deleteById(id);
    }
}
