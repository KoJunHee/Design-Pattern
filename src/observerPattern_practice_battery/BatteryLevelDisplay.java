package observerPattern_practice_battery;

public class BatteryLevelDisplay implements Observer{
    Battery battery;
    public BatteryLevelDisplay(Battery battery) {
        this.battery = battery;
    }
    @Override
    public void update() {
        System.out.println("BatteryLevelDisplay : " + battery.getLevel());
    }
}

