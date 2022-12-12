package tn.esprit.mouhibsaleh.Services.Personnel;

import tn.esprit.mouhibsaleh.Entities.Parking;
import tn.esprit.mouhibsaleh.Entities.Personnel;

import java.util.Date;
import java.util.List;

public interface PersonnelInterface {
    public Personnel ajouterPersonnel (Personnel c) throws Exception;
    public List<Personnel> getAllPersonnelByParking(Parking p);
    public Integer getNombreGardeJour(String ad);
    public List<Personnel> getPersonalByDate(Date startDate, Date endDate);
}
