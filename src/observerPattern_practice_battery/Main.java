package observerPattern_practice_battery;

public class Main {
    public static void main(String[] args) {

        // subject
        Battery battery = new Battery();

        // observer
        Observer batteryLevelDisplay = new BatteryLevelDisplay(battery);
        Observer lowBatteryWarning = new LowBatteryWarning(battery);

        // attach
        battery.atatch(batteryLevelDisplay);
        battery.atatch(lowBatteryWarning);

        // consume
        battery.consume(30);
        battery.consume(30);
        battery.consume(30);

    }
}


