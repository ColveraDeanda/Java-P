package oracle_certification_preparation.static_variables;

public class Car {

    String color;
    String type;
    int serialNumber;
    static int carCount; // El static debe ir a la izquierad del tipo de dato.

    Car() {
        carCount++;
        serialNumber = carCount;
    }
}
