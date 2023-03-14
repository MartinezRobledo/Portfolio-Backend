package com.gestion.portfolio.APIREST.servicio;

import com.gestion.portfolio.APIREST.modelo.Datos;
import com.gestion.portfolio.APIREST.repositorio.DatosRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatosServicio {
    @Autowired
    private DatosRepositorio repositorio;
    
    public List<Datos> obtenerDatos(){
        return repositorio.findAll();
    }
    
    public void guardarDatos(Datos datos){
        repositorio.save(datos);
    }
    
    public Datos obtenerDatosPorId(Integer id){
        return repositorio.findById(id).get();
    }
    
    public void eliminarDatos(Integer id){
        repositorio.deleteById(id);
    }
}