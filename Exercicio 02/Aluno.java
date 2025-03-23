import java.util.Date;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String cpf, Date dataNascimento, String matricula) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }

    @Override
    public double tirarCopias(int quantidade) {
        return quantidade * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matrícula: " + matricula;
    }
}
