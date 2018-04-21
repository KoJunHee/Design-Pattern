package observerPattern_practice_battery;

public class Main {
    public static void main(String[] args) {
        Battery battery = new Battery();
        BatteryLevelDisplay batteryLevelDisplay = new BatteryLevelDisplay(battery);
//        LowBatteryWarning lowBatteryWarning = new LowBatteryWarning(battery);

        battery.attatch(batteryLevelDisplay);
//        battery.attatch(lowBatteryWarning);

        battery.consum(30);
        battery.consum(40);



    }
}
