package com.ligabetplay.models;


public class Partidos {
    int dia = 0;
    int mes = 0;
    int anno = 0;
    String equipoVisitante;
    String equipoLocal;

    int marcadorVisitante =0;
    int marcadorLocal = 0;
    
    public Partidos(int dia, int mes, int anno, String equipoVisitante, String equipoLocal, int marcadorVisitante,
            int marcadorLocal) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
        this.equipoVisitante = equipoVisitante;
        this.equipoLocal = equipoLocal;
        this.marcadorVisitante = marcadorVisitante;
        this.marcadorLocal = marcadorLocal;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public String getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }
    public String getEquipoLocal() {
        return equipoLocal;
    }
    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }
    public int getMarcadorVisitante() {
        return marcadorVisitante;
    }
    public void setMarcadorVisitante(int marcadorVisitante) {
        this.marcadorVisitante = marcadorVisitante;
    }
    public int getMarcadorLocal() {
        return marcadorLocal;
    }
    public void setMarcadorLocal(int marcadorLocal) {
        this.marcadorLocal = marcadorLocal;
    }
    
    

}
