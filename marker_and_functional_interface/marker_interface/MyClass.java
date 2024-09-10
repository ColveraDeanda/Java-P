package oracle_certification_preparation.marker_and_functional_interface.marker_interface;

public class MyClass implements MyMarkerInterface {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
