package oracle_certification_preparation.dates_and_time.date_time_formatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * DateTimeFormatter es una clase en el paquete java.time.format que se utiliza para formatear y analizar objetos de fecha y hora en Java.
 * Es parte de la API de fecha y hora introducida en Java 8. DateTimeFormatter proporciona una forma flexible y poderosa de
 * convertir fechas y horas a cadenas y viceversa.
 */
public class DateTimeFormatterExample {

    public static void main(String[] args) {
        // Puedes usar DateTimeFormatter para convertir una fecha a una cadena con un formato específico.
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formattedDate = date.format(formatter);
        System.out.println("Formatted date: " + formattedDate);

        // Puedes usar DateTimeFormatter para convertir una cadena a un objeto de fecha con un formato específico.
        String dateString = "05/10/2023";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date1 = LocalDate.parse(dateString, formatter1);
        System.out.println("Parsed date: " + date1);

        // Puedes usar DateTimeFormatter para convertir una fecha y hora a una cadena con un formato específico.
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formattedDateTime = dateTime.format(formatter2);
        System.out.println("Formatted date and time: " + formattedDateTime);

        // Puedes usar DateTimeFormatter para convertir una cadena a un objeto de fecha y hora con un formato específico.
        String dateTimeString = "05/10/2023 14:30:15";
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime dateTime3 = LocalDateTime.parse(dateTimeString, formatter3);
        System.out.println("Parsed date and time: " + dateTime3);

        // DateTimeFormatter también proporciona formatos predefinidos que puedes usar directamente.
        // Formato ISO_LOCAL_DATE_TIME
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String isoFormattedDateTime = dateTime.format(isoFormatter);
        System.out.println("ISO formatted date and time: " + isoFormattedDateTime);

        // Formato RFC_1123_DATE_TIME
        DateTimeFormatter rfcFormatter = DateTimeFormatter.RFC_1123_DATE_TIME;
        String rfcFormattedDateTime = dateTime.format(rfcFormatter);
        System.out.println("RFC formatted date and time: " + rfcFormattedDateTime);

    }
}
