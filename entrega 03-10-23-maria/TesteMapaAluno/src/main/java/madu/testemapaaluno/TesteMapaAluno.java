package madu.testemapaaluno;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class TesteMapaAluno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroAluno cadastro = new CadastroAluno();
        
        System.out.println("Atividade 4:");
                
        System.out.println("Cadastro - 10 alunos: ");
        System.out.println("cadastrar manualmente 10 alunos ou testar o codigo com 10 alunos já criados?");
        System.out.println("1 -  manualmente");
        System.out.println("2 - default");
        
        int opcaoMenu = sc.nextInt();
        
        switch (opcaoMenu) {
            case 1:
                for(int i = 1; i <= 10; i++){
                    System.out.println("---------------------");
                    System.out.println("Insira o numero de matricula do aluno "+ i+ ": ");
                    int matriculaAluno = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insira o nome do aluno "+ i+ ": ");
                    String nomeAluno =  sc.nextLine();
                    System.out.println("Insira o turno do aluno "+ i+ ": ");
                    String turnoAluno = sc.nextLine();
                    System.out.println("Insira o curso do aluno "+ i+ ": ");
                    String cursoAluno = sc.nextLine();
                    System.out.println("---------------------");
                    Aluno aluno = new Aluno(matriculaAluno, nomeAluno, turnoAluno, cursoAluno);
                    cadastro.cadastrarAluno(aluno);
                }   break;
            case 2:
                Aluno aluno1 = new Aluno(32143312, "João Pedro", "Manhã" , "Desenvolviemento de Sitemas");
                Aluno aluno2 = new Aluno(76123485, "Amanda Batista", "Manhã", "Enfermagem");
                Aluno aluno3 = new Aluno(21318489, "Maria Eduarda","Manhã" , "Enfermagem");
                Aluno aluno4 = new Aluno(12389573, "Ana Paula", "Tarde", "Desenvolviemento de Sitemas");
                Aluno aluno5 = new Aluno(89231478, "Maria Eduarda", "Noite", "Desenvolviemento de Sitemas");
                Aluno aluno6 = new Aluno(28197411, "Arthur Jorge", "Tarde", "Enfermagem");
                Aluno aluno7 = new Aluno(00010222, "Alex Lima", "Manhã", "Desenvolviemento de Sitemas");
                Aluno aluno8 = new Aluno(17999991, "Esdras Santos", "Noite", "Desenvolviemento de Sitemas");
                Aluno aluno9 = new Aluno(11239811, "Isabella Caster", "Tarde", "Enfermagem");
                Aluno aluno10 = new Aluno(19790020, "Maria Cecília", "Manhã", "Desenvolviemento de Sitemas");
                cadastro.cadastrarAluno(aluno1);
                cadastro.cadastrarAluno(aluno2);
                cadastro.cadastrarAluno(aluno3);
                cadastro.cadastrarAluno(aluno4);
                cadastro.cadastrarAluno(aluno5);
                cadastro.cadastrarAluno(aluno6);
                cadastro.cadastrarAluno(aluno7);
                cadastro.cadastrarAluno(aluno8);
                cadastro.cadastrarAluno(aluno9);
                cadastro.cadastrarAluno(aluno10);
                break;
            default:
                System.out.println("opcao inválida");
                break;
        }
        
        cadastro.imprimeVetor();
        
        System.out.println("Atividade 5:");
        Aluno aluno11 = new Aluno(12345, "Pedro", "Manhã" , "Desenvolviemento de Sitemas");
        Aluno aluno12 = new Aluno(67890, "Amanda", "Manhã", "Enfermagem");
        Aluno aluno13 = new Aluno(11123, "Madu","Manhã" , "Enfermagem");
        Aluno aluno14 = new Aluno(13145, "Paula", "Tarde", "Desenvolviemento de Sitemas");
        Aluno aluno15 = new Aluno(15167, "Eduarda", "Noite", "Desenvolviemento de Sitemas");
        
        Map<Integer, Aluno> mapaAlunos = new HashMap<>();
        
        mapaAlunos.put(aluno11.getMatricula(), aluno11);
        mapaAlunos.put(aluno12.getMatricula(), aluno12);
        mapaAlunos.put(aluno13.getMatricula(), aluno13);
        mapaAlunos.put(aluno14.getMatricula(), aluno14);
        mapaAlunos.put(aluno15.getMatricula(), aluno15);
        
        System.out.println("Busca pelo número de matrícula: ");
        int matriculaBuscada = sc.nextInt();
        Aluno alunoBuscado = mapaAlunos.get(matriculaBuscada);
        
        if (alunoBuscado != null) {
            System.out.println("---------------------");
            System.out.println("Aluno encontrado!");
            System.out.println("Matrícula: " + alunoBuscado.getMatricula());
            System.out.println("Nome: " + alunoBuscado.getNome());
            System.out.println("Turno: " + alunoBuscado.getTurno());
            System.out.println("Curso: " + alunoBuscado.getCurso());
        } else {
            System.out.println("---------------------");
            System.out.println("Aluno não encontrado!");
        }
    }
}
