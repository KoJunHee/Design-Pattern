package strategyPattern02;

import java.util.Date;

public class Customer {
    private Advisor advisor;


    public Firework getRecommended(){
        return advisor.recommend();
    }


}
