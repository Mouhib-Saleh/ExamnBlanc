package tn.esprit.mouhibsaleh.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mouhibsaleh.Entities.Parking;
import tn.esprit.mouhibsaleh.Entities.Personnel;

public interface ParkingRepo extends JpaRepository<Parking, Integer> {

}
