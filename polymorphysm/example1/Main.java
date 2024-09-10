package oracle_certification_preparation.polymorphysm.example1;

public class Main {
    private static InventoryManager manager = new InventoryManager();

    public static void main(String[] args) {

        /**
         * CLAVE IMPORTANTE DE POLIMOSFISMO:
         *
         * Una variable de referencia puede apuntar a un objeto de su tipo o de cualquier subtipo.
         *
         * En cualquier parte del codigo donde se tenga una variable de referencia, esa variable de referencia se le puede asignar un objeto del mismo tipo
         * ó cualquier subtipo.
         *
         * Esto nos ayuda a tener un código más flexible.
         */


        Car c = new Car();
        manager.addAutomobile(c); // addAutomobile acepta un objeto Car por que Car es un tipo de automovil.

        Truck t = new Truck();
        manager.addAutomobile(t); // addAutomobile acepta un objeto Truck por que Truck es un tipo de automovil.
    }
}
