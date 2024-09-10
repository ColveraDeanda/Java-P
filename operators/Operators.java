package oracle_certification_preparation.operators;

public class Operators {

    public static void main(String[] args) {
        int x = 8;
        int y = 10;

        /**
         * Operador &: Lo que hace este operador es comparar bit por bit los 2 valores (x, y).
         * - Si ambos bit son 1, el resultado es 1. Si alguno de los bits NO es 1, el resultado es 0.
         *
         * 8 en binario es: 1000
         *10 en binario es: 1010
         * ----------------------
         *                  1000
         *
         * Si aplicamos el operador & entre 8 y 10, el resultado es: 1000, osea 8
         */
        int and = x & y;
        System.out.println(and);

        /**
         * Operador |: Es lo mismo que el anterior operador & en cuestion de comparar bit por bit los valores.
         * La diferencia está en que si encuentra de algun lado un 1, entonces regresará un 1
         *
         * 8 en binario es: 1000
         *10 en binario es: 1010
         * ----------------------
         *                  1010
         *
         * Si aplicamos el operador | entre 8 y 10, el resultado es: 1010, osea 10
         *
         */
        int or = x | y;
        System.out.println(or);

        /**
         * Operador ^: Este operador se llama XOR, tambien conocido como Or Exclusivo. Hace la misma comparacion bit por bit.
         * La diferencia está en que regresará 1 si solo de un lado se tiene un 1. Si no regresará un 0.
         *
         * 8 en binario es: 1000
         *10 en binario es: 1010
         *-----------------------
         *                  0010
         *
         * Si aplicamos el operador ^ entre 8 y 10, el resultado es: 0010, osea 2 en decimal.
         */
        int xor = x ^ y;
        System.out.println(xor);

        /**
         * Operador ~: Este operador es NOT, tambien conocido como complemento. Este operador cambia bit. Cada bit en 1, lo pasa a 0.
         * Y cada bit en 0, lo pasa a 1.
         *
         * Por ejemplo el 8 en binario (considerando 8 bits para simplificar) es:
         * 00001000
         * --------
         * 11110111
         *
         * El resultado 11110111 en binario representa -9 en decimal.
         */

        int complement = ~x;
        System.out.println(complement);


        boolA();
        boolB();


    }

    public static boolean isSleeping() {
        System.out.println("Is sleeping");
        return false;
    }

    public static boolean isHome() {
        System.out.println("Is home");
        return true;
    }

    public static void boolA() {
        /**
         * Con &: Evalua los 2 sentencias, a pesar de que la 1ra sea false.
         * Con &&: Si la sentencia de la izquierda es false, ya no evaluará la 2da sentencia. (Short circuiting).
         *
         * Con |: Evalua los 2 sentencias, a pesar de que la 1ra sea false.
         * Con ||: Si la sentencia de la izquierda es true, ya no evaluará la 2da sentencia. (Short circuiting).
         */
        if(isSleeping() & isHome()) {
            System.out.println("Its True ! ");
        }
    }

    public static void boolB() {
        String x = null;
        //x.trim(); Ésta línea va a producir un nullPointerException.

        // Pero si hacemos por ejemplo lo siguiente:
        if(x != null && x.trim().length() > 0) {
            /**
             * Nota que el codigo de arriba no va a fallar. Por que la 1ra evaluacion de la izquierda dara falsa. Y ya que
             * estamos usando el operador &&, no evaluará la parte derecha.
             */
        }
    }

    /**
     * Lista de operadores Bitwise:
     * AND Bit a Bit (&): Compara cada bit de sus operandos. Si ambos bits son 1, el bit resultante será 1. De lo contrario, será 0.
     *
     * OR Bit a Bit (|): Compara cada bit de sus operandos. Si al menos uno de los bits es 1, el bit resultante será 1.
     *
     * XOR Bit a Bit (^): Compara cada bit de sus operandos. Si los bits comparados son diferentes, el bit resultante será 1. Si son iguales, será 0.
     *
     * NOT Bit a Bit (~):Invierte todos los bits del operando. Si un bit es 0, se convierte en 1, y si es 1, se convierte en 0.
     *
     * Desplazamiento a la Izquierda (<<): Desplaza los bits del operando a la izquierda por el número de posiciones especificado, añadiendo ceros a la derecha.
     *
     * Desplazamiento a la Derecha con Signo (>>): Desplaza los bits del operando a la derecha por el número de posiciones especificado. El bit más significativo (el bit de signo en los números negativos) se repite para llenar los espacios a la izquierda, preservando el signo del número.
     *
     * Desplazamiento a la Derecha sin Signo (>>>): Desplaza los bits del operando a la derecha por el número de posiciones especificado. Los espacios a la izquierda se llenan con ceros, lo que hace que este operador sea útil para desplazar bits de números donde no se desea preservar el signo.
     */
}
