package tn.esprit.mouhibsaleh.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.mouhibsaleh.Entities.Parking;
import tn.esprit.mouhibsaleh.Entities.Personnel;

import java.util.Date;
import java.util.List;

public interface  PersonnelRepository extends JpaRepository<Personnel, Integer> {
    public Personnel getPersonnelById(int id);
    public List<Personnel> getAllByZoneParking(Parking parking);

    @Query(value = "Select COUNT(p) from Personnel p where p.poste='GARDE_JOUR' AND p.zone.parking.adresse = ?1")
    Integer nombreGardeJour (String addresse);

    List<Personnel> getPersonnelByDateDeRecrutementBetween(Date startDate, Date endDate);

}
