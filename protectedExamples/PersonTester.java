package oracle_certification_preparation.protectedExamples;

public class PersonTester {

    public void testingProtectedMethod() {
        /**
         * Cuando la clase está en el mismo package, solo se podrá tener acceso al método o propiedad protected haciendo
         * una instancia. NO se podrá directamente.
         */
        //doSomething(); ILEGAL
    }

    public static void main(String[] args) {

        /**
         * Es posible acceder al metodo protected desde otra clase, siempre y cuando sean del mismo package.
         */
        Person p = new Person();
        p.doSomething();


    }
}
