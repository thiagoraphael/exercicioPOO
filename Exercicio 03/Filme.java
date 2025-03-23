public abstract class Filme extends Obra {
    private String genero;

    public Filme(int ano, String genero) {
        super(ano);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}