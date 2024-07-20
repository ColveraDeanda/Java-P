package oracle_certification_preparation.increment;

public class Increment {

    public static void main(String[] args) {

        int x = 0;

        // x++ = (valor antiguo: 0, valor nuevo: 1). x++ Retornará el valor viejo
        // ++x = (valor antiguo: 1, valor nuevo: 2). ++x Retornará el nuevo valor.

        /**
         * Ejemplo:
         */
        System.out.println(x++); // 0
        System.out.println(x);   // 1
        System.out.println(++x); // 2
        System.out.println(x);   // 2

        int y = 0;
        y = y++; // Recordar que se esta guardando en y el valor viejo.
        System.out.println(y); // 0


        /////////////////////
        ternary();

        /**
         * More Operator Examples:
         */
        boolean courseInSession = true;
        int lectureCount = 150;

        // !: logical complement, nos ayuda a ver si una sentencia es falsa
        if( !courseInSession ) {
            System.out.println("Course is not in session.");
        }

        // Podemos cambiarle el valor a una variable de true a false o viceversa:
        courseInSession = !courseInSession;
        System.out.println(courseInSession); // false

        // != - Esto es el not iqual operator
        if( lectureCount != 150 ) {
            System.out.println("The lecture count is something other than 150");
        }

        /**
         * Loops
         */

        // Do while
        int x1 = 0;
        do {
            // int x1 = 0; la variable x1 en el while, no va a compilar por que aqui x1 está en el scope del do.
            if(x1 % 2 == 0) {
                System.out.println(x1);
            }
            x1++;
        } while(x1 >= 20);

        // Uso de break
        int b = 0;
        System.out.println("Empieza uso de break");
        while(true) {
            System.out.println(b++);
            if(b == 10) {
                System.out.println("Llego a 10, break !!");
                break; // cuando llega al break, rompe el ciclo
            }
        }

        // Uso de continue
        for(int k = 0; k < 10; k++){
            if(k % 5 == 0) continue; // si llega al continue, se salta la iteracion.
            System.out.println("Not divisible by 5");
        }

        // Uso de label
        System.out.println("Empieza loop con label");
        outer_label: // Esto es una etiqueta para controlar el flujo de los bucles aninados.
        while(true) {
            int z = 0;
            while(true) {
                if(z >= 10) {
                    break outer_label;
                    /**
                     * cuando se llega aqui, se terminan todos los bucles anidados.
                     */
                } else {
                    System.out.println(z++);
                }
            }
        }
        /**
         * Nota: En resumen, outer_label en tu código permite que, bajo ciertas condiciones (en este caso z >= 10), todos los bucles dentro de
         * esta etiqueta se detengan completamente, lo que proporciona un método eficiente y claro para controlar bucles anidados.
         */




    }

    public static boolean isSleeping() {
        return true;
    }

    public static void ternary() {
        String status = "";
        if(isSleeping()) {
            status = "Sleeping";
        } else {
            status = "Working";
        }

        // Toda la logica anterior se puede hacer con la siguinte linea (Operador ternario):
        String status2 = isSleeping() ? "Sleeping" : "Working";
        System.out.println(status2);
    }

    public void presedence() {
        int x = 3 + 2 * 5;   // 13
        int y = (3 + 2) * 5; // 25

        /**
         * Nota: Tener en cuenta el orden en el que se ejecutan las operaciones matematicas. Puedo investigar esto despues.
         */
    }







}
