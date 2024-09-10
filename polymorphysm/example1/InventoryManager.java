package oracle_certification_preparation.polymorphysm.example1;

public class InventoryManager {

    /**
     * En vez de tener una sobrecarga de metodos, donde acepten un diferente tipo de objeto, se puede hacer eso
     * mismo con polimorfismo.
     */

    /**
     * Polimorfismo se refiere a que podemos sustituir un objeto por otro, siempre y cuando sean del mismo tipo.
     *
     */

    /**
     *
     * @param a = El método acepta un objeto de tipo Automobil o cualquier subclase de Automobile. (Recordar esa regla, aceptará tanto el objeto como cualquier sublase del objeto).
     * Ya que tenemos nuestra clase Car y Truck extendiendo de Automobile, al pasarle al método un objeto Car o Truck,
     * lo va a aceptar perfectamente.
     */
    public void addAutomobile(Automobile a) {
        System.out.println("Adding automobile # " + a.getVin());
    }









    // EJEMPLO CON SOBRECARGA TENIENDO MUCHOS METODOS:

//    public void addAutomobile(Car c) {
//        System.out.println("Adding Car # " + c.getVin());
//    }
//
//    public void addAutomobile(Truck t) {
//        System.out.println("Adding Car # " + t.getVin());
//    }

    /**
     * El codigo de arriba es legal y se puede hacer sin problema.. pero que pasará cuando haya una gran cantidad de nuevos vehiculos. Lo ideal
     * es no hacer codigo repetitivo. Es por ello que se puede usar el concepto de polimorfismo a nuestro favor.
     */
}
