package oracle_certification_preparation.overloading_methods;

import java.sql.SQLOutput;

public class OverloadMethods {

    /**
     * Sobrecarga de metodos: Esto significa que un metodo puede tener el mismo nombre las veces que se quiera, siempre
     * y cuando tenga un numero diferente de parámetros ó un tipo de dato diferente.
     *
     * El tipo de retorno o el nombre del parámetro no se toma en cuenta en la firma del método.
     */

    public void greeting(int age){
        System.out.println("Greeting 1");
        System.out.println(age);
    }

    public void greeting(String name){
        System.out.println("Greeting 1");
        System.out.println(name);
    }

    public void greeting(String name, int age){
        System.out.println("Greeting 2");
        System.out.println(name);
    }

    public void greeting(int age, String name){
        System.out.println("Greeting 3");
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        OverloadMethods myMethods = new OverloadMethods();

        myMethods.greeting("Cristobal");
        myMethods.greeting("Cristobal", 26);
        myMethods.greeting(26, "Cristobal");
    }


}
