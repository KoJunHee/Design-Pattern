package observerPattern_practice_battery;

public class Battery extends Subject {
    private int level = 100;
    public void consume(int amount){
        level -= amount;
        notifyObservers();
    }
    public int getLevel(){
        return this.level;
    }
}


