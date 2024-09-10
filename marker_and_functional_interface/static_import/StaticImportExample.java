package oracle_certification_preparation.marker_and_functional_interface.static_import;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * El "static import" en Java permite importar métodos estáticos y variables estáticas de una clase para que puedan
 * ser utilizados sin necesidad de llamar el nombre de la clase. Esto puede hacer que el código sea más
 * legible y conciso.
 *
 * La sintaxis básica para un static import es: import static paquete.NombreDeClase.nombreEstático;
 *
 * O para importar todos los miembros estáticos de una clase: import static paquete.NombreDeClase.*;
 */


public class StaticImportExample {

    public static void main(String[] args) {
        // EJEMPLO SIN USAR STATIC IMPORT
        double result = Math.sqrt(16); // Usando Math.sqrt
        double resultt = Math.pow(2, 3); // Usando Math.pow

        System.out.println("Square root of 16 is: " + result);
        System.out.println("2 raised to the power of 3 is: " + resultt);

        // USANDO STATIC IMPORT
        double result1 = sqrt(16); // Usando sqrt directamente
        double result2 = pow(2, 3); // Usando pow directamente

        System.out.println("Square root of 16 is: " + result1);
        System.out.println("2 raised to the power of 3 is: " + result2);

        /**
         *  usamos import static para importar los métodos sqrt y pow de la clase Math.
         *  Esto nos permite usar estos métodos directamente sin calificar con el nombre de la clase.
         */

        /** VENTAJAS:
         * Código más limpio y legible: Reduce el desorden al eliminar la necesidad de llamar con el nombre de la clase.
         * Conveniencia: Especialmente útil cuando se usan muchos métodos estáticos de una clase.
         */
    }
}
