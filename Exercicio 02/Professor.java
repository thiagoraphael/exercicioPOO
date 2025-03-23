import java.util.Arrays;
import java.util.Date;

public class Professor extends Pessoa {
    private double salario;
    private String[] disciplinas;

    public Professor(String nome, String cpf, Date dataNascimento, double salario, String[] disciplinas) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário: " + salario + ", Disciplinas: " + Arrays.toString(disciplinas);
    }
}
