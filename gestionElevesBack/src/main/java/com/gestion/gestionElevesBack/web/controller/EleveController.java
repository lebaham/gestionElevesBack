package com.gestion.gestionElevesBack.web.controller;

import com.gestion.gestionElevesBack.model.Eleve;
import com.gestion.gestionElevesBack.model.Personne;
import com.gestion.gestionElevesBack.service.EleveService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "API pour les operations CRUD des personnes type eleve")
@RestController
public class EleveController {
    @Autowired
    private EleveService eleveService;

    @PostMapping(value="/eleves")
    public ResponseEntity<Eleve> ajouterEleve(@RequestBody Eleve eleve){
      return  ResponseEntity.ok(eleveService.ajouterEleve(eleve));
    }
}
