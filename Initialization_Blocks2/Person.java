package oracle_certification_preparation.Initialization_Blocks2;

public class Person {

    // Bloque de inicializacion de instancia
    {
        personCount = 10;
    }

    // Bloque de inicializacion static
    static {
        personCount = 20;
    }

    private static int personCount = 1000;

    // Bloque de inicializacion de instancia
    {
        personCount = 30;
    }

    // Bloque de inicializacion static
    static {
        personCount = 40;
    }

    public static void main(String[] args) {

        System.out.println(Person.personCount);
        Person p = new Person();
        System.out.println(Person.personCount);
        Person.personCount = 100;
        p = new Person();
        System.out.println(Person.personCount);

    }

    /**
     * Orden se ejecución del código:
     * 1. Primero la clase Person is loaded.
     * 2. Se crea la variable static int personCount con su valor por defecto de 0.
     * (recordar que las variables de instancia y variables static se crean y tienen su valor por defecto).
     * 3. Despues se ejecutan los bloques de inicializacion static y la inicializacion de la variable static en el orden
     *    en el que estan. Entonces pasa por 20, 1000 y finalmente 40.
     * 4. Despues se hace una instancia, esto hace que se ejecuten los bloque de inicializacion de instancia en el orden
     *    en el que estan. Entonces pasa por 10 y finalmente por 30.
     * 5. Ahora, se setea personCount en 100. Pero despues de eso se crea una instancia. Y esto hace que los bloques
     *    de inicializacion de instancia se ejecuten de nuevo. personCount = 30;
     */
}
