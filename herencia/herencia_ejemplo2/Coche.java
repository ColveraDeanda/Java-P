package oracle_certification_preparation.herencia.herencia_ejemplo2;

public class Coche extends Vehiculo{

    private int numeroDePuertas;

    /**
     * Nota importante: Antes de que se ejecute cualquier constructor de Coche, Java llamará automáticamente
     * el constructor de Vehiculo(). Si Vehiculo no tiene un constructor por defecto, habrá un error.
     *
     * Recordar que en el caso donde Vehiculo no tenga ningun constructor, se crea un constructor por defecto. Éste constructor
     * es el que se llama implicitamente en la subclase.
     *
     * Tambien recordar que super() es lo 1ro que se llama en el constructor. Sea explocito o implicito.
     */
    public Coche() {
        // Aquí se llama implícitamente a super() (Se ejecuta Vehiculo())
        this.numeroDePuertas = 4;
        System.out.println("Constructor de Coche: Numero de puertas es " + numeroDePuertas);
    }

    public Coche(int numeroDePuertas) {
        // Aquí se llama implícitamente a super() (Se ejecuta Vehiculo())
        this.numeroDePuertas = numeroDePuertas;
        System.out.println("Constructor de Coche con puertas: " + numeroDePuertas);
    }
}
