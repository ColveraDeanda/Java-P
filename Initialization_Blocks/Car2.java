package oracle_certification_preparation.Initialization_Blocks;

public class Car2 {

    Car2() {
        color = "Blue";
    }

    {
        color = "red"; // A esto se le llama bloque de inicializacion.
    }

    String color = "Green"; // Se inicializa nuestra variable de instancia. Esto es válido.
    String type;

    void start() {
        System.out.println("Get started !");
    }

    public static void main(String[] args) {
        Car2 myCar2 = new Car2();
        System.out.println(myCar2.color); // Blue
    }

    /**
     * Orden de ejecución en este código cuando se crea una instancia Car:
     * 1. El constructor es llamado.
     * 2. Luego se crean nuestras variables de instancia. Donde color = null y type = null.
     * 3. Luego se ejecuta el bloque de inicializacion. Donde color = red.
     * 4. Despues se inicializa en la linea 13. Donde color = Green.
     * 5. Finalmente se ejecuta el constructor. Donde color = blue.
     */
}
