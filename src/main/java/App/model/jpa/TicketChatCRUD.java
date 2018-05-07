package App.model.jpa;

import App.model.Domain.Ticket;
import App.model.Domain.TicketChat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "chats", path = "chats")
public interface TicketChatCRUD extends PagingAndSortingRepository<TicketChat, Long> {

    List<TicketChat> findAllByDateCreate(@Param("date") Date date);
    @Query(value = "SELECT * FROM rest_msi.ticket_chat t WHERE t.ticket = ?1", nativeQuery = true)
    List<TicketChat> findAllByTicket(@Param("ticketid") Long ticket);

    List<TicketChat> findAllByAuthor(@Param("author") Long author);
}
