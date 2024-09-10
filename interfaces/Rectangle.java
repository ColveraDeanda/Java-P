package oracle_certification_preparation.interfaces;

public class Rectangle implements interfacesExample{

    public void testDraw() {
        draw(); // LEGAL

//        doSomething();  ILEGAL
        interfacesExample.doSomething();  // LEGAL
    }
}
