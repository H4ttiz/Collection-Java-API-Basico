import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("1 - Adicionar um numero");
            System.out.println("2 - Somar um numeros");
            System.out.println("3 - Mostrar Numero Maior");
            System.out.println("4 - Mostrar Numero Menor");
            System.out.println("5 - Mostrar todos os Numeros");
            System.out.println("6 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite um numero: ");
                    int num1 = sc.nextInt();
                    somaNumeros.adicionarNumero(num1);
                    break;
                }
                case 2 -> {
                    System.out.println("A soma dos numeros: " + somaNumeros.calcularSoma());
                    break;
                }
                case 3 -> {
                    System.out.println("O Maior numero da lista: " + somaNumeros.encontrarMaiorNumero());
                    break;
                }
                case 4 -> {
                    System.out.println("O Menor numero da lista: " + somaNumeros.encontrarMenorNumero());
                    break;
                }
                case 5 -> {
                    somaNumeros.exibirNumeros();
                }
                case 6 -> {opcao = 0;break;}
            }
        }while (opcao != 0);

    }
}
