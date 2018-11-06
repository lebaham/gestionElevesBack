package com.gestion.gestionElevesBack.test.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gestion.gestionElevesBack.model.Eleve;
import com.gestion.gestionElevesBack.service.EleveService;
import com.gestion.gestionElevesBack.web.controller.EleveController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(EleveController.class)
public class EleveControllerTest {
    @Autowired
    private MockMvc mvc;
    @MockBean
    private EleveService eleveService;

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldAjouterEleve() throws Exception{
        Eleve eleve = new Eleve();
        eleve.setAge(58);
        eleve.setNom("Christelle");
        eleve.setMatricule("AAA05");
        BDDMockito.given(this.eleveService.ajouterEleve(BDDMockito.any(Eleve.class))).willReturn(eleve);

        this.mvc.perform(post("/eleves")
        .contentType(MediaType.APPLICATION_JSON)
        .content(mapper.writeValueAsString(eleve))).andExpect(status().isOk())
                .andExpect(jsonPath("$.nom", is(eleve.getNom())))
                .andExpect(jsonPath("$.matricule", is(eleve.getMatricule())));


    }
}
