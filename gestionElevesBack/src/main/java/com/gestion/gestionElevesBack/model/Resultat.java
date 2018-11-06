package com.gestion.gestionElevesBack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Resultat {
    @Id
    @GeneratedValue
    private Long idResultat;
    private double moyenne;
    private int rang;
    @OneToOne
    private Eleve eleve;

    public Resultat() {
    }

    public Long getIdResultat() {
        return idResultat;
    }

    public void setIdResultat(Long idResultat) {
        this.idResultat = idResultat;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }
}
