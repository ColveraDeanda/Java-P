package oracle_certification_preparation.herencia;

public class main {

    public static void main(String[] args) {

        Employee empleado = new Employee("Cristobal", 26, 30000);

        System.out.println(empleado.getName());   // gerName esta en la Clase Person.
        empleado.displayInfo();                   // displayInfo esta en la clase Person.
        System.out.println(empleado.getSalary());

        System.out.println(empleado);

        /**
         * La clase Empleado está heredando los atributos y métodos de Person
         *
         *  - Importante, Java solo permite heredar con extends de una sola clase.
         *  - Es decir, una clase solo puede tener una parent class.
         *  - Pero una clase puede tener multiples child clases. Por ejemplo: asi como tengo la clase Employee que
         *    extiende de person, puedo tener la clase Consultant que de igual forma extienda de Person.
         */
    }
}
