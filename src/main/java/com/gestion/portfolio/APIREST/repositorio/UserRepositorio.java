
package com.gestion.portfolio.APIREST.repositorio;

import com.gestion.portfolio.APIREST.modelo.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepositorio extends JpaRepository<User, Integer>{
    
    public User findByUsername(String username);
    
}
