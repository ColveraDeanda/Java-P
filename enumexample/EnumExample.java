package oracle_certification_preparation.enumexample;

public class EnumExample {

    public static void main(String[] args) {
        Days today = Days.FRIDAY;
        String theDay = Days.FRIDAY.name(); // El método name() servirá para traernos el valor en String de esa constante de tipo enum.
        Days userDays = Days.valueOf("TUESDAY"); // valueOf lo que esta haciendo aqui es convertir el string en una constante de tipo enum.

        String response = "";

        switch(today) {
            case MONDAY: // Se pone solo el valor del enum.
                response = "Get to work";
                break;
            case FRIDAY:
                response = "Time to relax";
                break;
            default:
                response = "Practice Java... ";
        }
        System.out.println(response);
    }
}
