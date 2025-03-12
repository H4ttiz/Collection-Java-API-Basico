import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("1 - Adicionar uma palavra");
            System.out.println("2 - Remover uma palavra");
            System.out.println("3 - verificar uma palavra");
            System.out.println("4 - Exibir as Palavras");
            System.out.println("5 - sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1->{
                    System.out.println("==============================================");
                    System.out.println("Digite uma palavra: ");
                    String palavra = sc.nextLine();
                    conjunto.adicionarPalavra(palavra);
                    System.out.println("==============================================");
                    break;
                }
                case 2->{
                    System.out.println("==============================================");
                    System.out.println("Digite uma palavra: ");
                    String palavra = sc.nextLine();
                    conjunto.removerPalavra(palavra);
                    System.out.println("==============================================");
                    break;
                }
                case 3->{
                    System.out.println("==============================================");
                    System.out.println("Digite uma palavra: ");
                    String palavra = sc.nextLine();
                    System.out.println("A palavra esta no conjunto: " + conjunto.verificarPalavra(palavra));
                    System.out.println("==============================================");
                    break;
                }
                case 4->{
                    System.out.println("==============================================");
                    System.out.println("Palavras no Conjunto: ");
                    conjunto.exibirPalavrasUnicas();
                    System.out.println("==============================================");
                    break;
                }
                case 5->{
                    opcao = 0;
                    System.out.println("==============================================");
                    System.out.println("Saindo....");
                    break;
                }

            }
        }while (opcao != 0);
    }
}
