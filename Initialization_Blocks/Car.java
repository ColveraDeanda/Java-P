package oracle_certification_preparation.Initialization_Blocks;

public class Car {

    String color = "Green"; // Se inicializa nuestra variable de instancia. Esto es válido.
    String type;

    {
        color = "red"; // A esto se le llama bloque de inicializacion.
    }
    /**
     * Un bloque de inicializacion servira para ejecutarse siempre que se hace una instancia.
     * Es realmente útil cuando tenemos muchos constructores y este bloque de codigo se ejecutará independientemente
     * del constructor que se ejecute.
     */

    Car() {
        color = "Blue";
    }

    void start() {
        System.out.println("Get started !");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.color); // Blue
    }

    /**
     * Orden de ejecución en este código cuando se crea una instancia Car:
     * 1. El constructor es llamado.
     * 2. Luego se crean nuestras variables de instancia. Donde color = null y type = null.
     * 3. Luego se pasa a la inicializacion de variables de instnaica. Donde color = Green.
     * 4. Luego el bloque de inicializacion se ejecuta. Donde color = red.
     * 5. Finalmente se ejecuta lo que está dentro del constructor.
     */
}
