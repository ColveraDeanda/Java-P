package oracle_certification_preparation.polymorphysm.example2;

public class InventoryManager {

    private Automobile featuredAuto;


    /**
     * Cualquier parte donde se tenga una variable de referencia, se le puede asignar un objeto del mismo tipo o cualquier subtipo.
     *
     * En este caso, el método está esperando un objeto de tipo Automobile, pero le estamos pasando un subtipo (car), lo cual es valido.
     *
     * Tambien a la variable de referencia (featuredAuto), le estamos pasando un objeto de tipo Car. Igualmente es válido ya que car es un subtipo
     * de automobil.
     */
    public void addFeaturedAuto(Automobile auto) {
        System.out.println(auto.getVin());
        featuredAuto = auto; // Lo que está pasando en ésta línea es: Automobil featuredAuto = new Car();
    }
}
