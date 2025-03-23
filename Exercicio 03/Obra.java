public abstract class Obra {
    private int ano;

    public Obra(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public abstract void detalhes();
}