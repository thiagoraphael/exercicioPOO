public class LivroFiccao extends Escrita {
    public LivroFiccao(int ano, int numeroPaginas) {
        super(ano, numeroPaginas);
    }

    @Override
    public void detalhes() {
        System.out.println("Livro de Ficção - Ano: " + getAno() + ", Páginas: " + getNumeroPaginas());
    }
}