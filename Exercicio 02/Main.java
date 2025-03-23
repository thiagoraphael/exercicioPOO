import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos Silva", "123.456.789-00", new Date(), "20241001");
        Professor professor = new Professor("Ana Souza", "987.654.321-00", new Date(), 5000.00, new String[]{"Matemática", "Física"});
        Funcionario funcionario = new Funcionario("Marcos Lima", "555.666.777-88", new Date(), 3000.00, new Date(), "Secretário");

        System.out.println(aluno);
        System.out.println("Custo para 1000 cópias: R$ " + aluno.tirarCopias(1000));

        System.out.println(professor);
        System.out.println("Custo para 1000 cópias: R$ " + professor.tirarCopias(1000));

        System.out.println(funcionario);
        System.out.println("Custo para 1000 cópias: R$ " + funcionario.tirarCopias(1000));
    }
}