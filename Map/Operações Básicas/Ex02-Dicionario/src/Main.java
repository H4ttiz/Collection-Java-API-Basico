import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        Scanner entrada = new Scanner(System.in);
        int opc = -1;

        do {
            System.out.println("1 - Cadastrar no Dicionario");
            System.out.println("2 - Remover do Dicionario");
            System.out.println("3 - Listar Dicionario");
            System.out.println("4 - Pesquisar no Dicionario");
            System.out.println("5 - Sair");
            opc = entrada.nextInt();
            entrada.nextLine();

            switch (opc) {
                case 1 ->{
                    System.out.println("Digite o nome da Palavra: ");
                    String palavra = entrada.nextLine();
                    System.out.println("Digite a descrição da Palavra: ");
                    String descricao = entrada.nextLine();
                    dicionario.adicionarPalavra(palavra, descricao);
                    break;
                }
                case 2 ->{
                    System.out.println("Digite o nome da Palavra: ");
                    String palavra = entrada.nextLine();
                    dicionario.removerPalavra(palavra);
                    break;
                }
                case 3 ->{
                    dicionario.exibirPalavras();
                    break;
                }
                case 4 ->{
                    System.out.println("Digite o nome da Palavra: ");
                    String palavra = entrada.nextLine();
                    System.out.println(dicionario.pesquisarPorPalavra(palavra));
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
