package oracle_certification_preparation.dates_and_time.local_date_time;

import java.time.LocalDateTime;

/**
 * LocalDateTime es una clase en el paquete java.time que representa una fecha y hora sin una zona horaria específica.
 * Es parte de la API de fecha y hora introducida en Java 8. LocalDateTime es inmutable y thread-safe,
 * lo que significa que una vez creada, su valor no puede cambiar.
 */
public class LocalDateTimeExample {

    public static void main(String[] args) {
        // Puedes crear una instancia de LocalDateTime que represente la fecha y hora actual usando el método estático now().
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        // Puedes crear una instancia de LocalDateTime que represente una fecha y hora específica usando el método estático of().
        LocalDateTime specificDateTime = LocalDateTime.of(2023, 10, 5, 14, 30, 15); // 2023-10-05T14:30:15
        System.out.println("Specific date and time: " + specificDateTime);

        // Puedes obtener componentes individuales de una fecha y hora, como el año, mes, día, hora, minuto, segundo y nanosegundo.
        LocalDateTime dateTime = LocalDateTime.of(2023, 10, 5, 14, 30, 15);

        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();
        int hour = dateTime.getHour();
        int minute = dateTime.getMinute();
        int second = dateTime.getSecond();
        int nano = dateTime.getNano();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Nanosecond: " + nano);

        // Puedes manipular fechas y horas usando métodos como plusDays(), minusDays(), plusHours(), minusHours(), etc.
        LocalDateTime nextWeek = now.plusDays(7);
        LocalDateTime lastMonth = now.minusMonths(1);
        LocalDateTime inTwoHours = now.plusHours(2);

        System.out.println("Current date and time: " + now);
        System.out.println("Date and time next week: " + nextWeek);
        System.out.println("Date and time last month: " + lastMonth);
        System.out.println("Date and time in two hours: " + inTwoHours);

        // Puedes comparar fechas y horas usando métodos como isBefore(), isAfter(), y isEqual().
        LocalDateTime dateTime1 = LocalDateTime.of(2023, 10, 5, 14, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(2023, 10, 10, 16, 45);

        boolean isBefore = dateTime1.isBefore(dateTime2);
        boolean isAfter = dateTime1.isAfter(dateTime2);
        boolean isEqual = dateTime1.isEqual(dateTime2);

        System.out.println("DateTime1 is before DateTime2: " + isBefore);
        System.out.println("DateTime1 is after DateTime2: " + isAfter);
        System.out.println("DateTime1 is equal to DateTime2: " + isEqual);
    }
}
