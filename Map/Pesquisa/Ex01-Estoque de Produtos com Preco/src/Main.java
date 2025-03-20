import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Exbir Produto");
            System.out.println("3 - Calcular Valor Total no Estoque");
            System.out.println("4 - Produto mais Caro");
            System.out.println("5 - Produto mais Barato");
            System.out.println("6 - Produto Com maior Preço/quantidade no Estoque");
            System.out.println("7 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 ->{
                    System.out.println("Digite o nome do produto: ");
                    String nomeProduto = sc.nextLine();
                    System.out.println("Digite o Codigo do produto: ");
                    long codigoProduto = sc.nextInt();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidadeProduto = sc.nextInt();
                    System.out.println("Digite o valor do produto: ");
                    double valorProduto = sc.nextDouble();
                    estoqueProdutos.adicionarProduto(codigoProduto, nomeProduto, quantidadeProduto, valorProduto);
                    break;
                }
                case 2 ->{
                    estoqueProdutos.exibirProdutos();
                    break;
                }
                case 3 ->{
                    System.out.println("Valor total no estoque: ");
                    System.out.println(estoqueProdutos.calcularValorTotalEstoque());
                    break;
                }
                case 4 ->{
                    System.out.println("Produto mais Caro: ");
                    System.out.println(estoqueProdutos.obterProdutoMaisCaro());
                    break;
                }
                case 5 ->{
                    System.out.println("Produto mais Barato: ");
                    System.out.println(estoqueProdutos.obterProdutoMaisBarato());
                    break;
                }
                case 6 ->{
                    System.out.println("Produto com Maior Quantidade por Valor Total no Estoque: ");
                    System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
                    break;
                }
                case 7 ->{
                    opcao = 0;
                    System.out.println("Saindo...");
                    break;
                }
            }

        }while (opcao != 0);
    }
}
