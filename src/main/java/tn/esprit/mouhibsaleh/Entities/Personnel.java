package tn.esprit.mouhibsaleh.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Personnel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;

    private String nom;
    private String prenom ;
    private int age;
    @Temporal(TemporalType.DATE)
    private Date dateDeRecrutement;
    private String login;
    @Enumerated(EnumType.ORDINAL)
    private Poste poste;
    private String password;
    @OneToOne
    private Zone zone;


}
