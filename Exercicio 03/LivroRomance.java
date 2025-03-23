public class LivroRomance extends Escrita {
    public LivroRomance(int ano, int numeroPaginas) {
        super(ano, numeroPaginas);
    }

    @Override
    public void detalhes() {
        System.out.println("Livro de Romance - Ano: " + getAno() + ", Páginas: " + getNumeroPaginas());
    }
}
