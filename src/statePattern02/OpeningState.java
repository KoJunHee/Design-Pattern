package statePattern02;

public class OpeningState implements State  {
    @Override
    public void click(Context context) {
        System.out.println("click");
        context.setState(new ClosingState());
    }

    @Override
    public void complete(Context context) {
        System.out.println("complete");
        context.setState(new OpenState());
    }

    @Override
    public void timeout(Context context) {

    }
}
