public abstract class Escrita extends Obra {
    private int numeroPaginas;

    public Escrita(int ano, int numeroPaginas) {
        super(ano);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}