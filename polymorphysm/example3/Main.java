package oracle_certification_preparation.polymorphysm.example3;

public class Main {

    public static void main(String[] args) {
        /**
         * Esto que se hace aqui se le llama: Dynamic mhethod dispatching.
         */
        Person p = new Employee();
        System.out.println(p.getDescription());

        // Si estoy tratando de acceder a algo que solo tiene Employee, desde mi variable de referencia Person. Esto
        // NO COMPILARÁ.

        // p.title;
    }
}
