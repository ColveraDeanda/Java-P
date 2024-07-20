package oracle_certification_preparation.garbage_collection;

public class GarbageCollection {

    /**
     * Caracteristicas de garbage collection:
     *  1. No será necesario destruir un objeto explicitamente. Esto lo hace el garbage collection por defecto.
     *  2. Java elimina los objetos cuando determina que ya no son utilizados, esto se conoce como garbage collection.
     *  3. El garbage collector elimina periodicamente objetos que no sean usados para liberar memoria.
     */

    public static void main(String[] args) {


        System.gc(); // Aqui le estamos diciendo al runtime de Java que ejecute el garbage collector. PERO java puede
                     // decidir si es óptimo ejecutarlo o no.

        Car myCar = new Car(); // Esta primera instancia no se usará, entonces el garbage collector la limpiará.
        myCar = new Car();

        myCar = null; // Como ahora el objeto es null, garbage collector la limpiará.


    }

    void doSomething() {
        Car myCar = new Car(); // Una vez que se termine de ejecutar el metodo doSomething, myCar será candidato al garbage collector.
    }

    /**
     * Nota: Hay que tener cuidado con los memory leaks. Un memory leak (fuga de memoria), se crea por poor quality code.
     * y posiblemente hay varialbes que no están siendo usadas.
     * En algunos casos será necesario poner una variable = null, para deshacernos de ese memory leak.
     */


}
