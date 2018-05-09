package ocp_practice_MP3;


public class TimeReminder {

    private TimeProvider timeProvider;
    private MP3 mp3 = new MP3();

    public void setTimeProvider(TimeProvider timeProvider){
        this.timeProvider = timeProvider;
    }

    public void remind(){
        int hours = timeProvider.getTime();
        if(hours>=18){
            mp3.playSong();
        }else{
            System.out.println("MP3 does not play song");
        }
    }

}


