package observerPattern_practice_elevator;

public class ControllerRoomDisplay implements Observer{
    ElevatorController elevatorController;

    public ControllerRoomDisplay(ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
    }

    @Override
    public void update() {
        System.out.println("ControllerRoomDisplay : " + elevatorController.getCurFloor());
    }
}


