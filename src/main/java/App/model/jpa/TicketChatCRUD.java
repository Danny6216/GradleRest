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

    List<TicketChat> findAllByDateCreateBefore(@Param("date") Date date);

    List<TicketChat> findAllByTicket(@Param("ticketid") Long ticket);

    List<TicketChat> findAllByTicketOrderByDateCreateAsc(@Param("ticketid") Long ticket);

    List<TicketChat> findAllByTicketOrderByDateCreateDesc(@Param("ticketid") Long ticket);

    List<TicketChat> findAllByTicketAndAuthor(
            @Param("ticketid") Long ticket,
            @Param("author") Long author);

    List<TicketChat> findAllByAuthor(@Param("author") Long author);

    List<TicketChat> findAllByDateCreateBetween(
            @Param("dateFrom") Date date1,
            @Param("dateTo") Date date2);
}
