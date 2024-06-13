package com.ligabetplay.models;


import java.time.LocalDate;

public class Jugador extends Persona {

    int dorsal;
    String posicionJuego;
    String nacionalidad;
    LocalDate fechaIngreso;
    int golesAnotados;
    int totalTr;
    int totalTa;
    
    public Jugador(int id, String nombre, String apellido, String edad, int idEquipo, int dorsal, String posicionJuego,
            String nacionalidad, LocalDate fechaIngreso) {
        super(id, nombre, apellido, edad, idEquipo);
        this.dorsal = dorsal;
        this.posicionJuego = posicionJuego;
        this.nacionalidad = nacionalidad;
        this.fechaIngreso = fechaIngreso;
    }


    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public String getPosicionJuego() {
        return posicionJuego;
    }
    public void setPosicionJuego(String posicionJuego) {
        this.posicionJuego = posicionJuego;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public int getGolesAnotados() {
        return golesAnotados;
    }
    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }
    public int getTotalTr() {
        return totalTr;
    }
    public void setTotalTr(int totalTr) {
        this.totalTr = totalTr;
    }
    public int getTotalTa() {
        return totalTa;
    }
    public void setTotalTa(int totalTa) {
        this.totalTa = totalTa;
    }

    
}
