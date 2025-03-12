import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("1 - Adicionar uma tarefa");
            System.out.println("2 - Remover uma tarefa");
            System.out.println("3 - Listar uma tarefa");
            System.out.println("4 - Contar Tarefas");
            System.out.println("5 - Exibir tarefas Concluidas");
            System.out.println("6 - Exibir tarefas Pendentes");
            System.out.println("7 - Marcar tarefa com Concluida");
            System.out.println("8 - Marcar tarefa com Pendentes");
            System.out.println("9 - Limpar Lista");
            System.out.println("10 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1->{
                    System.out.println("Digite a Descrição da tarefa: ");
                    String descricao = sc.nextLine();
                    listaTarefa.adicionaTarefa(descricao);
                    break;
                }
                case 2->{
                    System.out.println("Digite a Descrição da tarefa que deseja remover: ");
                    String descricao = sc.nextLine();
                    listaTarefa.removerTarefa(descricao);
                    break;
                }
                case 3->{
                    System.out.println("Lista de Tarefas: ");
                    listaTarefa.exibirTarefas();
                    break;
                }
                case 4->{
                    System.out.println("Numero de Tarefas: " + listaTarefa.contarTarefas());
                    break;
                }
                case 5->{
                    System.out.println("TAREFAS CONCLUIDA: ");
                    System.out.println(listaTarefa.obterTarefasConcluidas());
                    break;
                }
                case 6->{
                    System.out.println("TAREFAS PENDENTES: ");
                    System.out.println(listaTarefa.obterTarefasPendentes());
                    break;
                }
                case 7->{
                    System.out.println("Digite a Descrição da tarefa: ");
                    String descricao = sc.nextLine();
                    listaTarefa.marcarTarefaConcluida(descricao);
                    break;
                }
                case 8->{
                    System.out.println("Digite a Descrição da tarefa: ");
                    String descricao = sc.nextLine();
                    listaTarefa.marcarTarefaPendente(descricao);
                    break;
                }
                case 9->{
                    listaTarefa.limparListaTarefas();
                    System.out.println("Lista de Tarefas limpada! ");
                    break;
                }
                case 10->{
                    opcao = 0;
                    System.out.println("Saindo....");
                    break;
                }
            }
        }while (opcao != 0);
    }
}
