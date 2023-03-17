
package com.gestion.portfolio.APIREST.controller;

import com.gestion.portfolio.APIREST.modelo.Datos;
import com.gestion.portfolio.APIREST.modelo.Educacion;
import com.gestion.portfolio.APIREST.modelo.Experiencia;
import com.gestion.portfolio.APIREST.modelo.Proyectos;
import com.gestion.portfolio.APIREST.modelo.Rol;
import com.gestion.portfolio.APIREST.modelo.Skills;
import com.gestion.portfolio.APIREST.modelo.User;
import com.gestion.portfolio.APIREST.modelo.UsuarioRol;
import com.gestion.portfolio.APIREST.servicio.DatosServicio;
import com.gestion.portfolio.APIREST.servicio.EducacionServicio;
import com.gestion.portfolio.APIREST.servicio.ExperienciaServicio;
import com.gestion.portfolio.APIREST.servicio.ProyectosServicio;
import com.gestion.portfolio.APIREST.servicio.SkillsServicio;
import com.gestion.portfolio.APIREST.servicio.UserServicio;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServicio servicio;
    @Autowired
    private DatosServicio dataService;
    @Autowired
    private SkillsServicio skillService;
    @Autowired
    private ProyectosServicio proyectosService;
    @Autowired
    private EducacionServicio educacionService;
    @Autowired
    private ExperienciaServicio experienciaService;
    
