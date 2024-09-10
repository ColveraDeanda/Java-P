package oracle_certification_preparation.overriden_methods.example2;

public class Tester {

    public static void main(String[] args) {
        Father f = new Son(); // Instancia de Son, pero referencia de Father

        /**
         * Nota:
         * 1. Los métodos static no participan en la sobreescritura típica de métodos de instancia.
         * 2. Los métodos static se asocian con la clase donde SE DECLARA LA REFERENCIA, NO CON LA CLASE DEL OBJETO.
         *  En este caso, f está declarado como tipo Father, por lo tanto, se llama al método estático sayHello() de Father.
         */
        f.sayHello(); // Static: Hello from father.

        /**
         * Nota:
         * - A diferencia de los métodos estáticos, los métodos de instancia son polimórficos.
         * - Aunque la referencia f es de tipo Father, el objeto real es una instancia de Son. Por lo tanto, Java utiliza el método sayHi() que Son ha sobrescrito.
         *
         */
        f.sayHi();    // Instance: Hi from Son.
    }
}
