package observerPattern_practice_battery;

public interface Subject {
    public void attatch(Observer observer);
    public void detatch(Observer observer);
    public void notifyObservers();
}
