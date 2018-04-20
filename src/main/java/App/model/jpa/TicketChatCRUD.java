package App.model.jpa;

import App.model.Domain.TicketChat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketChatCRUD extends JpaRepository<TicketChat, Long> {
}
