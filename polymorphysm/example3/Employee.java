package oracle_certification_preparation.polymorphysm.example3;

public class Employee extends Person {
    String title = "Engineer";
    public String getDescription() {
        System.out.println("In Employee");
        return super.getDescription() + ": " + title;
    }
}
