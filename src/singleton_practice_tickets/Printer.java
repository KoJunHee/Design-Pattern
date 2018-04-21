package singleton_practice_tickets;

import java.util.ArrayList;
import java.util.List;

public class Printer {
    private static Printer instance = null;
    private List<Ticket> tickets;

    private Printer() {
    }

    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void setTicketNum(int num) {
        tickets = new ArrayList<Ticket>(num);
    }

    public void print() {
            if (tickets.size() == 5) {
            System.out.println("already full");
            return;
        }

        System.out.println("ticket is printed");
        tickets.add(new Ticket());
    }


}
