package oracle_certification_preparation.interfaces.ejemplo1;

public class Circle extends Shape {

    /**
     * Circle esta extendiendo Shape, el cual tiene el metodo abstracto area. Se debe implementar en la clase.
     * Y la clase Shape esta implementando una interface. Al momento de extender Shape, se deben implementar
     * todos los metodos abstractos y los metodos de la interface.
     */
    @Override
    public void draw() {

    }
    @Override
    public double area() {
        return 0;
    }
}
