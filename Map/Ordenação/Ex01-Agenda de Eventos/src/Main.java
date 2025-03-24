import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        Scanner entrada = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("1 - Adicionar Evento");
            System.out.println("2 - Exibir Agenta");
            System.out.println("3 - Obter proximo evento");
            System.out.println("4 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1->{
                    System.out.println("Digite o nome do evento: ");
                    String nome = entrada.nextLine();
                    System.out.println("Digite a atração do evento: ");
                    String atracao = entrada.nextLine();
                    System.out.println("Digite a Data do Evento (Ex: 2025-03-24): ");
                    LocalDate dataEvento = LocalDate.parse(entrada.nextLine());
                    agenda.adicionarEvento(dataEvento, nome, atracao);
                    break;
                }
                case 2->{
                    agenda.exibirAgenda();
                    break;
                }
                case 3->{
                    agenda.obterProximoEvento();
                    break;
                }
                case 4->{
                    System.out.println("Saindo....");
                    opcao = 0;
                    break;
                }
            }
        }while (opcao != 0);
    }
}
