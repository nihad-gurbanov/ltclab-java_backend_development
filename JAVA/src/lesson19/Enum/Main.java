package lesson19.Enum;

import java.util.Date;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Month currentMonth = LocalDate.now().getMonth();

        if (currentMonth == Month.JUNE || currentMonth == Month.JULY || currentMonth == Month.AUGUST) {
            System.out.println("It is summer");
        } else {
            System.out.println("It is not summer but " + currentMonth);
        }
    }
}
