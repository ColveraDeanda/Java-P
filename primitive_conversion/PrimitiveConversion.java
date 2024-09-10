package oracle_certification_preparation.primitive_conversion;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PrimitiveConversion {

    public static void main(String[] args) {
        byte a = 4;
        int x = a; // legal
        System.out.println(x);

        int x2 = 127;
        byte b2 = (byte) x2; // Se tiene que castear para que compile
        System.out.println(b2);

        int myInt = (byte) 18; // legal

      //  int mySecondInt = (int) true; // ilegal

        char myChar = 100; // legal, se toma como ACII
        System.out.println(myChar);

        // float f = 3.14; // Esto marcara error, ya que el valor es un double.
        // Para hacerlo flotante, debemos ponerle la F al final.
        float f2 = 3.14f;


        /**
         * Will this compile?
         * short s = 40;
         * int i = s;
         * s = i;
         *
         * La respuesta es NO. Se está tratando de meter una variable de 32 bits a una variable de 16 bits. Eso es ilegal.
         */

        /**
         * True or False:  A byte, short, int, long, float, or double may be declared as "unsigned" (a range from zero to a positive number).
         *
         * Falso: Todos esos tipos de datos son "Signed" en Java (tienen un rango desde un numero negativo a un numero positivo).
         */

        ///////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////

        /**
         * Cuando tratamos con numeros extremadamente grandes, podria ser el caso de que long no lo soporte.
         * Ahi entran: BigInteger y BigDecimal
         */

        BigInteger myBigInt = new BigInteger("900000000000000000000000000000");
        BigDecimal myBigDecimal = new BigDecimal("1.0E-309");

        // En caso de que requiera hacer calculos con eso, sera necesario usar metodos
        BigInteger two = new BigInteger("2");
        myBigInt.multiply(two);





    }
}
