package observerPattern_practice_battery;

import java.util.ArrayList;
import java.util.List;

public class Battery implements Subject {
    private int level = 100;
    private static List<Observer> observerList = new ArrayList<Observer>();


    @Override
    public void attatch(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detatch(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public void consum(int amount) {
        this.level -= amount;
        this.notifyObservers();
    }

    public int getLevel(){
        return this.level;
    }
}
