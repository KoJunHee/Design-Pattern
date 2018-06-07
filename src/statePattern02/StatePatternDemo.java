package statePattern02;


public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        // Closed
        State currentState = new ClosedState();
        System.out.println(currentState.toString()); //null

        // Opening
        currentState.click(context);
        currentState = context.getState();
        System.out.println(context.getState());

        // Open
        currentState.complete(context);
        currentState = context.getState();
        System.out.println(context.getState());

        // Closing
        currentState.timeout(context);
        currentState = context.getState();
        System.out.println(context.getState());

        // Closed
        currentState.complete(context);
        System.out.println(context.getState());
    }
}





