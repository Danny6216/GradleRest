package App.model.jpa;

import App.model.Domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCRUD extends JpaRepository<Ticket, Long> {
    Ticket getTicketById(Long id);
}
