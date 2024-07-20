package oracle_certification_preparation.herencia;

public class Employee extends Person {

    /**
     * La herencia describe una relacion "Es un".
     *
     * Con lo anterior dicho, se puede decir que: Employee es una Persona.
     */

    private int salary;
    public Employee(String name, int age, int salary) {
        super(name, age); // Chaining constructors.
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "salary: " + salary + " name: " + getName() + " age: " + getAge();
    }
}
