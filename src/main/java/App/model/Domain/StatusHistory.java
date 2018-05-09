package App.model.Domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Access(AccessType.FIELD)
@Table(name = "status_history")
public class StatusHistory extends Domain{

//    @ManyToOne
//    @JoinColumn(name = "ticket_id")
//    private Ticket ticket;

    @Column(name = "ticket_id")
    private Long ticketId;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy-hh-mm-ss")
    @Column (name = "date_change")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateChange;

    @Column(name = "note")
    private String note;

    @Column( name = "status")
    private String status;
}
