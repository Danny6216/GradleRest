package App.Controller;

import App.model.Domain.Shift;
import App.model.jpa.ShiftCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShiftController {

    private ShiftCRUD shiftCRUD;

    public ShiftController(@Autowired ShiftCRUD shiftCRUD){
        this.shiftCRUD = shiftCRUD;
    }

    @GetMapping(value = "/shift")
    public Shift getShiftById(@RequestParam(value = "id", defaultValue = "1") Long id){
        return shiftCRUD.findShiftById(id);
    }
    @GetMapping
    public Shift getShiftById(
            @RequestParam(value = "moderator", defaultValue = "1") String moderator){
        return shiftCRUD.findShiftByModerator(moderator);
    }

    @PostMapping(value = "/shift")
    public void addShift(@RequestBody Shift shift){
        shiftCRUD.save(shift);
    }
    @DeleteMapping(value = "/shift")
    public void deleteShiftByModer(@RequestParam(value = "id", defaultValue = "1") Long id){
        shiftCRUD.deleteById(id);
    }
}
