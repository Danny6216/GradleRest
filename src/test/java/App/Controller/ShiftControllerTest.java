package App.Controller;

import App.model.Domain.Shift;
import App.model.jpa.ShiftCRUD;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class ShiftControllerTest {

    @Resource(name = "shiftCRUD")
    ShiftCRUD shiftCRUD;

    @Test
    public void shift() {
        Shift shift = shiftCRUD.getShiftByModerator(2);

    }
}