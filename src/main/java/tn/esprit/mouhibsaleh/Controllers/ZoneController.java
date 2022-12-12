package tn.esprit.mouhibsaleh.Controllers;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mouhibsaleh.Entities.Personnel;
import tn.esprit.mouhibsaleh.Generic.GenericController;
import tn.esprit.mouhibsaleh.Services.Personnel.PersonnelImp;


import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/zone")
public class ZoneController {

    @Autowired
    PersonnelImp service;
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Personnel AjouterClasse(@RequestBody Personnel c) throws Exception {
        try {
            return service.ajouterPersonnel(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
