package com.ligabetplay.models;

public class Equipos {
    int id;
    
    String nombreEquipo;
    // Partidos jugados
    int pj;
    // Partidos ganados 
    int pg;
    // Partidos perdidos
    int pp;
    // Partidos Empatados
    int pr;
    // Goles a favor
    int gf;
    // Goles en contra
    int gc;
    // Total puntos
    int tp;
    
    public Equipos(){

    }

    

    public Equipos(int id, String nombreEquipo, int pj, int pg, int pp, int pr, int gf, int gc, int tp) {
        this.id = id;
        this.nombreEquipo = nombreEquipo;
        this.pj = pj;
        this.pg = pg;
        this.pp = pp;
        this.pr = pr;
        this.gf = gf;
        this.gc = gc;
        this.tp = tp;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPj() {
        return pj;
    }

    public void setPj(int pj) {
        this.pj = pj;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getPr() {
        return pr;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public int getGc() {
        return gc;
    }

    public void setGc(int gc) {
        this.gc = gc;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
