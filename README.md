# Exploring Java Date and Time API
Submitted by: Baruc, Jana Enigma S.

### Exercise 1: `LocalDate` and `DateTimeFormatter`
1. **Prediction**: `Local Date: 2025-08-21`, `Formatted Local Date: 21/08/2025`, `Formatted Local Date (with Day): Thursday, August 21, 2025`
    * `LocalDate.of()` will return the specific date without any formatting. To format the dates specifically, `DateFormatter` must be used. In this case, `DateFormatter.ofPattern()` was used to achieve the specific formats required.
2. **Observation/Output**

![Exercise 1 Output](exercise1.png)

### Exercise 2: `LocalTime` and `DateTimeFormatter`
1. **Prediction**: `Default format: 16:45:30`, `24-hour format: 16:45:30`, `12-hour format with AM/PM: 4:45:30 PM`
    * `LocalTime.of()` will return the specific time without any formatting. To format the times specifically, similar to dates, `DateFormatter` must be used. In this case, `DateFormatter.ofPattern()` was used to achieve the specific formats required.
2. **Observation/Output**

![Exercise 2 Output](exercise2.png)