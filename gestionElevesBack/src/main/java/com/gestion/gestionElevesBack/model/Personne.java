package com.gestion.gestionElevesBack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.mapping.ToOne;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_PERSONNE",discriminatorType = DiscriminatorType.STRING,length = 2)
public class Personne implements Serializable {
    @Id
    @GeneratedValue
    private Long idPersonne;
    private String nom;
    private String prenom;
    private int age;
    private String matricule;
    private String password;
    @ManyToOne
    @JoinColumn(name = "CODE_ETB")
    private Etablissement etablissement;
    @OneToMany
    private List<Role>roles;

    public Personne() {
    }

    public Long getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Long idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "idPersonne=" + idPersonne +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", matricule='" + matricule + '\'' +
                ", password='" + password + '\'' +
                ", etablissement=" + etablissement +
                ", roles=" + roles +
                '}';
    }
}
