package App.model.jpa;

import App.model.Domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "tickets", path = "tickets")
public interface TicketCRUD extends PagingAndSortingRepository<Ticket, Long> {
    Ticket findById(@Param("id") Long id);
//    List<Ticket> findAllByAuthor(@Param("") String email);
//    List<Ticket> findAllByUsername(@Param("user") String user);
    List<Ticket> findAllByDateCreated(@Param("created") Date date);
    List<Ticket> findAllByPriority(@Param("priority") String priority);
    List<Ticket> findAllByTaskNumber(@Param("tnum") String taskNumber);
    List<Ticket> findAllByTaskStage(@Param("tstage") String taskStage);
}
