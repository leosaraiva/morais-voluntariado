/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ELI
 */
public class Main {
    
    public static void main(String[] args){
    
        Funcionario funcionario = new Funcionario("Iria", "rua", "3123135", "dfsdffsf", "sdfsdfsd", "5545", "2020258");
        Gestor gestor = new Gestor();
        gestor.cadastrarFuncionario(funcionario);
        System.out.println(funcionario.getNome());
        
        
        Utils util = Utils.getInstancia();
    
        for (Funcionario f: util.funcionarios){
        System.out.println(f.getNome());}
        
    }
    
}
