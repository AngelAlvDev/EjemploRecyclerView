package com.cescristorey.recyclerview.ejemplorecyclerview;

/**
 * Created by Luis on 23/10/2017.
 */

public class Equipo {

    private String nom_equipo;
    private String estadio;
    private String entrenador;

    public Equipo(String equipo, String estadio, String entrenador) {
        this.nom_equipo = equipo;
        this.estadio = estadio;
        this.entrenador = entrenador;
    }

    public String getNom_equipo() {
        return nom_equipo;
    }

    public void setNom_equipo(String nom_equipo) {
        this.nom_equipo = nom_equipo;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getEntrenador() { return entrenador; }

    public void setEntrenador(String entrenador) { this.entrenador = entrenador; }

}
