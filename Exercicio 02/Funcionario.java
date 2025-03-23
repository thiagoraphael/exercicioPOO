import java.util.Date;

public class Funcionario extends Pessoa {
    private double salario;
    private Date dataAdmissao;
    private String cargo;

    public Funcionario(String nome, String cpf, Date dataNascimento, double salario, Date dataAdmissao, String cargo) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário: " + salario + ", Data de Admissão: " + dataAdmissao + ", Cargo: " + cargo;
    }
}
