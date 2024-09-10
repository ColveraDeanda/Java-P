package oracle_certification_preparation.overriden_methods.example1;

public class main {

    public static void main(String[] args) {
        /**
         * Las relgas para sobreescribir un metodo son:
         * 1. El nombre y parametros del método a sobreescribir deben de ser exactamente los mismos. (misma firma).
         * 2. El método a sobreescribir debe tener el mismo tipo de retorno. (Excepto por covariant).
         * 3. La accesibilidad (modificador) debe ser la misma ó menos accesible del padre a más accesible en el hijo.
         *    Si se hace más accesible el padre y menos accesible el hijo, será ILEGAL.
         * 4. Métodos privados ó estáticos no pueden ser sobreescritos.
         */
        Son s = new Son();
        s.drive();
    }
}
