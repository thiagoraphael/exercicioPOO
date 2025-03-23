import java.util.Date;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Date dataNascimento;

    public Pessoa(String nome, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public double tirarCopias(int quantidade) {
        return quantidade * 0.10;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Data de Nascimento: " + dataNascimento;
    }
}
