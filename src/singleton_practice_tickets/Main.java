package singleton_practice_tickets;

public class Main {
    private static final int THREAD_NUM = 15;

    public static void main(String[] args) {

        TicketManager ticketManager = TicketManager.getInstance();
        ticketManager.setTicketLimits(5);
        UserThread[] userThreads = new UserThread[THREAD_NUM];

        for (int i = 0; i < THREAD_NUM; i++) {
            userThreads[i] = new UserThread((i + 1) + "-thread");
            userThreads[i].start();
        }

           for (int i = 0; i < THREAD_NUM; i++) {
            try{
                //해당 스레드가 멈출때까지 멈춤
                userThreads[i].join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        for (int i = 0; i < THREAD_NUM; i++) {
            if(userThreads[i].getMyTicket().getTicketNum()!=0){
                System.out.println(userThreads[i].getMyTicket().getTicketNum());
            }
        }

    }
}


