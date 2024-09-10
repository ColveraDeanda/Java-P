package oracle_certification_preparation.overriden_methods.example1;

public class Son extends Father {

    /**
     * Supongamos que quieres usar el mismo metodo del padre, pero ahora en la clase hijo con una funcionalidad
     * diferente. Esto se puede lograr sobreescribiendo el método en la clase hijo. Y al hacer una instancia de Hijo,
     * el 1er metodo que buscará será en el hijo, si no encuenta el método, lo buscará en el padre.
     */
    public void drive() {
        setVelocity(100);
        go();
    }

    private void setVelocity(int velocity) {
        System.out.println(velocity);
    }

    private void go() {
        System.out.println("Go");
    }



}
