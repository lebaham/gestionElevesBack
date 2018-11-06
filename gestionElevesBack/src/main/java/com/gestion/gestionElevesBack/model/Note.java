package com.gestion.gestionElevesBack.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Note implements Serializable {
    @Id
    @GeneratedValue
    private Long idNote;
    private String valeur;
    @ManyToOne
    @JoinColumn(name = "CODE_ELEVE")
    private Eleve eleve;
    @ManyToOne
    @JoinColumn(name ="CODE_MATIERE")
    private Matiere matiere;

    public Note() {
    }

    public Long getIdNote() {
        return idNote;
    }

    public void setIdNote(Long idNote) {
        this.idNote = idNote;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    @Override
    public String toString() {
        return "Note{" +
                "idNote=" + idNote +
                ", valeur='" + valeur + '\'' +
                ", eleve=" + eleve +
                ", matiere=" + matiere +
                '}';
    }
}
