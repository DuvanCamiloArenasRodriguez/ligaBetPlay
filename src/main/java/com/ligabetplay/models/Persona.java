package com.ligabetplay.models;

public class Persona {
    int id;
    String nombre;
    String apellido;
    String edad;
    String rol;
    int idEquipo;
    
    public Persona(int id, String nombre, String apellido, String edad, String rol, int idEquipo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rol = rol;
        this.idEquipo = idEquipo;
    }
    

    public Persona(int id, String nombre, String apellido, String edad, int idEquipo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.idEquipo = idEquipo;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }


    public int getIdEquipo() {
        return idEquipo;
    }


    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    
}
