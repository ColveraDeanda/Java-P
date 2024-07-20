package oracle_certification_preparation.passing_by_value;

public class PassingByValue {

    /**
     * TODO: TODAS LAS VARIABLES SE PASAN VALOR EN JAVA.
     * - Un dato primitivo se pasa por valor: Esto quiere decir que se hace una copia del valor primitivo.
     * - Un objeto pasa por valor: Esto quiere decir que se hace una copia de la referencia del objeto.
     */

    /**
     * Cuando pasa una variable primtiva a un metodo, se le esta pasando una copia del valor original de la variable.
     * Cualquier cambio que el metodo haga, no afectará a la variable original
     */
    // Ejemplo:
    public static void main(String[] args) {
        int a = 10;
        incrementarValor(a);
        System.out.println(a); // 10
    }

    public static void incrementarValor(int numero) {
        numero = numero + 1; // Esto cambia solo la copia local de numero.
    }

    /**
     * Seguridad de los datos: Puedes pasar datos a los métodos sin preocuparte de que estos métodos modifiquen tus variables originales.
     */


}
