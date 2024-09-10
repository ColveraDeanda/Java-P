package oracle_certification_preparation.dates_and_time.local_time;

import java.time.LocalTime;

/**
 * LocalTime es una clase en el paquete java.time que representa una hora (hora, minuto, segundo, nanosegundo) sin una zona horaria específica.
 * Es parte de la API de fecha y hora introducida en Java 8. LocalTime es inmutable y thread-safe, lo que significa que una vez creada,
 * su valor no puede cambiar.
 */
public class LocalTimeExample {

    public static void main(String[] args) {
        // Puedes crear una instancia de LocalTime que represente la hora actual usando el método estático now().
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);

        // Puedes crear una instancia de LocalTime que represente una hora específica usando el método estático of().
        LocalTime specificTime = LocalTime.of(14, 30, 15); // 14:30:15
        System.out.println("Specific time: " + specificTime);

        // Puedes obtener componentes individuales de una hora, como la hora, minuto, segundo y nanosegundo.
        LocalTime time = LocalTime.of(14, 30, 15);

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        int nano = time.getNano();

        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Nanosecond: " + nano);

        // Puedes manipular horas usando métodos como plusHours(), minusHours(), plusMinutes(), minusMinutes(), etc.
        LocalTime inTwoHours = now.plusHours(2);
        LocalTime thirtyMinutesAgo = now.minusMinutes(30);

        System.out.println("Current time: " + now);
        System.out.println("Time in two hours: " + inTwoHours);
        System.out.println("Time thirty minutes ago: " + thirtyMinutesAgo);

        // Puedes comparar horas usando métodos como isBefore(), isAfter(), y isEqual().
        LocalTime time1 = LocalTime.of(14, 30);
        LocalTime time2 = LocalTime.of(16, 45);

        boolean isBefore = time1.isBefore(time2);
        boolean isAfter = time1.isAfter(time2);
        boolean isEqual = time1.equals(time2);

        System.out.println("Time1 is before Time2: " + isBefore);
        System.out.println("Time1 is after Time2: " + isAfter);
        System.out.println("Time1 is equal to Time2: " + isEqual);
    }


}
