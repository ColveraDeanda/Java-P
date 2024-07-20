package oracle_certification_preparation.string_objects;

public class StringObjects {

    public static void main(String[] args) {

        /**
         * Cuando creamos String usando new keyboard, siempre se creará un objeto String.
         * Siempre se creara un objeto string nuevo, aún cuando los strings son iguales.
         */
        String str1 = new String("Hola");
        String str2 = new String("Hola");

        // Esto no pasa cuando se usan String literals.
        /**
         * En este caso solo se esta creando un objeto y str4 apunta al mismo objeto que str3.
         */
        String str3 = "Casa";
        String str4 = "Casa";

        // Usando métodos en variables String
        // NOTA: Las variables String son inmutables. Aun usando los metodos, se tiene que crear una nueva variable String.

        String s = new String("Hello World    ");
        String sub = s.substring(4, 10); // Recordar que se cuenta el string desde 0. La letra que sea 4, es la que retornará.
                                         // el 2do parametro se refiere al ultimo caracter que NO queremos incluir. Retonará uno antes de 10.
        System.out.println(sub); // o Worl

        String trimmed = s.trim();
        String upper = s.toUpperCase();
        char w = s.charAt(6);
        System.out.println(w); // De igual forma, empieza desde 0 a contar y retornará la letra que llegue a la posicion que se puso en parámetro.

    }




}
