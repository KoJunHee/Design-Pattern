package observerPattern_practice_elevator;

public class ElevatorDisplay implements Observer{
    ElevatorController elevatorController;

    public ElevatorDisplay(ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
    }

    @Override
    public void update() {
        System.out.println("ElevatorDisplay : " + elevatorController.getCurFloor() );
    }
}


