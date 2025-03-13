import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("1 - Cadastro de Produtos");
            System.out.println("2 - Exibir Produtos por Nome");
            System.out.println("3 - Exibir Produtos por Preço");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1->{
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o codigo do produto: ");
                    long codigo = sc.nextLong();
                    System.out.println("Digite o Preço do produto: ");
                    double preco = sc.nextDouble();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    cadastroProdutos.adicionarProduto(codigo, nome, preco, quantidade);
                    break;
                }
                case 2->{
                    System.out.println("Produtos por Nome: ");
                    System.out.println(cadastroProdutos.exibirProdutosPorNome());
                    break;
                }
                case 3->{
                    System.out.println("Produtos por Preço: ");
                    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
                    break;
                }
                case 4->{
                    opcao = -0;
                    System.out.println("Saindo....");
                    break;
                }
            }
        }while (opcao != 0);
    }



}
