import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("1 - Adicionar Convidado");
            System.out.println("2 - Remover Convidado");
            System.out.println("3 - Contar Convidado");
            System.out.println("4 - Exibir Convidado");
            System.out.println("5 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1->{
                    System.out.println("===========================================");
                    System.out.println("Digite o nome do Convidado: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o Codigo do Convidado: ");
                    int codigo = sc.nextInt();
                    conjuntoConvidados.adicionarConvidado(nome, codigo);
                    System.out.println("Convidado adicionado com sucesso!");
                    System.out.println("===========================================");
                    break;
                }
                case 2->{
                    System.out.println("===========================================");
                    System.out.println("Digite o Codigo do Convidado: ");
                    int codigo = sc.nextInt();
                    conjuntoConvidados.removerConvidadoPorCodigoConvite(codigo);
                    System.out.println("Convidado removido com sucesso!");
                    System.out.println("===========================================");
                    break;
                }
                case 3->{
                    System.out.println("===========================================");
                    System.out.println("NUMERO DE CONVIDADOS: ");
                    System.out.println(conjuntoConvidados.contarConvidados());
                    System.out.println("===========================================");
                    break;
                }
                case 4->{
                    System.out.println("===========================================");
                    System.out.println("Convidados: ");
                    conjuntoConvidados.exibirConvidados();
                    System.out.println("===========================================");
                    break;
                }
                case 5->{
                    opcao = 0;
                    System.out.println("===========================================");
                    System.out.println("Saindo....");
                    break;
                }
            }
        }while (opcao != 0);
    }
}
