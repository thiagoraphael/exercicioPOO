public class LivroAutoAjuda extends Escrita {
    public LivroAutoAjuda(int ano, int numeroPaginas) {
        super(ano, numeroPaginas);
    }

    @Override
    public void detalhes() {
        System.out.println("Livro de Autoajuda - Ano: " + getAno() + ", Páginas: " + getNumeroPaginas());
    }
}
