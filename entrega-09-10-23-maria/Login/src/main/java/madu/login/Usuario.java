package madu.login;

public class Usuario {
    private String nome, sobrenome, sexo, idade;

    public Usuario(String nome, String sobrenome, String sexo, String idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getIdade() {
        return idade;
    }    
    
    public String getNomeCompleto(){
        return nome + " " + sobrenome;
    }
}
