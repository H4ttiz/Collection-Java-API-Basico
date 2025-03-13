import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        Scanner teclado = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Remover aluno");
            System.out.println("3 - Exibir alunos por Nome");
            System.out.println("4 - Exibir alunos por Nota");
            System.out.println("5 - Sair");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1->{
                    System.out.println("Digite o nome do aluno: ");
                    String nome = teclado.nextLine();
                    System.out.println("Digite a nota do aluno: ");
                    double nota = teclado.nextDouble();
                    System.out.println("Digite a matricula do aluno: ");
                    long matricula = teclado.nextLong();
                    gerenciador.adicionarAluno(nome,matricula,nota);
                    break;
                }
                case 2->{
                    System.out.println("Digite a matricula do aluno: ");
                    long matricula = teclado.nextLong();
                    gerenciador.removerAluno(matricula);
                    break;
                }
                case 3->{
                    System.out.println("Alunos por Nome: ");
                    gerenciador.exibirAlunosPorNome();
                    break;
                }
                case 4->{
                    System.out.println("Alunos por Nota: ");
                    gerenciador.exibirAlunosPorNota();
                    break;
                }
                case 5->{
                    opcao = -0;
                    System.out.println("Saindo....");
                    break;
                }
            }
        }while (opcao != 0);
    }
}
