package oracle_certification_preparation.inmutable_strings;

public class InmutableStrings {

    public static void main(String[] args) {

        /**
         * Los Strings son inmutables. Esto se sabe por que al usar un metodo como trim() o toUpperCase(), se retorna un nuevo string.
         *
         * En el caso de tener un String y a ese String le asignamos un nuevo valor (puede ser un string normal o un string usando +). Lo que
         * está pasando es que al asignarle un nuevo valor, se está creando un nuevo objeto String. Entonces el objeto String anterior se queda si
         * apuntar a ninguna variable,
         *
         * Tener esa variable sin referencia hace que el garbage collector eventualmente la elimine. Hay que tomar en cuenta que esto puede afectar
         * el performance.
         */

        String a = "It is";
        String b = "a dog";
        String c = "day afternoon";

        a = a + b + c; // Creando un nuevo objeto String.
        c = "Wow"; // Creando un nuevo objeto String.
        // "It is" y "day afternoon" eventualmente los eliminará el garbage collector.

        /**
         * Cuando se estan manejando muchos Strings, la solucion aqui es usar: StringBuilder y StringBuffer. Esto hace que el String sea mutable.
         * Diferencia entre StringBuffer y StringBuilder es:
         *      *    StringBuffer es thread-safe.
         *      *    StringBuilder no es thread-safe.
         */

        // Ejemplo usando String inmutables y concatenacion:
        String message = "Hello";
        message += "Hello world";
        message += "Today is...";
        message += ".";
        System.out.println(message);

        // Ejemplo usando StringBuilder:
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append("Hello world");
        sb.append("Today is...");
        sb.append(".");
        System.out.println(sb);

        /**
         * The String class has a method called "toUpperCase()."  What will the following code print?
         *
         * String greeting = "Welcome to Learn Java with Intertech!";
         * greeting.toUpperCase();
         * System.out.println(greeting);
         *
         * R = Welcome to Learn Java with Intertech!
         */

        /**
         * What does the following code print?
         *
         * int x = 3;
         * int y = 10;
         * System.out.println( x + y );
         *
         * R = 13
         */

        /**
         * What does the following code print?
         *
         * int x = 3;
         * int y = 5;
         * System.out.println(x + y + " : " + x + y);
         *
         * R = 8:35 (se toma el + como suma, hasta que es aplicado a un string. De ahi en adelante todo se tomará como string)
         */

        /**
         * String greeting = "Welcome to Learn Java with Intertech!";
         * greeting = greeting.substring(0, 7);
         * System.out.println("greeting");
         *
         * R = greeting
         */

    }





}
