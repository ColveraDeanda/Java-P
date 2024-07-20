package oracle_certification_preparation.composition;

public class Car {

    // La composicion es una forma de establecer relacion entre clases. Donde una clase incluye instancias de otras clases.

    /**
     * Con composition, puedes decir "tiene un" entre clases. Por ejemplo:
     * - Un carro tiene un model.
     * - Un carro tiene un engine.
     */

    private String model;
    private Engine engine;  // Composición aquí

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
