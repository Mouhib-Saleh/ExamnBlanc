package tn.esprit.mouhibsaleh.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Parking {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private  Integer id;
    private  String designation;
    private  String adresse ;
    private  int capacite ;
    @OneToMany(mappedBy="parking",cascade =CascadeType.PERSIST)
    private Set<Zone> zones;
}
