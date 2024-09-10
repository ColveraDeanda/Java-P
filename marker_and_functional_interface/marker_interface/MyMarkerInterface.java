package oracle_certification_preparation.marker_and_functional_interface.marker_interface;

/**
 * Una marker interface:
 * - Es una interfaz en Java que no contiene métodos.
 * - Su proposito es marcar que la clase que lo implementa, tendrá cierto comportamiento en particular.
 *
 * Una de las marker interfaces más conocidas en Java es java.io.Serializable. Esta interfaz indica que una clase puede
 * ser serializada, es decir, convertida en un flujo de bytes para ser almacenada o transmitida.
 *
 *
 */

public interface MyMarkerInterface {
    // No contiene métodos ni campos
}

/**
 * Las marker interfaces son una herramienta útil en Java para agregar metadatos a las clases y permitir que otras
 * partes del código realicen operaciones específicas basadas en la presencia de la interfaz.
 *
 * Aunque no contienen métodos ni campos, su presencia puede influir en el comportamiento del código.
 */
