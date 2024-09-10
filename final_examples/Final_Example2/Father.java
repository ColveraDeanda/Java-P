package oracle_certification_preparation.final_examples.Final_Example2;

public class Father {

    /**
     * Con final le decimos al metodo que no puede ser sobreescrito.
     * En caso de que la clase hijo este intentando sobreescribir, sera compile error.
     */
    public final void drive() {
        System.out.println("Driving...");
    }


}
