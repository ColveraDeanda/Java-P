package oracle_certification_preparation.abstractClasses.Ejemplo;

public class AnotherClass {

    /**
     * NOTAS DE CLASE ABSTRACTA:
     * - Los métodos abstractos no tienen body.
     * - Si la clase tiene al menos un metodo abstracto, la clase debe ser abstracta.
     * - Las clases abstractas no pueden ser instanciadas.
     * - Cuando una clase extiende de una clase abstracta, la clase debe implementar los métodos abstractos. Ó otra opción
     *   es que la clase se vuelva abstracta.
     * - Las clases abstractas proveen una relación entre clases. Ésta relación puede ser explotada usando polimorfismo.
     */

    public static double areaDifference(Shape s1, Shape s2){
        return s1.area() - s1.area();
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 10.0;
        Rectangle r = new Rectangle();
        r.height = 30.0;
        r.width = 50.5;

        /**
         * Al hacer uso de nuestro método areaDifference que está esperando objetos Shape, le estamos pasando subtipos (circle y rectangle).
         * Sabemos que los subtipos tendrán un método area por que están extendiendo de Shape que tiene un método abstracto que debe ser
         * usado en la clase.
         */
        double diff = areaDifference(c, r);
        System.out.println("Diff: " + diff);
    }
}
