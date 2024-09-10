package oracle_certification_preparation.abstractClasses;

/**
 * Las clases abstractas nos ayudan a simplificar las cosas.
 *  - Las metodos abstractos no pueden tener body.
 *  - Se puede tener metodos normales en una clase abstracta.
 *  - Una clase abstracta está diseñada para ser extendida.
 *  - No se puede crear una instancia de una clase abstracta.
 *  - Si una clase tiene al menos un método abstracto, la clase debe ser abstracta.
 *
 *  Una clase abstracta ayuda a asegurar que todas las subclases tengan los métodos adecuados. Y prevee de cualquiera que
 *  intente crear una instancia de la clase abstracta.
 *
 */

public abstract class AbstractClases {

    public abstract double area(); // metodo abstracto sin body.

    public String perimetro() { // metodo normal con body.
        return "Perimetro";
    }

}
