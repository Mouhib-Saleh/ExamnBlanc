package tn.esprit.mouhibsaleh.Services.Parking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mouhibsaleh.Entities.Parking;
import tn.esprit.mouhibsaleh.Repositories.ParkingRepo;
import tn.esprit.mouhibsaleh.Repositories.PersonnelRepository;
@Service
public class ParkingImp implements ParkingInterface{
    @Autowired
    ParkingRepo repo;
    @Override
    public Parking ajouterParkingZones(Parking c) throws Exception {
        return null;
    }
}
