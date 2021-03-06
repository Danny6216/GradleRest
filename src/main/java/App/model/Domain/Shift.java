package App.model.Domain;

import com.fasterxml.jackson.annotation.JsonFormat;
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

//    @ManyToOne
//    @JoinColumn(name = "ticket_id")
//    private Ticket ticket;

//    @ManyToOne
//    @JoinColumn(name = "moderator")
//    private Users moderator;

    @Column(name = "moderator")
    private Long moderator;

    @Column(name = "ticket_id")
    private Long ticket;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Column(name = "date_start")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateStart;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Column(name = "date_end")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnd;
}
