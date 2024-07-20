package oracle_certification_preparation.enumexample;

public class MusicTypeExample {

    public static void main(String[] args) {
        MusicType music = MusicType.JAZZ;
        System.out.println(music.toString());

        switch (music) {
            case ROCK:
                System.out.println(music.toString());
                break;
            case JAZZ:
                System.out.println("Es jazz...");
                break;
            default:
                System.out.println("Ninguna opcion");
        }

        // Iterar sobre todos los valores de MusicType
        for (MusicType m : MusicType.values()) {
            System.out.println(m.toString());
        }


    }


}
