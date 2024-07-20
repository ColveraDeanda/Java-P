package oracle_certification_preparation;

public class Main {

    public static void main(String[] args) {

        /**
         * What is the file name of the file once the Car type has been compiled into bytecode? = Car.class
         **/

        /**
         * How would you declare a reference variable for the Car class defined in the first question? = Car myCar
         */

        /**
         * How would you instantiate a Car object and assign it to the myCar variable? = Car myCar = new Car();
         */

        // Note on void
        /**
         * A method that declares a return type of void cannot return any value.  So, for example, the following
         * is illegal and would not compile:
         *
         * public void doSomething() {
         *     return "Hello!";
         *   }
         */

        /**
         * It is, however, legal (though uncommon) to just use the return statement:
         *     public void doSomething() {
         *       return;
         *     }
         */

        /**
         * public class Car {
         *     String type = "Sedan";
         *     String color = "Silver";
         *     void Car( String color, String type ) {
         *         System.out.println("The car is a " + color + " " + type);
         *     }
         * }
         *
         * Elsewhere, we instantiate a car object:  Car myCar = new Car();
         * What is the output?
         *
         * R = There is no Output. por que cuando se le agrega un return type (void) a Car, deja de ser el constructor
         *     y es un metodo más.
         */


        /**
         * public class Car {
         *     String type;
         *     String color;
         *     Car( String color, String type ) {
         *         System.out.println("The car is a " + color + " " + type);
         *     }
         *     void driveCar() {
         *         String greeting;
         *         System.out.println(greeting + " Would you like to drive my "
         *             + color + " " + type + "?");
         *    }
         * }
         *
         * Este codigo no va a compilar por que la variable local "greeting" en el metodo driveCar no esta inicializada.
         * Las variables de instancia (type, color) no hay problema por que tendran un valor por default.
         */

        /**
         *  What's the difference between a "default" and a "no-arg" constructor?
         *
         *  no-arg constructor simplemente será aquel constructor que no tiene argumentos.
         *  Un default constructor es aquel que se crea por el compilador cuando no creas uno explicitamente.
         */











    }
}
