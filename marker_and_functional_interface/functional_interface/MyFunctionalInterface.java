package oracle_certification_preparation.marker_and_functional_interface.functional_interface;

/**
 * Una interfaz funcional en Java es una interfaz que contiene exactamente un método abstracto. Estas interfaces son
 * ideales para representar funciones o comportamientos que se pueden pasar como parámetros, almacenar en variables,
 * o devolver desde otros métodos.
 */

/**
 * Características de una Interfaz Funcional
 * - Debe tener exactamente un método abstracto.
 * - Además del único método abstracto, puede tener métodos default y static.
 * - Anotación @FunctionalInterface: Aunque opcional, se recomienda usar esta anotación para indicar que la interfaz es
 *   funcional y para que el compilador verifique que cumple con los requisitos.
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    void execute();
}
