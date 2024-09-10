package oracle_certification_preparation.extra_notes_switch;

public class SwitchExample {

    public static void main(String[] args) {
        int value = getValue();
        final int caseValue = 1;

        switch (value) {
            case caseValue: // solo será legal si la variable es una CONSTANTE en el case.
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default:
                System.out.println("Default case");
        }
    }


    public static int getValue() {
        return 2;
    }


    /** TODO
     * NOTA IMPORTANTE: RECORDAR HACER EL VIDEO 96 DEL CURSO.. ESE ME LO SALTÉ.
     */
}
