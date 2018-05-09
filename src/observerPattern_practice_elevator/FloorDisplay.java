package observerPattern_practice_elevator;

public class FloorDisplay implements Observer{
    ElevatorController elevatorController;

    public FloorDisplay(ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
    }

    @Override
    public void update() {
        System.out.println("FloorDisplay : " + elevatorController.getCurFloor());
    }
}


