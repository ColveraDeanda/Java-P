package oracle_certification_preparation.protectedExamples;

public class Person {

    /**
     * El acceso protected del estado o comportamiento estará disponible para:
     * 1. La misma clase.
     * 2. Cualquier otra clase del mismo paquete.
     * 3. Cualquier subclase que herede de la clase donde se tiene alguna propiedad o metodo protegido.
     */

    protected void doSomething() {
        System.out.println("Doing something");
    }
}
