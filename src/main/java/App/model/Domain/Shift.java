package App.model.Domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Getter @Setter
@Entity
@Table(name = "shift")
@Access(AccessType.FIELD)
public class Shift extends Domain {

    @ManyToOne
    @JoinColumn(name = "ticket")
    private Ticket ticket;

    @Column(name = "moderator")
    private Integer moderator;

    @Column(name = "date_start")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateStart;

    @Column(name = "date_end")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnd;
}
