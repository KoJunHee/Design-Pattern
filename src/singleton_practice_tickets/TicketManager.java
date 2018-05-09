package singleton_practice_tickets;

public class TicketManager {
    private int limits;
    private int count;
    private static TicketManager instance;

    private TicketManager() {
        this.count = 0;
    }

    // 오직 하나의 티켓 발행기 생성
    public synchronized static TicketManager getInstance(){
        if(instance==null){
            instance = new TicketManager();
        }

        return instance;
    }

    // 티켓 개수 한정
    public synchronized void setTicketLimits(int limits){
        this.limits = limits;
    }

    // 티켓 생성
    public synchronized Ticket getTicket(){
        if(this.count < this.limits){
            return new NormalTicket(++this.count);
        }else{
            return new NullTicket();
        }
    }



}


