package oracle_certification_preparation.object_type_casting;

public class Main {

    public static void main(String[] args) {
        Person p = new Employee(); // VALIDO POR QUE Employee es un subtype de Person.

        // p solo tendrá acceso a las variables y metodos de Person. Excepto si el metodo está siendo
        // sobreescrito en Employee. En ese caso se llamaría al metodo de Employee por la sobreescritura.
        System.out.println(p.getDescription());

        // CASTING: Este casting sirve para obtener la funcionalidad especifica de una referencia de un subtipo.
        Employee e = (Employee) p; // valido por que Employee es un subtype de Person.
        e.title = "Instructor"; // VALIDO por que e está declarado en Employee.


        // EN VEZ DE CREAR UNA NUEVA REFERENCIA COMO SE HIZO ARRIBA, EL EJEMPLO DE ABAJO MUESTRA UNA FORMA
        // DE ACCEDER A TITLE DESDE EMPLOYEE SIN TENER QUE CREAR UNA NUEVA REFERENCIA:
        Person p2 = new Employee();
        System.out.println(p2.getDescription());
        ((Employee) p2).title = "Instructor";


        // El siguiente ejemplo dará un ClassCastException:
        Person p3 = new Person();
        Employee e1 = (Employee) p3; // Castear un objeto Person a Employee no será posible.
        // Solo se podría castear a Employee si el objeto con el que se está creando fuera: new Employee()


    }
}
