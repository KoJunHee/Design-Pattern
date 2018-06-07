package statePattern02;

public class StayOpenState implements State  {
    @Override
    public void click(Context context) {
        System.out.println("click");
        context.setState(new ClosingState());
    }

    @Override
    public void complete(Context context) {

    }

    @Override
    public void timeout(Context context) {

    }
}
