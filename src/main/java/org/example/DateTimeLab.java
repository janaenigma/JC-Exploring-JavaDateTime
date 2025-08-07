package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeLab {
    public static void main(String[] args) {

        // Exercise 1: LocalDate and DateTimeFormatter
//        LocalDate localDate = LocalDate.of(2025, 8, 21);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
//
//        System.out.println("Local Date: " + localDate);
//        System.out.println("Formatted Local Date: " + localDate.format(formatter));
//        System.out.println("Formatted Local Date (with Day): " + localDate.format(formatter1));

        // Exercise 2: LocalTime and DateTimeFormatter
//        LocalTime now = LocalTime.of(16, 45, 30);
//
//        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");
//        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss a");
//
//        System.out.println("Default format: " + now);
//        System.out.println("24-hour format: " + now.format(dtf1));
//        System.out.println("12-hour format with AM/PM: " + now.format(dtf2));

        // Exercise 3: LocalDateTime and DateTimeFormatter
        LocalDateTime event = LocalDateTime.of(2025, 11, 27, 19, 0, 0);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm a");

        System.out.println("Default format: " + event);
        System.out.println("Custom format: " + event.format(dtf));

    }
}