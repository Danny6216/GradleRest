package App.model.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Access(AccessType.FIELD)
@Table(name = "ticket")
public class Ticket{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToMany(mappedBy = "id")
    private List<TicketChat> ticketChats;

//    @OneToMany(mappedBy = "id")
//    private List<Shift> shifts;

    @Column(name = "priority")
    private String priority;

    @Column(name = "status")
//    @Enumerated(EnumType.STRING)
    private String ticketStatus;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "task_stage")
    private Integer taskStage;

    @Column(name = "task_number")
    private Integer taskNumber;

    @Column(name = "task_query")
    private String taskQuery;

    @Column(name = "task_modquer")
    private String taskModQuery;

    @Column(name = "date_created")
    @Temporal(TemporalType.DATE)
    private Date dateCreated;
}
