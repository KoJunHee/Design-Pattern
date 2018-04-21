package observerPattern_practice_elevator;

public class ElevatorController extends Subject {

    private int curFloor = 1;

    @Override
    public void attatch(Observer observer) {
        super.observerList.add(observer);
    }

    @Override
    public void detatch(Observer observer) {
        super.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : super.observerList) {
            observer.update();
        }
    }
    public void gotoFloor(int destination){
        this.curFloor = destination;
        this.notifyObservers();
    }

    public int getCurFloor(){
        return this.curFloor;
    }
}
