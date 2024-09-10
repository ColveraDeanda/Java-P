package oracle_certification_preparation.covariant_return;

public class Car extends Vehicle {

    /**
     * Covariant return es un concepto donde Java permite sobreescritura de metodos con un tipo de retorno diferente.
     *
     * Reglas para covariant return:
     * 1. El tipo de retorno del metodo en la subclase debe ser compatible con el tipo de retorno del metodo en la
     *    superclase. Esto significa que debe ser del mismo tipo o subtipo (más específico).
     * 2. Aparte del retorno covariante el método en la subclase debe coincidir con la firma del método en la
     *    superclase (nombre y parámetros).
     */

    public Car getInstance() {
        return new Car();
    }

    /**
     * Car.getInstance() sobrescribe el método para devolver un objeto Car, que es un subtipo de Vehicle.
     */

    /**
     * El covariant return permite a las subclases devolver tipos más específicos, lo que puede ser más útil y
     * descriptivo desde la perspectiva de la programación.
     */
}
