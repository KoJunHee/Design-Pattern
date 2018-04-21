package ass6_3;

public class SDKDownloadSubject extends Subject {
    private String mState;

    public String getState() {
        return mState;
    }
    public void netProcessChange(String data) {
        mState = data;
        this.motifyObservers();
    }

}
