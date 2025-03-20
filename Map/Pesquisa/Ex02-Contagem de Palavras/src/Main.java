import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContagemPalavras palavras = new ContagemPalavras();
        Scanner ler = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("1 - Adicionar uma Palavra");
            System.out.println("2 - Remover uma Palavra");
            System.out.println("3 - Exibir numero de Palavras");
            System.out.println("4 - Encontrar Palavra mais Frequente");
            System.out.println("5 - Sair");
            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {
                case 1 ->{
                    System.out.println("Digite uma Palavra: ");
                    String palavra = ler.nextLine();
                    System.out.println("Digite a quantidade: ");
                    int quantidade = ler.nextInt();
                    palavras.adicionarPalavra(palavra, quantidade);
                    break;
                }
                case 2 ->{
                    System.out.println("Digite uma Palavra: ");
                    String palavra = ler.nextLine();
                    palavras.removerPalavra(palavra);
                    break;
                }
                case 3 ->{
                    System.out.println("O numero de palavras são: ");
                    System.out.println(palavras.exibirContagemPalavras());
                    break;
                }
                case 4 ->{
                    System.out.println("Palavra mais Frequente: ");
                    System.out.println(palavras.encontrarPalavrasMaisFrequente());
                    break;
                }
                case 5 ->{
                    opcao = 0;
                    System.out.println("Saindo....");
                    break;
                }
            }
        }while (opcao != 0);
    }
}
