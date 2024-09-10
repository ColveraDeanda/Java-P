package oracle_certification_preparation.interfaces;

/**
 * Notas de interfaces:
 *  - Las interfaces solo pueden tener métodos publicos y solo pueden ser: abstract, default or static.
 *  - Aunque la interface no tenga public explícitamente, implícitamente siempre será public.
 *  - Also, if neither abstract, default or static is listed in the declaration, it is set as abstract. = Invertigar esto.
 *  - Las interfaces solo pueden contener variables que son public, static y final. Estos 3 modificadores son implicitamente
 *    agregadas a las variables, aunque no los tenga explicitamente.
 *  - Los metodos en las interfaces siguen las mismas reglas que los metodos en clases abstractas.
 */

/**
 * Notas parte 2:
 * - Al igual que clases abstractas, no se pueden crear instancias de interfaces.
 * - Una interface define el comportamiento que debe seguir una clase.
 * - Una clase puede implementar ilimitado numero de interfaces.
 * - Una interface es un contrato que la clase firma.
 * - Como en el caso de las clases, una interface puede extender de otra interface.
 */



public interface interfacesExample {

    /**
     * Es posible tener un metodo con body en una interface, usando el modificador default. (Esto solo se aplica para
     * interfaces).
     * Los metodos default no es estrictamente que se implementen en la clase, como lo es en el caso de un metodo abstracto.
     */
    public default void draw(){
        // Drawing code here.
    }


    /**
     * Es posible tener metodos static en la interface. Éstos seran llamados solamente a travez de la interface.
     */

    public static void doSomething(){
        // Some code here.
    }

}
