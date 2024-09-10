package oracle_certification_preparation.overriden_methods.example1;

public class Father {

    public void drive() {
        setVelocity(45);
        go();
    }

    private void setVelocity(int velocity) {
        System.out.println(velocity);
    }

    private void go() {
        System.out.println("Go");
    }
}
