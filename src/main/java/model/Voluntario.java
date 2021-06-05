package model;

import java.util.Scanner;

public class Voluntario extends Pessoa{

    // atributos
    private String disponibilidadeVoluntario;
     public String matricula;

    // construtoresstring 
    public Voluntario(String nome, String endereco, String telefone, String email, String cpf, String dataNascimento, String disponibilidadeVoluntario,String matricula ) {
        super(nome, endereco, telefone, email, cpf, dataNascimento);
        this.disponibilidadeVoluntario = disponibilidadeVoluntario;
        this.matricula = matricula;
    }
    public Voluntario(){}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // metodos


    public String getDisponibilidadeVoluntario() {
        return disponibilidadeVoluntario;
    }

    public void setDisponibilidadeVoluntario(String disponibilidadeVoluntario) {
        this.disponibilidadeVoluntario = disponibilidadeVoluntario;
    }

 //   public Evento buscarEvento(String palavraChave){
 //       for (Evento ev : Evento().eventos){
 //           if (ev.contains(palavraChave)){
 //                 return ev;
  //          }
   //         else {return null;}
    //    }

   // }

    public void aceitarTrabalho(){

    }

    public void doarValor(){

    }

    public void doarAlimento(){
    
    }
    

}
