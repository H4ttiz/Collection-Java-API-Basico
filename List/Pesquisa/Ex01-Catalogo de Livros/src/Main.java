import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        do{
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Pesquisar por Autor");
            System.out.println("3 - Pesquisar por Intervalo de Ano");
            System.out.println("4 - Pesquisar por titulo");
            System.out.println("5 - Sair");
            opcao = sc.nextInt();

            switch(opcao){
                case 1 -> {
                    System.out.println(" Digite o Titulo:");
                    String titulo = sc.next();
                    System.out.println(" Digite o Autor:");
                    String autor = sc.next();
                    System.out.println(" Digite o Ano:");
                    int anoPublicacao = sc.nextInt();
                    catalogo.adicionarLivro(titulo, autor, anoPublicacao);
                    break;
                }
                case 2 -> {
                    System.out.println("Digite o Autor:");
                    String autor = sc.next();
                    System.out.println(catalogo.pesquisarPorAutor(autor));
                    break;
                }
                case 3 -> {
                    System.out.println("Digite o Ano Inicial:");
                    int anoInicial = sc.nextInt();
                    System.out.println("Digite o Ano Final:");
                    int anoFinal = sc.nextInt();
                    System.out.println(catalogo.pesquisarPorIntervaloAnos(anoInicial, anoFinal));
                    break;
                }
                case 4 -> {
                    System.out.println("Digite o Titulo:");
                    String titulo = sc.next();
                    System.out.println(catalogo.pesquisarPorTitulo(titulo));
                    break;
                }
                case 5 -> {
                    opcao = 0;
                }
            }
        }while(opcao != 0);
    }
}
