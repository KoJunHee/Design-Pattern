package statePattern02;

public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    @Override
    public String toString() {
        return "Context{" +
                "state=" + state +
                '}';
    }
}


