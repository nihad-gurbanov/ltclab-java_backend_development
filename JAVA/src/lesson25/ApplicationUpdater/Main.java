package lesson25.ApplicationUpdater;

public class Main {
    public static void main(String[] args) {
        ApplicationUpdater updater = new ApplicationUpdater();
        updater.installOrUpdateApplication("App1", "1.0");
        updater.installOrUpdateApplication("App2", "2.0");
        updater.installOrUpdateApplication("App1", "1.1");
        updater.installOrUpdateApplication("App2", "1.8");
        updater.installOrUpdateApplication("App3", "3.0");
    }
}
