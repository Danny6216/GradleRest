package App.model.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter
@Entity
@Table(name = "shift")
@Access(AccessType.FIELD)
public class Shift{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ticket")
    private Ticket ticket;

    @Column(name = "moderator")
    private String moderator;

    @Column(name = "date_start")
    @Temporal(TemporalType.DATE)
    private Date dateStart;

    @Column(name = "date_end")
    @Temporal(TemporalType.DATE)
    private Date dateEnd;
}
