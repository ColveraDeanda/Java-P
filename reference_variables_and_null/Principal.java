package oracle_certification_preparation.reference_variables_and_null;

public class Principal {

    public static void main(String[] args) {

        /**
         * Si la variable tiene un valor null, significa que está en "dangerous state".
         * El codigo de abajo lanzará un error "NullPointerException".
         */
        String s = null; // variable de referencia s con valor null
        s = s.toUpperCase(); // Oops! s is null!

        /**
         * En el caso de tener acceder a un metodo estático desde una variable de referencia null,
         * NO marcará error.
         */

        Math m = null;
        double result = m.floor(28.15); // Confusing code, but it works.

        // QUIZ
        /**
         * public class Person {
         *
         *     String firstName;
         *     static void setFirstName(String newValue) {
         *         firstName = newValue;
         *     }
         *
         *     public static void main(String[] args) {
         *         Person p = new Person();
         *         p.setFirstName("Jason");
         *         System.out.println( "firstName: " + p.firstName );
         *     }
         * }
         *
         * El codigo no compilara por que no se puede tener una variable de instancia en un contexto estatico (dentro de setFirstName)
         */

        /**
         * Nota: Static methods and variables are available as soon as the class has been loaded.
         */

    }
}
