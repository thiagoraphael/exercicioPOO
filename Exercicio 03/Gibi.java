public class Gibi extends Escrita {
    public Gibi(int ano, int numeroPaginas) {
        super(ano, numeroPaginas);
    }

    @Override
    public void detalhes() {
        System.out.println("Gibi - Ano: " + getAno() + ", Páginas: " + getNumeroPaginas());
    }
}
