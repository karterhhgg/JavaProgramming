package Java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPIExample {
    public static void main(String[] args) {
        // Working with LocalDate, LocalTime, and LocalDateTime
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

        // Formatting dates and times
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);

        // Creating specific dates
        LocalDate specificDate = LocalDate.of(2024, 1, 1);
        System.out.println("Specific date: " + specificDate);
    }
}
