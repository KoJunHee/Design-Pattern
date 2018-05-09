package singleton_practice_tickets;

public class UserThread extends Thread{

    private Ticket myTicket;

    public UserThread(String name) {
        super(name);
    }

    public void run(){
        TicketManager ticketManager = TicketManager.getInstance();
        this.myTicket = ticketManager.getTicket();
    }

    public Ticket getMyTicket(){
        return this.myTicket;
    }
}


