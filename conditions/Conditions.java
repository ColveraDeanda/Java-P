package oracle_certification_preparation.conditions;

public class Conditions {

    public static void main(String[] args) {

        boolean isMeanapolis = true;
        boolean isSaintPaul = false;

        // Hacer asi sin llaves es legal, pero solo se puede usar una linea en el bloque. Si llegas a poner
        // algo más en el bloque, no compilará.
        if (isMeanapolis) System.out.println("Hello 1");
        else if (isSaintPaul)
            System.out.println("Hello 2");
            //System.out.println("Hola xd"); // USAR ÉSTA LÍNEA NO COMPILA.
        else
            System.out.println("Hello 3");
            System.out.println("Hello 4");

        /**
         * Si quiero mis bloques bien separados, usar siempre llaves.
         */

        /**
         * VARIABLE SCOPE: TODA AQUELLA VARIABLE QUE SEA DECLARADA DENTRO DE LA CONDICION, PERTENECE A ESE SCOPE.
         */
        // Por Ejemplo:
        int age = 40;
        if (age >= 25) {
            String message = "25 years or older.";
        }
        //System.out.println(message); // ILLEGAL, message is out of scope

        // El siguiente ejemplo seria legal:
        String message = null; // Declaration of "message"
        int age2 = 19;
        if (age2 >= 25) {
            message = "25 years or older.";
        }
        System.out.println(message);

        // Ejemplos de if sin llaves: (Recordar que el if solo toma la 1ra linea. Y las demas lineas no son parte del if)
        // Recordar tambien que esto no va a marcar error. Solo marcaría error si tengo una 2da linea en if, y una sentencia else-if o else enseguida.
        if (age >= 25)
            message = "25 years or older."; // bloque del if
            String otherMessage = "More text..."; // No es parte del if y siempre se va a ejecutar.


        // Otro ejemplo:
        if (age >= 25)
            message = "25 years or older.";
        else
            message = "Younger than 25.";
        otherMessage = "More text..."; // Se ejecutara siempre esta linea


        int myAge = 40;
        String myMessage = null;
        // Otro ejemplo: Notar que en if y if-else, poner mas lineas es ilegal, excepto para el else que siempre se ejecutaria, pero esa ejecución de toma desde fuera del IF.
        if (myAge >= 25)
            System.out.println("25 years or older.");
            //otherMessage = "More text..."; // ILLEGAL
        else if (myAge >= 20)
            myMessage = "Between 20 years and 24 years old";
            //otherMessage = "More text..."; // ILLEGAL
        else
            myMessage = "Younger than 20.";
            System.out.println("More text..."); // ÉSTA 2DA LÍNEA SE EJECUTA PORQUE SE TOMA COMO UNA LINEA FUERA DEL BLOQUE DE IF.



    }

    /**
     * Ejemplo de switch:
     */
    public void doSomething () {
        int someVariable = 0;
        switch (someVariable) {
            case 0: {
                return; // Al usar return, se saldra del metodo doSomething.
            }
            case 1: {
                String msg = "Hello!"; // msg solo estará en el scope del case 1.
                break; // Se sale del switch
            }
            case 2: {
                //System.out.println(msg); // ILLEGAL
                break; // Se sale del switch.
            }
        }
        //System.out.println(msg); // ILLEGAL

    }


    // Ejemplo 2: Si quieres usar una variable fuera del switch, asegurate que este su declaracion afuera del switch.
    public void doSomething2() {
        int someVariable = 0;
        String msg = null; // Declaracion
        switch (someVariable) {
            case 0: {
                msg = "Hello!";
                break;
            }
            case 1: {
                msg = "Hello 2!";
                break;
            }
        }
        System.out.println(msg); // Legal
    }

    // Ejemplo 3: Solo puedes usar case y default en tu switch. No puedes declarar una variable fuera de un case o default.
    // Ya dentro de un case o default, si se podran hacer variables, etc.

    public void doSomething3() {
        int someVariable = 0;
        switch (someVariable) {
            //String msg = "Hello"; // ILLEGAL
            case 0: {
                String msg = "Hello";
                msg = "Hello!"; // msg dentro del scope del case 0.
                break;
            }
            default: {
                //msg = "Hey!"; ilegal, no encuentra msg en el scope.
                break;
            }
        }
    }

}
