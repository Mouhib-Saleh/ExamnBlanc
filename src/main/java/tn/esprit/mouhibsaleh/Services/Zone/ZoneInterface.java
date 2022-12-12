package tn.esprit.mouhibsaleh.Services.Zone;

import tn.esprit.mouhibsaleh.Entities.Personnel;
import tn.esprit.mouhibsaleh.Entities.Zone;

public interface ZoneInterface {
    public Zone AffecterPersonnelZone (int id, int idP) throws Exception;
}
