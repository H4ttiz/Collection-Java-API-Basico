import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenarNumeros = new OrdenacaoNumeros();
        Scanner entrada = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("1 - Inserir um numero");
            System.out.println("2 - Ordenar de forma Ascendente");
            System.out.println("3 - Ordenar de forma Descendente");
            System.out.println("4 - Exibir os numeros");
            System.out.println("5 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1->{
                    System.out.println("Digite um numero: ");
                    int numero = entrada.nextInt();
                    ordenarNumeros.adicionarNumero(numero);
                    break;
                }
                case 2->{
                    System.out.println("Numeros ordenados com o forma Ascendente: ");
                    System.out.println(ordenarNumeros.ordenarAscendente());
                    break;
                }
                case 3->{
                    System.out.println("Numeros ordenados com o forma Descendente: ");
                    System.out.println(ordenarNumeros.ordenarDescendente());
                    break;
                }
                case 4->{
                    System.out.println("Numeros sem ordenação: ");
                    ordenarNumeros.exibirNumeros();
                    break;
                }
                case 5->{
                    opcao = 0;
                    System.out.println("Saindo....5");
                    break;
                }
            }

        }while (opcao != 0);
    }
}
