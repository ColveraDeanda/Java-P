package oracle_certification_preparation.protectedExamples.protected_examples2;

public class EmployeeTester {

    /**
     * Si la clase no se encuentra en el mismo package o no es una subclase del metodo o propiedad protected, no se podrá
     * usar el método protected.
     *
     * Aqui vemos un ejemplo donde Employee es una subclase de Person, que es donde esta el metodo protected. Pero aún así,
     * ésto no es permitido.
     */

    public static void main(String[] args) {
        Employee e = new Employee();
       // e.doSomething(); // ILLEGAL
    }
}
