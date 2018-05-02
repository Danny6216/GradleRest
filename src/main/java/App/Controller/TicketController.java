//package App.Controller;
//
//import App.model.Domain.Ticket;
//import App.model.jpa.TicketCRUD;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class TicketController {
//
//    private TicketCRUD ticketCRUD;
//
//    public TicketController(@Autowired TicketCRUD ticketCRUD){
//        this.ticketCRUD = ticketCRUD;
//    }
//
//    @GetMapping("/ticket")
//    public Ticket getTicket(@RequestParam(value = "id", defaultValue = "1") Long id){
//        return ticketCRUD.getOne(id);
//    }
//    @DeleteMapping("/ticket")
//    public void deleteTicketById(@RequestParam Long id){
//        Ticket ticket = ticketCRUD.getOne(id);
//        ticketCRUD.delete(ticket);
//    }
//
//}
