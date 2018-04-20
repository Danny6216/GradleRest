package App.model.jpa;

import App.model.Domain.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShiftCRUD extends CrudRepository<Shift, Long> {
    Shift findShiftById(Long id);
    Shift findShiftByModerator(String moderator);
    void deleteById(Long id);

}
