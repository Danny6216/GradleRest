package App.model.Domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "ticket_chat")
public class TicketChat extends Domain {

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy-hh-mm-ss")
    @Column(name = "date_create")
    @Temporal(TemporalType.DATE)
    private Date dateCreate;

    @Column(name = "message")
    private String message;

//    @ManyToOne
//    @JoinColumn(name = "author")
//    private Users author;

//    @ManyToOne
//    @JoinColumn(name = "ticket_id", nullable = false)
//    private Ticket ticket;

    @Column(name = "ticket_id")
    private Long ticket;

    @Column(name = "author")
    private Long author;
}
