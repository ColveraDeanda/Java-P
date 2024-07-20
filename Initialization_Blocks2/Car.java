package oracle_certification_preparation.Initialization_Blocks2;

import oracle_certification_preparation.Initialization_Blocks.Car2;

public class Car {

    String color = "Green";
    String type;
    static int carCount;

    /**
     * Tambien es posible tener un bloque de inicializacion static:
     * 1. Solo se va a ejecutar una sola vez al cargar la clase
     * 2. Se pueden tener varios bloques static, los cuales seran ejecutados en orden.
     */
    static {
        carCount = 1;
    }

    static {
        resetCarCount();
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
    }



}
