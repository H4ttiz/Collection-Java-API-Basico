import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("1-Cadastro de Pessoas");
            System.out.println("2-Ordenar por Altura");
            System.out.println("3-Ordenar por Idade");
            System.out.println("4-Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome da pessoa: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a altura da pessoa: ");
                    double altura = sc.nextDouble();
                    System.out.println("Digite a idade da pessoa: ");
                    int idade = sc.nextInt();
                    ordenacaoPessoas.adicionarPessoa(nome,idade,altura);
                    System.out.println("Pessoa adicionada com sucesso!");
                    break;
                }
                case 2 -> {
                    System.out.println("Pessoas ordenadas por Altura: ");
                    System.out.println(ordenacaoPessoas.ordenarPorAltura());
                    break;
                }
                case 3 -> {
                    System.out.println("Pessoas ordenadas por Idade: ");
                    System.out.println(ordenacaoPessoas.ordenarPorIdade());
                    break;
                }
                case 4 -> {
                    opcao = 0;
                    System.out.println("Saindo....");
                    break;
                }
            }
        }while (opcao != 0);
    }
}
