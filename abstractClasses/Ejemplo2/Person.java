package oracle_certification_preparation.abstractClasses.Ejemplo2;

/**
 * Notas:
 * - Los modificadores private, static y final no pueden usarse en un metodo abstracto. Esto tiene sentido porque
 *   Private, static y final methods no pueden ser sobreescritos y todos los metodos abstractos DEBEN ser sobreescritos
 */

public abstract class Person {
    protected String firstName;

    public abstract String getName();
}
