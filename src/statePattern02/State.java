package statePattern02;

public interface State {
    public void click(Context context);
    public void complete(Context context);
    public void timeout(Context context);
}




