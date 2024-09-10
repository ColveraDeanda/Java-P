package oracle_certification_preparation.object_class.example2;

public class main {

    public static void main(String[] args) {

        /**
         * Aunque los valores son los mismos, party y taxDue son dos objetos diferentes en la memoria.
         */
        MyDate party = new MyDate(23,06,1998);
        MyDate taxDue = new MyDate(23,06,1998);


        /**
         * El operador == compara las referencias de los objetos, es decir, verifica si ambos objetos apuntan al mismo lugar en la memoria.
         * En este caso, party y taxDue son dos objetos diferentes, por lo que esta condición será false y no se imprimirá el mensaje.
         */
        if(party == taxDue){
            System.out.println("References point to the same object.");
        }

        /**
         * equals que está siendo sobreescrito, compara los campos day, month y year de taxtDue con los del objeto actual (this).
         */
        if(party.equals(taxDue)){
            System.out.println("The dates have the same day, month & year.");
        }
    }

}
