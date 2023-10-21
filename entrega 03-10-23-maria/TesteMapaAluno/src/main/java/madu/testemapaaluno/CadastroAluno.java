package madu.testemapaaluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class CadastroAluno {
    
    List<Aluno> alunos = new ArrayList<>();
    
    public void cadastrarAluno(Aluno aluno){
        alunos.add(aluno);         
    }      
    
    public void ordenarPorMatricula() {        
        Collections.sort(alunos, new Comparator<Aluno>() {
        @Override
        public int compare(Aluno aluno1, Aluno aluno2) {
            return Integer.compare(aluno1.getMatricula(), aluno2.getMatricula());
        }
    }); 
    }
    
    public void imprimeVetor(){
        ordenarPorMatricula();
        System.out.println("---------------------");
        System.out.println("Alunos cadastrados:");
        System.out.println("---------------------");
        
        for(int indice = 0; indice < alunos.size(); indice++) {
            System.out.println("Matrícula: " + alunos.get(indice).getMatricula());
            System.out.println("Nome: " + alunos.get(indice).getNome());
            System.out.println("Turno: " + alunos.get(indice).getTurno());
            System.out.println("Curso: " + alunos.get(indice).getCurso());
            System.out.println("---------------------");   
        }
    }
}
