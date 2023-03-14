package com.gestion.portfolio.APIREST.servicio;

import com.gestion.portfolio.APIREST.modelo.User;
import com.gestion.portfolio.APIREST.modelo.UsuarioRol;
import com.gestion.portfolio.APIREST.repositorio.RolRepositorio;
import com.gestion.portfolio.APIREST.repositorio.UserRepositorio;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicio {
    
    @Autowired
    private UserRepositorio usuarioRepositorio;
    
    @Autowired
    private RolRepositorio rolRepositorio;
    
    public User guardarUsuario(User usuario, Set<UsuarioRol>usuarioRoles) throws Exception{
        User usuarioLocal = usuarioRepositorio.findByUsername(usuario.getUsername());
        if(usuarioLocal != null){   //Preguntamos si ya existe el usuario para no crearlo dos veces
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya existe");
        }
        else{   //si no existe el usuario le asignamos los roles existentes
            for(UsuarioRol usuarioRol:usuarioRoles){
                rolRepositorio.save(usuarioRol.getRol());   //recorremos los roles existentes y los mandamos a la base de datos
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles); //Le asignamos los roles de la base de datos al usuario
            usuarioLocal = usuarioRepositorio.save(usuario);    //guardamos el usuario en la base de datos y en la variable de retorno
        }
        return usuarioLocal;
    }
    
    public List<User> listarUsuarios(){
        return usuarioRepositorio.findAll();
    }
    
    public User obtenerUsuario(String username){
        return usuarioRepositorio.findByUsername(username);
    }
    
    public void eliminarUsuario(Integer id){
        usuarioRepositorio.deleteById(id);
    }
}
