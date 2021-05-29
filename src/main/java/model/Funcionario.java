package model;


public class Funcionario extends Pessoa {
    // atributos
    private String matricula;

    // construtores

    public Funcionario(String nome, String endereco, String telefone, String email, String cpf, String dataNascimento, String matricula) {
        super(nome, endereco, telefone, email, cpf, dataNascimento);
        this.matricula = matricula;
    }
    public Funcionario(){}

    // metodos

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

  

}