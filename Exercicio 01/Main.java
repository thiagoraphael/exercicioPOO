import java.util.*;

public class Main {
    private static List<Cliente> clientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Carro");
            System.out.println("3. Listar Carros de um Cliente");
            System.out.println("4. Remover Carro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarCliente();
                case 2 -> cadastrarCarro();
                case 3 -> listarCarros();
                case 4 -> removerCarro();
                case 5 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void cadastrarCliente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        clientes.add(new Cliente(nome, cpf, telefone, email, endereco));
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void cadastrarCarro() {
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        Cliente cliente = buscarCliente(cpf);

        if (cliente != null) {
            System.out.print("Placa: ");
            String placa = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Cor: ");
            String cor = scanner.nextLine();
            System.out.print("Potência: ");
            int potencia = scanner.nextInt();
            System.out.print("Valor: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            cliente.adicionarCarro(new Carro(placa, modelo, marca, ano, cor, potencia, valor));
            System.out.println("Carro cadastrado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void listarCarros() {
        System.out.print("Digite o CPF do cliente: ");
        Cliente cliente = buscarCliente(scanner.nextLine());

        if (cliente != null) cliente.listarCarros();
        else System.out.println("Cliente não encontrado.");
    }

    private static void removerCarro() {
        System.out.print("Digite o CPF do cliente: ");
        Cliente cliente = buscarCliente(scanner.nextLine());

        if (cliente != null) {
            System.out.print("Digite a placa do carro: ");
            cliente.removerCarro(scanner.nextLine());
            System.out.println("Carro removido!");
        }
    }

    private static Cliente buscarCliente(String cpf) {
        return clientes.stream().filter(c -> c.getCpf().equals(cpf)).findFirst().orElse(null);
    }
}
