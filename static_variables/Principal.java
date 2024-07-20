package oracle_certification_preparation.static_variables;

public class Principal {

    public static void main(String[] args) {
//        Car.carCount = 1; // Acceso a variable estática.

        // El siguiente código hará lo mismo:
//        Car myCar = new Car();
//        myCar.carCount = 1; // Legal pero confuso.
//        System.out.println(myCar.carCount); // Legal pero confuso.

        Car car1, car2, car3;

        car1 = new Car();
        car2 = new Car();
        car3 = new Car();

        System.out.println(car1.serialNumber); // 1
        System.out.println(car2.serialNumber); // 2
        System.out.println(car3.serialNumber); // 3

        /**
         * Nota: Las variables de instancia estáticas servirán para compartir información entre todas las instancias que
         * se hagan del objeto.
         */

    }
}
