package oracle_certification_preparation.interfaces.ejemplo1;

public class Cat implements Drawable {

    /**
     * La clase Cat debe tener el mismo metodo con la misma firma, ya que esta implementando la interface Drawable.
     */
    @Override
    public void draw() {
        System.out.println("Method draw implemented");
    }
}
