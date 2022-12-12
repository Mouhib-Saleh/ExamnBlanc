package tn.esprit.mouhibsaleh.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Zone {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;
    private int ref;
    private float dimension;
    @ManyToOne(cascade =CascadeType.PERSIST)
    @JsonIgnore
    private Parking parking;
    @OneToOne(mappedBy="zone")
    private Personnel personnel;
    @OneToMany
    private List<Personnel> personnels;
}
