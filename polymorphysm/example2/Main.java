package oracle_certification_preparation.polymorphysm.example2;

public class Main {

    private static InventoryManager manager = new InventoryManager();

    public static void main(String[] args) {
        Car car = new Car();
        manager.addFeaturedAuto(car);


    }


}
