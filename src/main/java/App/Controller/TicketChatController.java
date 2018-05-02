//package App.Controller;
//
//import App.model.Domain.TicketChat;
//import App.model.jpa.TicketCRUD;
//import App.model.jpa.TicketChatCRUD;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class TicketChatController {
//
//    private TicketChatCRUD ticketChatCRUD;
//
//    public TicketChatController(@Autowired TicketChatCRUD ticketChatCRUD){
//        this.ticketChatCRUD = ticketChatCRUD;
//    }
//    @GetMapping("/ticket_chat")
//    public TicketChat getTicketChat(@RequestParam Long id){
//        return ticketChatCRUD.getOne(id);
//    }
//    @PostMapping("/ticket_chat")
//    public void addTicketChat(@RequestParam TicketChat ticketChat){
//        ticketChatCRUD.save(ticketChat);
//    }
//}
