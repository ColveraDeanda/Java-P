package oracle_certification_preparation.enumexample;

public enum MusicType {

    CLASSICAL(1), JAZZ(4), ROCK(6), METAL(11);

    private int earDamageFactor;

    /**
     * Este constructor permite asociar un valor a cada una de las constantes de enum. El valor sera earDamageFactor.
     * @param earDamageFactor
     */
    private MusicType(int earDamageFactor) {
        this.earDamageFactor = earDamageFactor;
    }

    /**
     *
     * @return ordinal: Es la posición en la declaración del enum, comenzando desde 0.
     */
    public String toString() {
        return this.name() + " - " + this.ordinal() + " - " + this.earDamageFactor;
    }
}
