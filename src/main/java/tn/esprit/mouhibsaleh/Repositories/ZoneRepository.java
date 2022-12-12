package tn.esprit.mouhibsaleh.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mouhibsaleh.Entities.Zone;

public interface ZoneRepository extends JpaRepository<Zone, Integer> {
    public Zone getZoneById(int id);
}
