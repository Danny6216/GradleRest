package App.Controller;

import App.model.Domain.Shift;
import App.model.jpa.ShiftCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShiftController {
    @Autowired
    private ShiftCRUD shiftCRUD;

    @GetMapping(value = "/shift")
    public Shift shift(@RequestParam(value = "id", defaultValue = "1") Long id){
        return shiftCRUD.findShiftById(id);
    }
    @PostMapping(value = "/shift")
    public void addShift(@RequestParam Shift shift){
        shiftCRUD.save(shift);
    }
    @DeleteMapping(value = "/shift")
    public void deleteShiftByModer(@RequestParam(value = "id", defaultValue = "1") Long id){
        shiftCRUD.deleteById(id);
    }
}
