package com.ligabetplay.models;


import java.time.LocalDate;

public class Jugador extends Persona {

    public Jugador(int id, String nombre, String apellido, String edad, int idEquipo, int dorsal, String posicionJuego,
            String nacionalidad, LocalDate fechaIngreso) {
        super(id, nombre, apellido, edad, idEquipo);
        this.dorsal = dorsal;
        this.posicionJuego = posicionJuego;
        this.nacionalidad = nacionalidad;
        this.fechaIngreso = fechaIngreso;
    }


    int dorsal;
    String posicionJuego;
    String nacionalidad;
    LocalDate fechaIngreso;
    int golesAnotados;
    int totalTr;
    int totalTa;
}
