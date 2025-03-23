public class MPB extends Musical {
    public MPB(int ano, double tempoMusica) {
        super(ano, tempoMusica);
    }

    @Override
    public void detalhes() {
        System.out.println("Música MPB - Ano: " + getAno() + ", Duração: " + getTempoMusica() + " min");
    }
}
