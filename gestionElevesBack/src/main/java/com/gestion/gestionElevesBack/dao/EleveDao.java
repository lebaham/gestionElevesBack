package com.gestion.gestionElevesBack.dao;

import com.gestion.gestionElevesBack.model.Eleve;
import com.gestion.gestionElevesBack.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EleveDao extends JpaRepository<Eleve,Long> {
}
