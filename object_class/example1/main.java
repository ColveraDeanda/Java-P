package oracle_certification_preparation.object_class.example1;

public class main {

    public static void main(String[] args) {
        MyDate party = new MyDate(23,06,1998);
        MyDate taxDue = new MyDate(12,11,2005);

        /**
         * Como la clase MyDate esta extendiendo de Object, las instancias tienen acceso a los metodos:
         * 1. toString()
         * 2. equals()
         */

        System.out.println(party.toString()); // Identidad del objeto. Regresará un string representando el tipo y hashcode.
        /**
         * El método toString debe ser usado para convertir un objeto a un string.
         */

        System.out.println(party.equals(taxDue)); // false
        System.out.println(party == taxDue); // false


        /**
         * Al agregar un objeto a un String con el operaor +, el objeto llamará automáticamente toString.
         */
        // Ejemplo interesante:
        String partyWithString = "Concatination an object " + party;
        System.out.println(partyWithString);
    }
}
