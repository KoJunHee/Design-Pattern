package ocp_practice_MP3;

import java.util.Calendar;

public class RealTimeProvider implements TimeProvider {

    private Calendar calendar;

    public RealTimeProvider() {
        this.calendar = Calendar.getInstance();
    }

    @Override
    public void setHours(int hours) {

    }

    @Override
    public int getTime() {
        return calendar.get(Calendar.HOUR_OF_DAY);
    }
}





