package oracle_certification_preparation.abstractClasses.Ejemplo2;

/**
 * Nota:
 * La clase Consultant no está implementando el método getName(). Esto es perfectamente esperado ya que
 * empleado está definiendo getName
 *
 * Si creamos una instancia de Consultant, y llamamos getName(), la implementacion en Employee estará disponible.
 *
 * Eso satisface la regla general:
 *   - Una clase puede convertirse concreta (no-abstracta) cuando todos los metodos abstractos en la jerarquia tienen
 *     su implementación.
 */

public class Consultant extends Employee {
    public double pay() {
        return 80_000.0;
    }
}
