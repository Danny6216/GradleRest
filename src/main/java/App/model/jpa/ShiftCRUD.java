package App.model.jpa;

import App.model.Domain.Shift;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "shifts", path = "shifts")
public interface ShiftCRUD extends PagingAndSortingRepository<Shift, Long> {

    Shift findById(@Param("id") Long id);

    List<Shift> findAllByModerator(@Param("moderator") Long moderator);

    List<Shift> findAllByDateStart(@Param("dstart") Date date);

    List<Shift> findAllByDateEnd(@Param("dend") Date date);

    List<Shift> findAllByTicket(@Param("ticket_id") Long id);

    Shift findTopByTicketOrderByDateStartDesc(@Param("ticket_id") Long ticket);

}