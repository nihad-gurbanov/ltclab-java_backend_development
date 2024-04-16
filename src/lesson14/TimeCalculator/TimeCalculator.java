package lesson14.TimeCalculator;

public class TimeCalculator {
    // 15 10  16 20
    String calculateDifference(int hour1, int minute1, int hour2, int minute2) {
        int difference = (hour1 * 60 + minute1) - (hour2 * 60 + minute2);

        int hourDifference = Math.abs(difference / 60);
        int minuteDifference = Math.abs(difference % 60);


        return hourDifference + " " + minuteDifference;
    }
}
