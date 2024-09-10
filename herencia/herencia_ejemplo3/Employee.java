package oracle_certification_preparation.herencia.herencia_ejemplo3;

public class Employee extends Person {

    int deptId;

    public Employee() {
        super(); // recordar que super debe ser la primera linea en el constructor.
        deptId = 281;
    }

//    public Employee() {
//        deptId = 281;
//        super(); // Esto sería ilegal.
//    }

    // Existe un escenario donde super puede NO ser la 1ra línea del constructor y se puede usar desde fuerta del constructor.
    // Sería llamando a un método de la clase padre, por ejemplo:
    public void driveLikeEmployee() {
        doSomethingelse();
        super.drive(); // LEGAL. Puede ayudar a la legibilidad.
    }

    public void driveLikeEmployee2() {
        super.drive(); // LEGAL. Puede ayudar a la legibilidad.
        doSomethingelse();
    }

    public void doSomethingelse() {
        System.out.println("Something else...");
    }
}
