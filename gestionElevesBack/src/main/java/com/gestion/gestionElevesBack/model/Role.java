package com.gestion.gestionElevesBack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue
    private Long idRole;
    private String role;
    @ManyToMany(mappedBy = "roles")
    private List<Personne> personnes;

    public Role() {
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(List<Personne> personnes) {
        this.personnes = personnes;
    }

    @Override
    public String toString() {
        return "Role{" +
                "idRole=" + idRole +
                ", role='" + role + '\'' +
                ", personnes=" + personnes +
                '}';
    }
}


