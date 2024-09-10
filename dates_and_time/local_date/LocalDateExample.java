package oracle_certification_preparation.dates_and_time.local_date;

/**
 * LocalDate es una clase en el paquete java.time que representa una fecha sin una zona horaria específica.
 * LocalDate es inmutable y thread-safe, lo que significa que una vez creada, su valor no puede cambiar.
 */

import java.time.LocalDate;

/**
 * - Representa una fecha (año, mes, día) sin información de hora.
 * - Es inmutable y thread-safe.
 * - Proporciona métodos para manipular y obtener información sobre fechas.
 */
public class LocalDateExample {

    public static void main(String[] args) {
        // crear una instancia de LocalDate que represente la fecha actual usando el método estático now().
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // Instancia de LocalDate que represente una fecha específica usando el método estático of().
        LocalDate specificDate = LocalDate.of(2023, 10, 5);
        System.out.println("Specific date: " + specificDate);

        // Puedes obtener componentes individuales de una fecha, como el año, mes y día.
        int year = specificDate.getYear();
        int month = specificDate.getMonthValue();
        int day = specificDate.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);

        // Puedes manipular fechas usando métodos como plusDays(), minusDays(), plusMonths(), minusMonths(), etc.
        LocalDate nextWeek = today.plusDays(7);
        LocalDate lastMonth = today.minusMonths(1);

        System.out.println("Today's date: " + today);
        System.out.println("Date next week: " + nextWeek);
        System.out.println("Date last month: " + lastMonth);

        // Puedes comparar fechas usando métodos como isBefore(), isAfter(), y isEqual().
        LocalDate date1 = LocalDate.of(2023, 10, 5);
        LocalDate date2 = LocalDate.of(2023, 10, 10);

        boolean isBefore = date1.isBefore(date2);
        boolean isAfter = date1.isAfter(date2);
        boolean isEqual = date1.isEqual(date2);

        System.out.println("Date1 is before Date2: " + isBefore);
        System.out.println("Date1 is after Date2: " + isAfter);
        System.out.println("Date1 is equal to Date2: " + isEqual);
    }

}
