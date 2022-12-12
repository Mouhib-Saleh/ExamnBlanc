package tn.esprit.mouhibsaleh.Services.Zone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mouhibsaleh.Entities.Personnel;
import tn.esprit.mouhibsaleh.Entities.Zone;
import tn.esprit.mouhibsaleh.Repositories.PersonnelRepository;
import tn.esprit.mouhibsaleh.Repositories.ZoneRepository;
import tn.esprit.mouhibsaleh.Services.Personnel.PersonnelInterface;

import java.util.Collections;
import java.util.List;
@Service
public class ZoneImp implements ZoneInterface {
    @Autowired
    ZoneRepository repo;
    @Autowired
    PersonnelRepository per;
    @Override
    public Zone AffecterPersonnelZone(int id, int idP) throws Exception {
        Personnel p = new Personnel();
        p = per.getPersonnelById(idP);
        Zone z = new Zone();
        z = repo.getZoneById(id);
        z.setPersonnels(Collections.singletonList(p));
        repo.save(z);
        return z;
    }
}
