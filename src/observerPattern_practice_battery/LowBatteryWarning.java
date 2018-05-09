package observerPattern_practice_battery;

public class LowBatteryWarning implements Observer {
    private static final int LOW_BATTERY = 30;
    Battery battery;

    public LowBatteryWarning(Battery battery) {
        this.battery = battery;
    }

    @Override
    public void update() {
        if(battery.getLevel() < LOW_BATTERY){
            System.out.println("LowBatteryWarning : " + battery.getLevel());
        }
    }
}

