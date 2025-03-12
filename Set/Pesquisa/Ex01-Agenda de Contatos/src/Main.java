import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1 - Adicionar Contato");
            System.out.println("2 - Exibir Contatos");
            System.out.println("3 - Pesquisar Por Nome");
            System.out.println("4 - Atualizar Numero");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefone = sc.nextLine();
                    agenda.adicionarContato(nome, telefone);
                }
                case 2 -> {
                    System.out.println("CONTATOS:");
                    agenda.exibirContatos();
                }
                case 3 -> {
                    System.out.print("Digite o nome para pesquisar: ");
                    String nome = sc.nextLine();
                    System.out.println(agenda.pesquisarPorNome(nome));
                }
                case 4 -> {
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o novo telefone: ");
                    String telefone = sc.nextLine();
                    System.out.println(agenda.atualizarNumeroContato(nome, telefone));
                }
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        sc.close();
    }
}
