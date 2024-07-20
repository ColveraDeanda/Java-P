package oracle_certification_preparation.javadoc;

// JavaDoc buscará los comentarios con ** y los agregará como parte de la documentación.

/**
 * Creates a car that prints description
 * @author Cristobal
 */
public class Car {

    /**
     * The color of the car
     */
    public String color;
    public String type;
    public int serialNumber;

    /**
     * Used to generate a unique number for the serial number.
     */
    public static int carCount;

    /**
     * This buils a green Sedan.
     */
    public Car() {
        this("green", "sedan");
    }

    /**
     * This creates a custom Car
     * @param c Color
     * @param t Type
     */
    public Car(String c, String t) {
        carCount++;
        serialNumber = carCount;
        color = c;
        type = t;
    }

    /**
     * Create a String that is the description of the car.
     * @return the generated car.
     */
    public String getDescription() {
        String desc = "This is a " + this.color + " " + this.type;
        return desc;
    }


}
