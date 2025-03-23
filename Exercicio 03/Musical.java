public abstract class Musical extends Obra {
    private double tempoMusica;

    public Musical(int ano, double tempoMusica) {
        super(ano);
        this.tempoMusica = tempoMusica;
    }

    public double getTempoMusica() {
        return tempoMusica;
    }
}