package oracle_certification_preparation.marker_and_functional_interface.functional_interface;

public class FunctionalInterfaceExample {

    /**
     * Definición de la Interfaz Funcional: MyFunctionalInterface tiene un solo método abstracto execute().
     * La anotación @FunctionalInterface asegura que la interfaz cumple con los requisitos de una interfaz funcional.
     * Implementación con Expresión Lambda: En FunctionalInterfaceExample, usamos una expresión lambda () -> System.out.println("Executing my function!") para proporcionar una implementación del método execute().
     * Invocación del Método: Llamamos al método execute() a través de la instancia myFunction.
     */

    public static void main(String[] args) {
        // Usar una expresión lambda para implementar la interfaz funcional
        MyFunctionalInterface myFunction = () -> System.out.println("Executing my function!");
        DoubleFunctionInterface printSquare = value -> System.out.println("Square of " + value + " is " + (value * value));

        // Llamar al método de la interfaz funcional
        myFunction.execute();
        printSquare.apply(5.0);
        printSquare.apply(10.0);
    }

    /**
     * Las interfaces funcionales son ampliamente utilizadas en Java, especialmente en el contexto de las API de Streams y las
     * expresiones lambda. Algunas interfaces funcionales predefinidas en Java son:
     *
     * java.util.function.Predicate<T>: Representa una función que toma un argumento y devuelve un booleano.
     * java.util.function.Function<T, R>: Representa una función que toma un argumento y devuelve un resultado.
     * java.util.function.Consumer<T>: Representa una función que toma un argumento y no devuelve resultado.
     */

    /**
     * Las interfaces funcionales son una herramienta poderosa en Java para la programación funcional. Permiten pasar comportamientos
     * como parámetros y facilitan el uso de expresiones lambda y referencias a métodos. La anotación @FunctionalInterface ayuda a
     * asegurar que la interfaz cumple con los requisitos de una interfaz funcional.
     */
}
