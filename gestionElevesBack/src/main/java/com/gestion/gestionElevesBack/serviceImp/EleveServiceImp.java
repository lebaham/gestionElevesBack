package com.gestion.gestionElevesBack.serviceImp;

import com.gestion.gestionElevesBack.dao.EleveDao;
import com.gestion.gestionElevesBack.model.Eleve;
import com.gestion.gestionElevesBack.model.Personne;
import com.gestion.gestionElevesBack.service.EleveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EleveServiceImp implements EleveService {
    @Autowired
    private EleveDao eleveDao;

    @Override
    public Eleve ajouterEleve(Eleve eleve) {
      return  eleveDao.save(eleve);
    }
}
