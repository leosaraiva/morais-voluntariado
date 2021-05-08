package model;

public class Gestor extends Pessoa {
    // atributos
    private String matricula;

    // construtores

    public Gestor(String nome, String endereco, String telefone, String email, String cpf, String dataNascimento, String matricula) {
        super(nome, endereco, telefone, email, cpf, dataNascimento);
        this.matricula = matricula;
    }
    public Gestor(){}

    // metodos

    public void cadastrarFuncionario(){

    }

    public void analisarReceita(){

    }

    public void analisarDespesas(){

    }

    public void gerarRelatorio(){

    }

}
