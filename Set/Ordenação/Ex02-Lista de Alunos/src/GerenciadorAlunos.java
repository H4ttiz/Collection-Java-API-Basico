import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Alunos> gerenciadorAlunos;

    public GerenciadorAlunos() {
        this.gerenciadorAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        gerenciadorAlunos.add(new Alunos(nome, matricula, media));
        System.out.println("Aluno " + nome + " adicionado com sucesso!");
    }

    public void removerAluno(long matricula){
        Alunos alunoParaRemover = null;
        if (!gerenciadorAlunos.isEmpty()) {
            for (Alunos a : gerenciadorAlunos) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            gerenciadorAlunos.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }

        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }else{
            System.out.println("Aulo removido com sucesso!");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome = new TreeSet<>(gerenciadorAlunos);
        if(!gerenciadorAlunos.isEmpty()){
            System.out.println(alunosPorNome);
        }else {
            System.out.println("Lista esta vazia!");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Alunos> alunosPorNota = new TreeSet<>(new AlunosComparator());
        if(!gerenciadorAlunos.isEmpty()){
            alunosPorNota.addAll(gerenciadorAlunos);
            System.out.println(alunosPorNota);
        }else {
            System.out.println("Lista esta vazia!");
        }
    }
}
