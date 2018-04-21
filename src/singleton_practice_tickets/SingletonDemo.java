package singleton_practice_tickets;

public class SingletonDemo {
    public static void main(String[] args) {
        Printer printer = Printer.getInstance();
        printer.setTicketNum(5);
        printer.print();
        printer.print();
        printer.print();
        printer.print();
        printer.print();

        printer.print();
        printer.print();
        printer.print();

    }
}
