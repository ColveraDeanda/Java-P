package oracle_certification_preparation.classpath;

public class ClassPath {

    /**
     * ¿Cómo sabe el compilador de Java dónde encontrar las clases que hemos importado?
     *
     * si se trata de una clase de terceros, no de la plataforma, ¿de qué manera averigua dónde está y cómo ponerla a
     * disposición de tu programa a partir del import
     *
     * La respuesta es CLASSPATH, que contiene las rutas en donde las herramientas de Java y la JVM deben mirar para
     * localizar los archivos de código y los paquetes que se van a utilizar
     */

    /**
     * Ejemplo de classpath: java -classpath c:\src;\c:\libraries;. com.intertech.inventory.InventoryManager
     *
     * Este classpath combinado con package/imports son usados por el compilador y el JVM para encontrar las clases.
     *
     */
}
