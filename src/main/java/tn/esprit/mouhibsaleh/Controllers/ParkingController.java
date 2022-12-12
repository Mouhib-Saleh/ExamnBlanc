package tn.esprit.mouhibsaleh.Controllers;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mouhibsaleh.Entities.Parking;
import tn.esprit.mouhibsaleh.Entities.Personnel;
import tn.esprit.mouhibsaleh.Generic.GenericController;
import tn.esprit.mouhibsaleh.Services.Parking.ParkingImp;
import tn.esprit.mouhibsaleh.Services.Personnel.PersonnelImp;


import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/parking")
public class ParkingController {

    @Autowired
    ParkingImp service;
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Parking AjouterParking(@RequestBody Parking c) throws Exception {
        try {
            return service.ajouterParkingZones(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
