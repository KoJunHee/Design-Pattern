package statePattern02;

public class ClosingState implements State {

    @Override
    public void click(Context context) {
        System.out.println("click");
        context.setState(new OpeningState());
    }

    @Override
    public void complete(Context context) {
        System.out.println("complete");
        context.setState(new ClosedState());
    }

    @Override
    public void timeout(Context context) {

    }

}
