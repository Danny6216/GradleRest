package App.model.Domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "ticket_chat")
public class TicketChat extends Domain{

    @ManyToOne
    @JoinColumn(name = "ticket", nullable = false)
    private Ticket ticket;

    @Column(name = "date_create")
    @Temporal(TemporalType.DATE)
    private Date dateCreate;

    @Column(name = "message")
    private String message;
}
