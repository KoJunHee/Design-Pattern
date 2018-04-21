package observerPattern_practice_elevator;

import java.util.*;

public abstract class Subject {
    protected List<Observer> observerList = new ArrayList<Observer>();
    public abstract void attatch(Observer observer);
    public abstract void detatch(Observer observer);
    public abstract void notifyObservers();
}
