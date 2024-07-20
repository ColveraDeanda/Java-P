package oracle_certification_preparation.primitive_literals;

public class PrimitiveLiterals {


    public static void main(String[] args) {
        // Un entero que empiece con 0, se tomará como octal.
        int myOctalNumber = 070;  // 70 en octal es 56 in decimal notation (nuestra notacion es decial, osea 10).
        System.out.println(myOctalNumber);

        // Un entero que empiece con 0x, se tomará como hexal.
        int myHexalNumber = 0x7E; // 7E hexadecimal es 126 en decimal notation.
        System.out.println(myHexalNumber);

        /**
         * En jave 7 el nuevo binary literal fue añadido.
         */
        // Un entero que empiece con 0b o 0B, se tomará como binario.
        int myBinaryNumber = 0b101; // 101 binario es 5 decimal.
        int mySecondBynaryNumber = 0B101; // lo mismo de arriba.

        System.out.println(myBinaryNumber);
        System.out.println(mySecondBynaryNumber);


        /**
         * Tambien en Java 7 se pueden usar undercores (_) en numeros para la legibilidad.
         */

        int myFirstInt = 12345345;
        int myOtherInt = 12_345_345; // Lo mismo de arriba.

        System.out.println(myFirstInt); // 12345345
        System.out.println(myOtherInt); // 12345345

        double myFirstDouble = 1.678678;
        double mySecondDouble = 1.678_678; // Lo mismo de arriba

        System.out.println(myFirstDouble); // 1.678678
        System.out.println(mySecondDouble); // 1.678678

        // REGLAS DONDE NO SE PUEDE USAR UNDERSCORE (_).
        /**
         * 1. No se puede usar al principio o final del numero.
         * 2. No se puede usar inmediatamente antes o despues del punto decimal.
         */

        int myInteger2 = 30_456; // legal
        // int myInteger3 = 30_345_; Ilegal

        double myDouble2 = 10_345_234.50; // Legal
        // double yDouble = 30_345_.60; Ilegal









    }
}
