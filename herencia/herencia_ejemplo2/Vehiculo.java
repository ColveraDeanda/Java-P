package oracle_certification_preparation.herencia.herencia_ejemplo2;

public class Vehiculo {
    private String tipo;
    // Constructor de Vehiculo
    public Vehiculo() {
        this.tipo = "Desconocido";
        System.out.println("Constructor de Vehiculo: Tipo es " + tipo);
    }

    public Vehiculo(String tipo) {
        this.tipo = tipo;
        System.out.println("Constructor de Vehiculo con tipo: " + tipo);
    }
}
