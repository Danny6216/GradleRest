package App.model.Domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "ticket_chat")
public class TicketChat extends Domain {

    @Column(name = "date_create")
    @Temporal(TemporalType.DATE)
    private Date dateCreate;

    @Column(name = "message")
    private String message;

//    @ManyToOne
//    @JoinColumn(name = "author")
//    private Users author;
//
//    @ManyToOne
//    @JoinColumn(name = "ticket", nullable = false)
//    private Ticket ticket;

    @Column(name = "ticket")
    private Long ticket;

    @Column(name = "author")
    private Long author;
}
