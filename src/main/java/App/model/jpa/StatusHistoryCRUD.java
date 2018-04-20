package App.model.jpa;

import App.model.Domain.StatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusHistoryCRUD extends JpaRepository<StatusHistory, Long> {
}
