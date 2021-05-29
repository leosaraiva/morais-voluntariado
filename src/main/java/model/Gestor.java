package model;
import model.Usuarios;
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

    public void cadastrarFuncionario(Funcionario funcionario){
        Utils util = Utils.getInstancia();
        util.funcionarios.add(funcionario); 
        
    }

    public void analisarReceita(){

    }

    public void analisarDespesas(){

    }

    public void gerarRelatorio(){

    }
    
    public Funcionario consultaFuncionario(String matricula ){
       Utils util = Utils.getInstancia();
        
        for (Funcionario f: util.funcionarios){
            
            if (f.getMatricula().equalsIgnoreCase(matricula)){
                return (f);
            }
            
        else {
                return null;
            }    
        }
        
       return null; 

    }
    
    

}
