package statePattern02;

public class OpenState implements State {
    @Override
    public void click(Context context) {
        context.setState(new StayOpenState());

    }

    @Override
    public void complete(Context context) {

    }

    @Override
    public void timeout(Context context) {
        System.out.println("timeout");
        context.setState(new ClosingState());

    }


}
