package statePattern02;

public class ClosedState implements State {
    @Override
    public void complete(Context context) {
    }

    @Override
    public void timeout(Context context) {

    }

    @Override
    public void click(Context context) {
        System.out.println("click");
        context.setState(new OpeningState());
    }

}


