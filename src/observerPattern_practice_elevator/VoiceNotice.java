package observerPattern_practice_elevator;

public class VoiceNotice implements Observer{
    ElevatorController elevatorController;

    public VoiceNotice(ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
    }

    @Override
    public void update() {
        System.out.println("VoiceNotice : " + elevatorController.getCurFloor() );
    }
}



