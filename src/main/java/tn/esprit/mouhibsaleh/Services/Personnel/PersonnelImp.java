package tn.esprit.mouhibsaleh.Services.Personnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mouhibsaleh.Entities.Parking;
import tn.esprit.mouhibsaleh.Entities.Personnel;
import tn.esprit.mouhibsaleh.Repositories.PersonnelRepository;

import java.util.Date;
import java.util.List;
@Service
public class PersonnelImp  implements PersonnelInterface{
    @Autowired
    PersonnelRepository repo;
    @Override
    public Personnel ajouterPersonnel(Personnel c) throws Exception {
        return repo.save(c);
    }

    @Override
    public List<Personnel> getAllPersonnelByParking(Parking p) {
        return repo.getAllByZoneParking(p);
    }

    @Override
    public Integer getNombreGardeJour(String ad) {
        return repo.nombreGardeJour(ad);
    }
    @Override
    public List<Personnel> getPersonalByDate(Date startDate, Date endDate){
        return repo.getPersonnelByDateDeRecrutementBetween(startDate,endDate);
    }
}
