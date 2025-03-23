public class FilmeFiccao extends Filme {
    public FilmeFiccao(int ano) {
        super(ano, "Ficção");
    }

    @Override
    public void detalhes() {
        System.out.println("Filme de Ficção - Ano: " + getAno() + ", Gênero: " + getGenero());
    }
}