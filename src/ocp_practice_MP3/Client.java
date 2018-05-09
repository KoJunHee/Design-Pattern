package ocp_practice_MP3;

import java.util.Calendar;

public class Client {
    public static void main(String[] args) {

        // time reminder
        TimeReminder timeReminder = new TimeReminder();

        // time provider
        RealTimeProvider realTimeProvider = new RealTimeProvider();
        FakeTimeProvider fakeTimeProvider = new FakeTimeProvider(3);

        // set & remind
        timeReminder.setTimeProvider(fakeTimeProvider);
        timeReminder.remind();

        // set & remind
        timeReminder.setTimeProvider(realTimeProvider);
        timeReminder.remind();

    }
}



