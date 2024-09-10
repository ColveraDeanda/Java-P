package oracle_certification_preparation.Initialization_Blocks2;

public class DatabaseConfig {
    static int maxConnections;
    static String dbURL;

    /**
     *  El bloque static funciona muy bien para asignarle algun valor a nuestras variables static
     */
    static {
        maxConnections = 100;  // Asigna valor a la variable estática
        dbURL = "jdbc:mysql://localhost:3306/myDatabase"; // Asigna valor a la variable estática
        System.out.println("Configuración de la base de datos inicializada.");
    }

    public static void connect() {
        System.out.println("Conectando a " + dbURL + " con un máximo de " + maxConnections + " conexiones.");
    }



    public static void main(String[] args) {
        DatabaseConfig.connect();  // Primero ejecuta el bloque estático, luego el método connect.
    }
}
