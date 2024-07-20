package oracle_certification_preparation.this_keyword;

public class Car {

    String color;
    String type;

    int serialNumber;
    static int carCount;

    Car() {
        carCount++;
        serialNumber = carCount;
    }
    Car(String color, String type) {
        this(); // De esta forma 'this' tambien sirve para llamar a un constructor y hacer encadenamiento de constructores.
        this.color = color;
       // this(); // Esto es ilegal. this() debe ser la 1ra linea en el constructor.
        this.type = type;
    }



    /**
     * "this" se refiere a este objeto. this sirve para quitar ambiguedad. En este caso se puede usar o no.
     */
    public String getDescription() {
         //this(); Esto tambien es ilegal. Solo se puede usar this() dentro de un constructor.
        return "This is a " + this.color + " " + this.type;
    }

    /**
     * En este caso this puede servir perfectamente para quitar ambiguedad.
     */
    public void customize(String color, String type) {
        this.color = color;
        this.type = type;
        System.out.println(getDescription());
    }

}
