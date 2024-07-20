package oracle_certification_preparation.passing_by_value;

public class PassingByValueInObjects {

    /**
     * Ahora en el caso de objetos: Cuando se le pasa un objeto a un metodo, se le está pasando la referencia del objeto.
     *
     * Esto significa que tanto la variable original como el parámetro del método apuntan al mismo objeto en memoria.
     */

    public static void main(String[] args) {
        Persona persona = new Persona(30);
        incrementarEdad(persona);
        System.out.println(persona.edad); // Esto imprimirá 31
    }

    public static void incrementarEdad(Persona p) {
        p.edad = p.edad + 1; // Modifica el objeto al que la referencia 'p' apunta.
    }

    /**
     * Cuando pasas un objeto a un método en Java, lo que realmente estás pasando es una la referencia al objeto.
     * Esto significa que tanto la variable original como el parámetro del método apuntan al mismo objeto real en la memoria, pero son,
     * en sí mismos, referencias independientes.
     */


}
