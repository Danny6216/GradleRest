package App.Controller;

import App.model.Domain.Ticket;
import App.model.jpa.TicketCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    TicketCRUD ticketCRUD;


    @GetMapping("/ticket")
    public Ticket getTicket(@RequestParam(value = "id", defaultValue = "1") Long id){
        return ticketCRUD.getTicketById(id);
    }

}
