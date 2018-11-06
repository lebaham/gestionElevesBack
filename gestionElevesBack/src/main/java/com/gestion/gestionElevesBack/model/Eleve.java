package com.gestion.gestionElevesBack.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@DiscriminatorValue("EL")
public class Eleve extends Personne {
    @OneToMany
    private List<Note>notes;

    public Eleve() {
    }

    public List<Note> getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "Eleve{" +
                "notes=" + notes +
                '}';
    }
}
