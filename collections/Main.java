package oracle_certification_preparation.collections;

public class Main {

    // Explicacion general de Collections en Java
    // Explicaciones general de Maps en Java

    //--------------------------------------------------------------------------
    // Que es y ejemplo de uso de un arrayList. Ejemplo de sus metodos mas usados

    // Investigar diagrama de colecciones Java

    //-----------------------------------------------------------------------------
    // Investigar iterator en Java.. que es, para que sirve y ejemplo practico (hasNext, next y remove)

    //-----------------------------------------------------------------------------
    // investigar Lists en Java (ArrayList y LinkedList)

    // Preguntas Lists:
    /**
     * Will the following program compile?
     * import java.util.*;
     * public class ListExample {
     *   public static void main(String[] args) {
     *     ArrayList list1 = new ArrayList(); // A
     *     List list2 = new ArrayList();      // B
     *     Collection list3 = new ArrayList();// C
     *   }
     * }
     * Yes, The program compiles.
     * Correct! An ArrayList implements, indirectly, the List and Collection interfaces. By the rules of polymorphism,
     * A reference variable that is an interface type may hold a reference of any class that implements that type.
     */

    /**
     * What is the output of this code?
     * ArrayList myList = { "Hello", "World" };
     * System.out.println(myList);
     *
     * The code will not compile.
     * Correct! You can't use the array initialization syntax with a collection. The following code, however,
     * would work: List myList = Arrays.asList(new String[] {"Hello", "World" });
     */

    /**
     * Qestion 3:
     * List languages = new ArrayList();
     * languages.add("Java");
     * languages.add("JavaScript");
     * languages.add("Groovy");
     * languages.add("Scala");
     * languages.set(2, "C#");
     * System.out.println(languages);
     *
     * R = java, Javascript, c#, Scala
     */

    //--------------------------------------------------------------------------------------------------------------
    // Investigar Set en Java, y ejmplos de uso (Hashset y TreeSet)

    //--------------------------------------------------------------------------------------------------------------
    // Quiz Sets

    /**
     * What are the characteristics of a HashSet?
     * R = Doesnt allow suplicate values and returns objects in the order they were stored by their hashcode
     */

    /**
     * What is the output of the following code?
     * Set orderedSet = new TreeSet();
     * orderedSet.add("A");
     * orderedSet.add("3");
     * orderedSet.add("b");
     * System.out.println(orderedSet);
     *
     * R = 3, A, b
     */

    /////////////////////////////////////////////////////////////////////////////////////////////
    // Queue explicacion y un ejemplo claro y sencillo.
     // - ArrayBlockingQueue
     // - PriorityQueue

    //////////////////////////////////////////////////////////////////////////////////////////////
    // Deques = Explicacion y ejemplo sencillo.

    //////////////////////////////////////////////////////////////////////////////////////////////
    // Map - Explicacion de ejemplo sencillo.
    // Hashmap y treeMap son los mas populares. Explicacion de cada uno.
    // Metodos para manipular el map.

    /////////////////////////////////////////////////////////////////////////////
    // Explicacion de hashSet y TreeSet

    // Limitaciones de collecciones
    /**
     * - 1. Las colecciones no puede almacenar datos primitivos
     * - 2. La collecion es tratada o almacenada como Object Reference.
     *
     * Ejemplos de los 2 puntos anteriores.
     *
     * - Explicacion de los datos primitivos vs su Object Wrapper Type. Cual es su diferencia, con ejemplos.
     */

    /// REVISITAR EL VIDEO 149. MUCHO TEXTO

    ////////////////////////////////
    /**
     * Generics y autoboxing. Explicacion y ejemplo.
     * Un ejemplo sencillo de ésto sería: List<Integer> primies = new ArrayList<Integer>();
     */

    // Ejemplo de uso de diamond operator.

    // REVISITAR EL VIDEO 152. MUCHO TEXTO

    /**
     * Explicacion y ejemplos de metodos como:
     * - Collections.sort
     * - Collections.binarySearch
     * - Collections.reverse
     * - Collections.shuffle
     *
     * Y algun otro metodo importante a tomar en cuenta
     */

    /**
     * Puedes explicarme un ejemplo cuando se implementa la interfaz Comparable ?
     *
     */

    /**
     * Puedes explicarme un ejemplo cuando se implementa la interfaz Comparator ?
     */

    // Reocrdar ver el video 156 - mucho texto
}
