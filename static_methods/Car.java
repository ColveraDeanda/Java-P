package oracle_certification_preparation.static_methods;

public class Car {

    String color;
    String type;
    int serialNumber;
    static int carCount;

    Car() {
        carCount++;
        serialNumber = carCount;
    }

    static void resetCarCount() {
        carCount = 0;
//        color = "Blue";  // Esto es ilegal, no puedes usar una variable de instancia en un contexto estatico.
    }

    /**
     *  Los métodos estáticos nos servirán para:
     *  1. Acceder o actualiar una variable de clase. Es decir, una variable estática.
     *  2. Proveen funcionalidad sin la necesidad de crear un objeto / instancia. Por ejemplo Math methods.
     */

}
