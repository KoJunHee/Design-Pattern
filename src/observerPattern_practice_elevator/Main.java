package observerPattern_practice_elevator;

public class Main {
    public static void main(String[] args) {
        ElevatorController elevatorController = new ElevatorController();
        ElevatorDisplay elevatorDisplay = new ElevatorDisplay(elevatorController);
        FloorDisplay floorDisplay = new FloorDisplay(elevatorController);

        elevatorController.attatch(elevatorDisplay);
        elevatorController.attatch(floorDisplay);

        elevatorController.gotoFloor(10);
        elevatorController.gotoFloor(5);


    }
}
