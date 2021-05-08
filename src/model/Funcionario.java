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


    public void cadastrarVoluntario(){

    }

    public void removerVoluntario(){

    }

    public void aceitarDoacao(){

    }

    public void cadastrarEvento(){

    }

    public void cadastrarTrabalho(){


    }

    public void importarDados(){

    }

    public void gerarRelatorio(){

    }


}
