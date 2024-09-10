package oracle_certification_preparation.polymorphysm.example2;

public class Automobile {

    private static int vinCount = 3_818_202;
    private int VIN;

    public int getVin() {
        return VIN;
    }

    public Automobile() {
        VIN = vinCount++;
    }
}
