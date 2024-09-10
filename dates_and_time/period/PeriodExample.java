package oracle_certification_preparation.dates_and_time.period;

import java.time.LocalDate;
import java.time.Period;

/**
 * Period es una clase en el paquete java.time que representa una cantidad de tiempo en términos de años, meses y días.
 * Es parte de la API de fecha y hora introducida en Java 8. Period es inmutable y thread-safe, lo que significa que una
 * vez creada, su valor no puede cambiar.
 */
public class PeriodExample {
    public static void main(String[] args) {
        // Puedes crear una instancia de Period que represente un período específico usando el método estático of().
        Period period = Period.of(1, 2, 3); // 1 año, 2 meses, 3 días
        System.out.println("Period: " + period);

        // Puedes crear un período a partir de solo días, meses o años usando los métodos estáticos ofDays(), ofMonths(), y ofYears().
        Period daysPeriod = Period.ofDays(10);
        Period monthsPeriod = Period.ofMonths(5);
        Period yearsPeriod = Period.ofYears(2);

        System.out.println("Period of days: " + daysPeriod);
        System.out.println("Period of months: " + monthsPeriod);
        System.out.println("Period of years: " + yearsPeriod);

        // Puedes obtener componentes individuales de un período, como los años, meses y días.
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

        // Puedes sumar y restar períodos a una fecha usando métodos como plus() y minus().
        LocalDate today = LocalDate.now();

        LocalDate futureDate = today.plus(period);
        LocalDate pastDate = today.minus(period);

        System.out.println("Today's date: " + today);
        System.out.println("Future date: " + futureDate);
        System.out.println("Past date: " + pastDate);

        // Puedes calcular la diferencia entre dos fechas en términos de años, meses y días usando el método between().
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 10, 5);

        Period periodd = Period.between(startDate, endDate);

        System.out.println("Period between dates: " + period);
        System.out.println("Years: " + periodd.getYears());
        System.out.println("Months: " + periodd.getMonths());
        System.out.println("Days: " + periodd.getDays());

    }
}
