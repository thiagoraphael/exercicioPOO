public class FilmeComedia extends Filme {
    public FilmeComedia(int ano) {
        super(ano, "Comédia");
    }

    @Override
    public void detalhes() {
        System.out.println("Filme de Comédia - Ano: " + getAno() + ", Gênero: " + getGenero());
    }
}
