package observerPattern_practice_elevator;

public class Main {
    public static void main(String[] args) {

        // subject
        ElevatorController elevatorController = new ElevatorController();

        // observer
        Observer controllerRoomDisplay = new ControllerRoomDisplay(elevatorController);
        Observer elevatorDisplay = new ElevatorDisplay(elevatorController);
        Observer floorDisplay = new FloorDisplay(elevatorController);
        Observer voiceNotice = new VoiceNotice(elevatorController);

        // attach
        elevatorController.attach(elevatorDisplay);
        elevatorController.attach(voiceNotice);
        elevatorController.attach(floorDisplay);
        elevatorController.attach(controllerRoomDisplay);

        // data change
        elevatorController.gotoFloor(5);
        elevatorController.gotoFloor(10);

    }
}

