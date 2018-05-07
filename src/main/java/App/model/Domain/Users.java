package App.model.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter @Setter
@Entity
@Table(name = "users")
@Access(AccessType.FIELD)
public class Users extends Domain {

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

//    @OneToMany(mappedBy = "id")
//    private List<Ticket> ticketList;
//
//    @OneToMany(mappedBy = "id")
//    private List<Shift> shiftList;
//
//    @OneToMany(mappedBy = "id")
//    private List<TicketChat> ticketChatList;
}
