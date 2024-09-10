package oracle_certification_preparation.abstractClasses.Ejemplo2;

/**
 * Nota: como la clase Employee es abstract, no necesariamente tiene que implementar el metodo abstracto de Person.
 */

public abstract class Employee extends Person {
    protected String title;

    public abstract double pay();

    public String getName() {
        return title + ": " + firstName;
    }

}
