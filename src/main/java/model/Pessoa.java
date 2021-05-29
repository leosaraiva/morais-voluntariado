package model;

public class Pessoa {


    // atributos
    private String nome, endereco, telefone, email, cpf, dataNascimento;

    // construtores


    public Pessoa(String nome, String endereco, String telefone, String email, String cpf, String dataNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa(){}

    // metodos


    // gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    // outros metodos

    public String toString() {
        StringBuilder sb = new StringBuilder();
          sb.append("Nome: " + this.nome + "\n");
          sb.append("Endereço: " + this.endereco + "\n");
          sb.append("Telefone: " + this.telefone + "\n");
          sb.append("E-mail: " + this.email + "\n");
          sb.append("CPF: " + this.cpf + "\n");
          sb.append("Data de Nascimetno: " + this.dataNascimento + "\n");    
    return sb.toString();
    }


}
