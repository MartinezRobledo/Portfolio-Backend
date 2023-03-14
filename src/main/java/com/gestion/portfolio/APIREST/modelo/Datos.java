package com.gestion.portfolio.APIREST.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Datos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String name;
    
    private String lastname;
    
    private String address;
    
    private String birthplace;
    
    private String birthdate;
    
    private String email;
    
    private String phone;
    
    private String ocupation;
    
    private String degree;
    
    private String urlphoto;
    
    private String studylevel;

    public Datos(String name, String lastname, String address, String birthplace, String birthdate, String email, String phone, String ocupation, String degree, String urlphoto, String studylevel) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.birthplace = birthplace;
        this.birthdate = birthdate;
        this.email = email;
        this.phone = phone;
        this.ocupation = ocupation;
        this.degree = degree;
        this.urlphoto = urlphoto;
        this.studylevel = studylevel;
    }
    
    public Datos(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getUrlphoto() {
        return urlphoto;
    }

    public void setUrlphoto(String urlphoto) {
        this.urlphoto = urlphoto;
    }

    public String getStudylevel() {
        return studylevel;
    }

    public void setStudylevel(String studylevel) {
        this.studylevel = studylevel;
    }
    
    
    
}
