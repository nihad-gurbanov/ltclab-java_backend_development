package lesson25.ApplicationUpdater;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationUpdater {
    List<Application> appList = new ArrayList<>();

    public void installOrUpdateApplication(String name, String version) {
        Application existingApp = findApplicationByName(name);

        if (existingApp == null) {
            // If application does not exist, install it
            appList.add(new Application(name, version));
            System.out.println("Application " + name + " version " + version + " installed.");
        } else {
            // If application exists, check versions
            if (isNewerVersion(existingApp.getVersion(), version)) {
                existingApp.setVersion(version);
                System.out.println("Application " + name + " updated to version " + version + ".");
            } else if (existingApp.getVersion().equals(version)) {
                System.out.println("Application " + name + " is already at version " + version + ".");
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("An older version of " + name + " is already installed.");
                System.out.print("Do you want to downgrade to version " + version + "? (yes/no): ");
                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("yes")) {
                    existingApp.setVersion(version);
                    System.out.println("Application " + name + " downgraded to version " + version + ".");
                } else {
                    System.out.println("Installation of older version " + version + " cancelled.");
                }
            }
        }
    }
    private Application findApplicationByName(String name) {
        for (Application app : appList) {
            if (app.getName().equals(name)) {
                return app;
            }
        }
        return null;
    }

    private boolean isNewerVersion(String currentVersion, String newVersion) {
        // Basic version comparison logic
        return currentVersion.compareTo(newVersion) < 0;
    }
}
