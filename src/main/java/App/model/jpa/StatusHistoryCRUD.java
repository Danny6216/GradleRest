package App.model.jpa;

import App.model.Domain.StatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "status", path = "status")
public interface StatusHistoryCRUD extends PagingAndSortingRepository<StatusHistory, Long> {

    StatusHistory findById(@Param("id") Long id);

    StatusHistory findTopByTicketId(@Param("ticket_id") Long ticketId);

    StatusHistory findTopByTicketIdOrderByIdDesc(@Param("ticket_id") Long ticketId);

    List<StatusHistory> findAllByTicketId(@Param("ticket_id") Long ticketId);

    List<StatusHistory> findAllByStatus(@Param("status") String status);

    List<StatusHistory> findAllByDateChangeBetween(
            @Param("dateFrom") Date date1,
            @Param("dateTo") Date date2);
}
