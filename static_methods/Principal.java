package oracle_certification_preparation.static_methods;

public class Principal {

    public static void main(String[] args) {
        Car car1, car2, car3;

        car1 = new Car();
        car2 = new Car();
        car3 = new Car();

        System.out.println(car1.serialNumber); // 1
        System.out.println(car2.serialNumber); // 2
        System.out.println(car3.serialNumber); // 3

        car1.resetCarCount(); // Legal pero confuso

        Car.resetCarCount(); // Manera correcta de accesar a static method.

    }
}
