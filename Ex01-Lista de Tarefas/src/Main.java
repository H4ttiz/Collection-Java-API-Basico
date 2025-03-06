import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Remover Tarefa");
            System.out.println("3 - Obter Número Total de Tarefas");
            System.out.println("4 - Obter Descrições das Tarefas");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = sc.nextLine();
                    listaTarefas.adicionarTarefa(descricao);
                }
                case 2 -> {
                    System.out.print("Digite a descrição da tarefa a remover: ");
                    String descricao = sc.nextLine();
                    listaTarefas.removerTarefa(descricao);
                }
                case 3 -> System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
                case 4 -> listaTarefas.obterDescricoesTarefas();
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        sc.close();
    }
}