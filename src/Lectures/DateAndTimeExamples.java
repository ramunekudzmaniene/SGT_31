package Lectures;

import java.time.*;
import java.time.Duration;
import java.time.temporal.IsoFields;

public class DateAndTimeExamples {
    public static void main(String[] args) {

        //Local time
        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println("Now is " + localTime);
        System.out.println(localTime.getHour() + "/" + localTime.getMinute() + "/" + localTime.getSecond());
        System.out.printf("%d/%d/%d\n", localTime.getHour(), localTime.getMinute(), localTime.getSecond());

        LocalTime localTime1 = LocalTime.now().withNano(0).withSecond(0);
        System.out.println(localTime1);
        //Increase localTime bu 15 min
        localTime1 = localTime1.plusMinutes(15);
        System.out.println("Break until " + localTime1);

        // Local date
        LocalDate localDate = LocalDate.now();
        System.out.println("Today is: " + localDate);
        System.out.println("year is " + localDate.getYear());
        System.out.println("Day of the week " + localDate.getDayOfWeek());
        System.out.println("Day of the year " + localDate.getDayOfYear());
        System.out.println("Week of the year " + (localDate.getDayOfYear()/7 + 1));

        System.out.println(localDate.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));

        //date format
        LocalDate localDate1 = LocalDate.of(2019, Month.DECEMBER, 11);
        System.out.println("Covid first case: " + localDate1);

        //Local Date Time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and time: " + localDateTime);

        LocalDateTime firstInternationalCatsDay = LocalDateTime.of(1997, 11, 20, 10, 45, 25, 0);
        System.out.println("First International Cats Day: " + firstInternationalCatsDay);

        int currentMonth = firstInternationalCatsDay.getMonthValue();

        switch (currentMonth) {
            case 11:
                System.out.println("Lapkritis");
                break;
            default:
                System.out.println("November");
                break;
        }
        //Duration
        System.out.println(Duration.ofHours(11).toMinutes());
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2)).toMinutes());
        System.out.println(Duration.between(firstInternationalCatsDay, LocalDateTime.now()).toDays());

        //Period
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(160)).getMonths());




    }
}
