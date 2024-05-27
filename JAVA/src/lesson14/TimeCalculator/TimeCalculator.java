package lesson14.TimeCalculator;

import java.util.Arrays;

public class TimeCalculator {
    // 15 10  16 20
    String calculateDifference(int hour1, int minute1, int hour2, int minute2) {
        int totalMinutes1 = hour1 * 60 + minute1;
        int totalMinutes2 = hour2 * 60 + minute2;

        if (totalMinutes1 < 0 || totalMinutes2 < 0 ||
                hour1 > 23 || hour2 > 23 ||
                minute1 > 59 || minute2 > 59) {
            return "Invalid input: Negative time values are not allowed.";
        }

        int difference = Math.abs(totalMinutes1 - totalMinutes2);

        int hourDifference = difference / 60;
        int minuteDifference = difference % 60;

        return hourDifference + " hours " + minuteDifference + " minutes difference.";
    }

    String calculateDifference(String time1, String time2) {
        String[] timeArray1 = time1.split(":");
        String[] timeArray2 = time2.split(":");

        int hour1 = Integer.parseInt(timeArray1[0]);
        int minute1 = Integer.parseInt(timeArray1[1]);

        int hour2 = Integer.parseInt(timeArray2[0]);
        int minute2 = Integer.parseInt(timeArray2[1]);

        return calculateDifference(hour1, minute1, hour2, minute2);
    }
}
