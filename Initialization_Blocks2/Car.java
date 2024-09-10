package oracle_certification_preparation.Initialization_Blocks2;

import oracle_certification_preparation.Initialization_Blocks.Car2;

public class Car {

    String color = "Green";
    String type;
    static int carCount;

    /**
     * Tambien es posible tener un bloque de inicializacion static, los puntos a recordar son:
     * 1. El código del bloque static solo se ejecuta una vez (la 1ra vez que se carga la clase).
     * 2. Se pueden tener varios bloques static, los cuales seran ejecutados en orden.
     */

    /**
     * Uso: Se pueden usar para alguna configuracion que solo se ocupe ejecutar una sola vez.
     */
    static {
        carCount = 1;
        System.out.println("Se ejecuta 1er bloque static");
    }

    static {
        resetCarCount();
        System.out.println("Se ejecuta 2do bloque static");
    }

    Car() {
        color = "Blue";
    }

    static void resetCarCount() {
        carCount = 0;
    }

    void start() {
        System.out.println("Get started !");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.color); // Blue

        Car myCar2 = new Car(); // Como vemos en este punto, ya no se vuelve a ejecutar el bloque static. Ya que solo se hace al principio cuando carga la clase.
        System.out.println(myCar2.color); // Blue
    }



}
