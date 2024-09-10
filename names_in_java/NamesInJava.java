package oracle_certification_preparation.names_in_java;

public class NamesInJava {

    /**
     * clases, metodos, variables, packages, tiene un nombre en Java
     *
     * Los nombres en Java son llamados: Identificadores (identifiers).
     *
     * Un identificador valido debe seguir estas reglas:
     *  1. Contiene solo numeros, letras, underscore, o dollar sign.
     *  2. No empezar con numero.
     *  3. No usar una palabra reservada.
     *
     *
     *  Palabras reservadas que no sabia:
     *   - native
     *   - assert
     *   - finally
     *   - synchronized
     *   - instanceof
     *   - volatile
     *   - goto
     *   - continue
     *   - strictfp
     *   - super
     *   - transient
     */

    /**
     * Ejemplo de identificador legal: float $50_00;
     */

    /**
     * Ejemplos de identificadores VALIDOS en Java:
         * SimpleIdentifier - Correcto, comienza con una letra y contiene sólo letras.
         * _underscoreStart - Correcto, puede comenzar con un guión bajo.
         * $dollarSignStart - Correcto, puede comenzar con un signo de dólar.
         * variable123 - Correcto, puede contener números, pero no puede comenzar con ellos.
         * camelCaseExample - Correcto, muy utilizado en Java para nombres de variables y métodos.
     */

    /** Ejemplos de identificadores INVALIDOS en java:
     * 123variable - Incorrecto, no puede comenzar con un número.
     * variable-123 - Incorrecto, contiene un guion, que no es un carácter permitido.
     * class - Incorrecto, es una palabra reservada en Java.
     * java.util - Incorrecto, contiene un punto, que se utiliza para separar paquetes y clases, no para identificadores.
     * #hashTag - Incorrecto, contiene un símbolo de numeral, que no es un carácter permitido en identificadores.
     */


}
