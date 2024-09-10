package oracle_certification_preparation.polymorphysm.example3;

public class Person {
    String firstName = "Cristobal";
    String lastName = "Olvera";
    public String getDescription() {
        System.out.println("In Person");
        return firstName + " " + lastName;
    }
}
