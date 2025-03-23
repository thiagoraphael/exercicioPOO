public class Rock extends Musical {
    public Rock(int ano, double tempoMusica) {
        super(ano, tempoMusica);
    }

    @Override
    public void detalhes() {
        System.out.println("Música Rock - Ano: " + getAno() + ", Duração: " + getTempoMusica() + " min");
    }
}
