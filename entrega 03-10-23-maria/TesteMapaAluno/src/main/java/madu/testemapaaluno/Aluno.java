package madu.testemapaaluno;

public class Aluno {
    private int matricula;
    private String nome, turno, curso;

    public Aluno(int matricula, String nome, String turno, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.turno = turno;
        this.curso = curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getTurno() {
        return turno;
    }

    public String getCurso() {
        return curso;
    }   
}
