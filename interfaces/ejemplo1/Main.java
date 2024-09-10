package oracle_certification_preparation.interfaces.ejemplo1;

public class Main {

    public static void main(String[] args) {

        // USANDO POLIMORFISMO CON Interfaces y Clases Abstractas.
        Drawable d1 = new Cat();
        Drawable d2 = new Circle();

        d1.draw();
        d2.draw();

        //d2.area(); // ILEGAL por que d2 no es un circle.

        ((Circle) d2).area(); // LEGAL

        Main main = new Main();
        main.print(d1);
        main.print(d2);

    }

    public void print(Drawable d) {
        d.draw();
    }

    /**
     * Nota a recordar:
     * Una clase solo puede extender otra clase, pero una clase puede implementar un numero ilimitado de interfaces.
     * Esta flexibilidad de tener multiples interfaces tiene una regla:
     *  - Si 2 o mas interfaces que se estan implementando, tienen un metodo defualt con la misma firma, se DEBE sobreescribir los
     *    metodos. Ya que si no se hace eso, habría ambiguedad.
     *
     */
}
