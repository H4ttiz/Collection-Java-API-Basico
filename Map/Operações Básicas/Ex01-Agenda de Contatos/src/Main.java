import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        Scanner sc = new Scanner(System.in);
        int opc = -1;

        do {
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Remover Contato");
            System.out.println("3 - Listar Contatos");
            System.out.println("4 - Buscar Contato");
            System.out.println("5 - Sair");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1 ->{
                    System.out.println("Digite o nome do contato: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o numero do contato: ");
                    Integer numero = sc.nextInt();
                    agendaContatos.adicionarContato(nome, numero);
                    break;
                }
                case 2 ->{
                    System.out.println("Digite o nome do contato: ");
                    String nome = sc.nextLine();
                    agendaContatos.removerContato(nome);
                    break;
                }
                case 3 ->{
                    agendaContatos.exibirContatos();
                    break;
                }
                case 4 ->{
                    System.out.println("Digite o nome do contato: ");
                    String nome = sc.nextLine();
                    System.out.println(agendaContatos.pesquisarPorNome(nome));
                    break;
                }
                case 5 ->{
                    opc = 0;
                    System.out.println("Saindo....");
                    break;
                }
            }
        }while(opc != 0);
    }
}
