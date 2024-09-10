package oracle_certification_preparation.marker_and_functional_interface.marker_interface;

public class MarkerInterfaceExample {

    /**
     *  Podemos usar la interfaz de marcado para realizar operaciones específicas.
     *
     *  Por ejemplo, podríamos tener un método que verifique si una instancia de una clase implementa MyMarkerInterface
     *  y realice una acción en consecuencia.
     */

    public static void main(String[] args) {
        MyClass myObject = new MyClass("Example");

        if (myObject instanceof MyMarkerInterface) {
            System.out.println("myObject is an instance of MyMarkerInterface");
        } else {
            System.out.println("myObject is NOT an instance of MyMarkerInterface");
        }
    }
}
