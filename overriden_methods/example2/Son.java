package oracle_certification_preparation.overriden_methods.example2;

public class Son extends Father {

    public static void sayHello() {
        System.out.println("Static: Hello from son");
    }

    public void sayHi() {
        System.out.println("Instance: Hi from Son");
    }
}
