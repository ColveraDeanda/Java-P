package oracle_certification_preparation.polymorphysm.example4;

public class Main {

    public static void main(String[] args) {

        Person p = new Employee();
        p.setFirstName("Jane"); // Legal, porque setFirstName está disponible en Person.
       // p.setSalary(80000); // Ilegal, porque setSalary no está disponible en Person.

        Employee e = new Instructor();
        e.setFirstName("Jane"); // Legal, porque setFirstName está disponible en Employee a través de Person.
        e.setSalary(80000); // Legal, porque setSalary está disponible en Employee
    }
}
