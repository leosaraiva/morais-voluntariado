package model;

import java.util.Scanner;

public class Voluntario extends Pessoa{

    // atributos
    private String disponibilidadeVoluntario;


    // construtores
    public Voluntario(String nome, String endereco, String telefone, String email, String cpf, String dataNascimento, String disponibilidadeVoluntario) {
        super(nome, endereco, telefone, email, cpf, dataNascimento);
        this.disponibilidadeVoluntario = disponibilidadeVoluntario;
    }
    public Voluntario(){}

    // metodos


    public String getDisponibilidadeVoluntario() {
        return disponibilidadeVoluntario;
    }

    public void setDisponibilidadeVoluntario(String disponibilidadeVoluntario) {
        this.disponibilidadeVoluntario = disponibilidadeVoluntario;
    }

    public void buscarEvento(){

    }

    public void aceitarTrabalho(){

    }

    public void doarValor(){

    }

    public void doarAlimento(){

    }

}