//    //Usuarios
//    @GetMapping("/usuarios")
//    public List<User> listarusuarios(){
//        return servicio.listarUsuarios();
//    }
//    
//    @GetMapping("/usuarios/{username}")
//    public User obtenerUsuario(@PathVariable("username") String username){
//        return servicio.obtenerUsuario(username);
//    }
//    
//    @PostMapping("/usuarios")
//    public User registrarUsuario(@RequestBody User usuario) throws Exception{
//        Set<UsuarioRol> usuarioRoles = new HashSet<>();
//        
//        Rol rol = new Rol();
//        rol.setRolId(2);
//        rol.setNombre("NORMAL");
//        
//        UsuarioRol usuarioRol = new UsuarioRol();
//        usuarioRol.setUsuario(usuario);
//        usuarioRol.setRol(rol);
//        
//        usuarioRoles.add(usuarioRol);
//        
//        return servicio.guardarUsuario(usuario, usuarioRoles);
//    }
//    
////    @PutMapping("/usuarios/{username}")
////    public ResponseEntity<?> actualizarUsuario(@RequestBody User usuario, @PathVariable String username){
////        try{
////            User usuarioExistente = servicio.obtenerUsuario(username);
////            
////            usuarioExistente.setName(usuario.getName());
////            usuarioExistente.setLastname(usuario.getLastname());
////            usuarioExistente.setEmail(usuario.getEmail());
////            usuarioExistente.setPassword(usuario.getPassword());
////            
////            servicio.guardarUsuario(usuarioExistente);
////            return new ResponseEntity<>(HttpStatus.OK);
////        }
////        catch(Exception excepcion){
////            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
////        }
////    }
//    
//    @DeleteMapping("/usuarios/{id}")
//    public void eliminarUsuario(@PathVariable("id") Integer id){
//        servicio.eliminarUsuario(id);
//    }
    
    //Datos
    @GetMapping("/datos")
    public List<Datos> obtenerdatos(){
        return dataService.obtenerDatos();
    }
    
    @PostMapping("/datos")
    public void registrarDatos(@RequestBody Datos datos){
        dataService.guardarDatos(datos);
    }
    
    @PutMapping("/datos/{id}")
    public ResponseEntity<?> actualizarDatos(@RequestBody Datos persona){
        try{
            Datos personaExistente = dataService.obtenerDatosPorId(1);
            
            personaExistente.setName(persona.getName());
            personaExistente.setLastname(persona.getLastname());
            personaExistente.setEmail(persona.getEmail());
            personaExistente.setPhone(persona.getPhone());
            personaExistente.setDegree(persona.getDegree());
            personaExistente.setBirthdate(persona.getBirthdate());
            personaExistente.setBirthplace(persona.getBirthplace());
            personaExistente.setAddress(persona.getAddress());
            personaExistente.setOcupation(persona.getOcupation());
            personaExistente.setStudylevel(persona.getStudylevel());
            personaExistente.setUrlphoto(persona.getUrlphoto());
            
            dataService.guardarDatos(personaExistente);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception excepcion){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    //Skills
    @GetMapping("/skills")
    public List<Skills> listarHabilidades(){
        return skillService.listarSkills();
    }
    
    @GetMapping("/skills/{id}")
    public ResponseEntity<Skills> obtenerSkill(@PathVariable Integer id){
        try{
            Skills skill = skillService.obtenerSkillPorId(id);
            return new ResponseEntity<>(skill, HttpStatus.OK);
        }
        catch(Exception excepcion){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/skills")
    public void registrarHabilidad(@RequestBody Skills skill){
        skillService.guardarSkill(skill);
    }
    
    @PutMapping("skills/{id}")
    public ResponseEntity<?> actualizarSkill(@RequestBody Skills skill, @PathVariable Integer id){
        try{
            Skills skillExistente = skillService.obtenerSkillPorId(id);
            
            skillExistente.setName(skill.getName());
            skillExistente.setValue(skill.getValue());
            
            skillService.guardarSkill(skillExistente);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception excepcion){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("skills/{id}")
    public void eliminarHabilidad(@PathVariable Integer id){
        skillService.eliminarSkill(id);
    }
    
    //Proyectos
    @GetMapping("/proyectos")
    public List<Proyectos> listarProyectos(){
        return proyectosService.obtenerProyectos();
    }
    
    @GetMapping("/proyectos/{id}")
    public ResponseEntity<Proyectos> obtenerProyecto(@PathVariable Integer id){
        try{
            Proyectos proyecto = proyectosService.obtenerProyectoPorId(id);
            return new ResponseEntity<>(proyecto, HttpStatus.OK);
        }
        catch(Exception excepcion){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/proyectos")
    public void registrarProyecto(@RequestBody Proyectos proyecto){
        proyectosService.guardarProyecto(proyecto);
    }
    
    @PutMapping("/proyectos/{id}")
    public ResponseEntity<?> actualizarProyecto(@RequestBody Proyectos proyecto, @PathVariable Integer id){
        try{
            Proyectos proyectoExistente = proyectosService.obtenerProyectoPorId(id);
            
            proyectoExistente.setTitle(proyecto.getTitle());
            proyectoExistente.setLinkProyect(proyecto.getLinkProyect());
            
            proyectosService.guardarProyecto(proyectoExistente);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception excepcion){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/proyectos/{id}")
    public void eliminarProyecto(@PathVariable Integer id){
        proyectosService.eliminarProyecto(id);
    }
    
    //Educacion
    @GetMapping("/educacion")
    public List<Educacion> listarFormacion(){
        return educacionService.obtenerFormacion();
    }
    
    @GetMapping("/educacion/{id}")
    public ResponseEntity<Educacion> obtenerFormacion(@PathVariable Integer id){
        try{
            Educacion formacion = educacionService.obtenerFormacionPorId(id);
            return new ResponseEntity<>(formacion, HttpStatus.OK);
        }
        catch(Exception excepcion){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/educacion")
    public void registrarFormacion(@RequestBody Educacion formacion){
        educacionService.guardarFormacion(formacion);
    }
    
    @PutMapping("/educacion/{id}")
    public ResponseEntity<?> actualizarFormacion(@RequestBody Educacion formacion, @PathVariable Integer id){
        try{
            Educacion educacionExistente = educacionService.obtenerFormacionPorId(id);
            
            educacionExistente.setDegree(formacion.getDegree());
            educacionExistente.setSince(formacion.getSince());
            educacionExistente.setUntil(formacion.getUntil());
            educacionExistente.setInstitution(formacion.getInstitution());
            educacionExistente.setSyllabus(formacion.getSyllabus());
            educacionExistente.setLinkToSyllabus(formacion.getLinkToSyllabus());
            educacionExistente.setLogo(formacion.getLogo());
            
            educacionService.guardarFormacion(educacionExistente);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception excepcion){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/educacion/{id}")
    public void eliminarFormacion(@PathVariable Integer id){
        educacionService.eliminarFormacion(id);
    }
    
    //Experiencia
    @GetMapping("/experiencia")
    public List<Experiencia> listarExperiencia(){
        return experienciaService.obtenerExperiencias();
    }
    
    @GetMapping("/experiencia/{id}")
    public ResponseEntity<Experiencia> obtenerExperiencia(@PathVariable Integer id){
        try{
            Experiencia formacion = experienciaService.obtenerExperienciaPorId(id);
            return new ResponseEntity<>(formacion, HttpStatus.OK);
        }
        catch(Exception excepcion){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/experiencia")
    public void registrarExperiencia(@RequestBody Experiencia experiencia){
        experienciaService.guardarExperiencia(experiencia);
    }
    
    @PutMapping("/experiencia/{id}")
    public ResponseEntity<?> actualizarExperiencia(@RequestBody Experiencia experiencia, @PathVariable Integer id){
        try{
            Experiencia experienciaExistente = experienciaService.obtenerExperienciaPorId(id);
            
            experienciaExistente.setRol(experiencia.getRol());
            experienciaExistente.setSince(experiencia.getSince());
            experienciaExistente.setUntil(experiencia.getUntil());
            experienciaExistente.setEmpresa(experiencia.getEmpresa());
            experienciaExistente.setDescripcion(experiencia.getDescripcion());
            experienciaExistente.setLinkALaEmpresa(experiencia.getLinkALaEmpresa());
            experienciaExistente.setLogo(experiencia.getLogo());
            
            experienciaService.guardarExperiencia(experienciaExistente);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception excepcion){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/experiencia/{id}")
    public void eliminarExperiencia(@PathVariable Integer id){
        experienciaService.eliminarExperiencia(id);
    }
}
