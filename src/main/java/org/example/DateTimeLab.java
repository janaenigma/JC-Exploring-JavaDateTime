package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeLab {
    public static void main(String[] args) {

        // Exercise 1: LocalDate and DateTimeFormatter
        LocalDate localDate = LocalDate.of(2025, 8, 21);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedLocalDate = localDate.format(formatter);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        String formattedLocalDateWithDay = localDate.format(formatter1);

        System.out.println("Local Date: " + localDate);
        System.out.println("Formatted Local Date: " + formattedLocalDate);
        System.out.println("Formatted Local Date (with Day): " + formattedLocalDateWithDay);


    }
}