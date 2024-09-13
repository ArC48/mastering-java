package lecture5.examples;

import java.time.*;

public class NewDateAndTimeApiExamples {

    public static void main(String[] args) {
        Instant now = Instant.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(2023, 5, 20, 5, 10, 51);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        zonedDateTime.plusDays(2);
        localTime.minusHours(5);

        System.out.println("LocalDate: " + localDate);
        System.out.println("LocalTime: " + localTime);
        System.out.println("LocalDateTime: " + localDateTime);
        System.out.println("ZonedDateTime: " + zonedDateTime);

        System.out.println();

        Period period = Period.of(5, 1, 10);
        Duration duration = Duration.ofHours(5);
        System.out.println(period);
        System.out.println(duration);

        System.out.println(localDateTime.minus(period));
        System.out.println();

        Instant later = Instant.now();
        System.out.println(Duration.between(now, later));
    }
}
