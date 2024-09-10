package oracle_certification_preparation.protectedExamples.protected_examples2;

import oracle_certification_preparation.protectedExamples.Person;

public class Employee extends Person {

    /**
     * A pesar de que doSomething() se encuenta en otro paquete. La clase Employee tiene acceso al método protected
     * por que la clase está extendiendo a Person. Eso convierte a Employee en una subclase, en donde usar doSomething es
     * permitido.
     *
     * Nota: Employee puede acceder a doSomething con una instancia del mismo Employee() en esta misma clase. o sin la instancia, como se ve
     * en la linea 16.
     */
    public void testingProtectedMethod() {
        doSomething();
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.doSomething(); // LEGAL

        // Nota importante: Si hago una instancia de la clase que estoy extendiendo (padre), dentro de la clase hijo, la
        // clase padre no tendrá acceso el método protected.
        Person p = new Person();
        //p.doSomething(); // ILLEGAL

        // Suponiendo que tenemos una clase Musician que extiende a Person. Éste sería el resultado:
        // Musician m = new Musician();
        // m.doSomething(); // ILLEGAL

    }

}
