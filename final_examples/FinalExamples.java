package oracle_certification_preparation.final_examples;

public class FinalExamples {

    // El modificador final tiene 3 usos:
    /**
     *  1. final en una variable: Hace que una variable sea constante.
     *  2. final en un metodo: Hace que el metodo no pueda ser sobreescrito.
     *  3. final en una clase: Hace que esa clase no pueda ser extendida.
     */

    // Constantes con final.
    public static final int LESS_TRAVELED = 0; // explicit initialization (Nota: No importa el orden de public / static / final. Solo deben estar a la izquierda del tipo de dato).
    static final public String wef = "eg"; // VALIDO

    public final int SHORTEST; // Las constantes deben inicializarse. Ya que esta siendo inicializada en el constructor, no marcara error.

    // public final int BIGGEST; COMPILE ERROR

    public FinalExamples() {
        SHORTEST = 10;
    }

    public void foo() {
       // BIGGEST = 100;  COMPILE ERROR
    }


    /**
     * Notas extra:
     *   - La clase String es final. Esto significa que no se puede heredar de String.
     *   - Cuando declaramos un Enum, todas sus constantes se toman por defecto como "static" y "final".
     */

}
