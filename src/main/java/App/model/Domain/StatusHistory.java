package App.model.Domain;


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
    @ManyToOne
    @JoinColumn(name = "ticket")
    private Ticket ticket;

    @Column (name = "date_change")
    @Temporal(TemporalType.DATE)
    private Date dateChange;

    @Column(name = "note")
    private String note;

    @Column( name = "status")
    private String status;
}
