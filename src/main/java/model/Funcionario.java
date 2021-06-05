package model;

import java.util.ArrayList;
import java.util.List;


public class Funcionario extends Pessoa {
    // atributos
    private String matricula;
    private Voluntario voluntario;
    public List<Voluntario> voluntariosCadastrados = new ArrayList<Voluntario> ();
    public List<String> doacoesCadastradas = new ArrayList<String> ();
  // List<Voluntario> voluntariosRemovidos = new ArrayList<Voluntario> ();
    List<String> relatoriosEmitidos = new ArrayList<String> ();

    // construtores

    public Funcionario(String nome, String endereco, String telefone, String email, String cpf, String dataNascimento, String matricula) {
        super(nome, endereco, telefone, email, cpf, dataNascimento);
        this.matricula = matricula;
    }
    public Funcionario(){}
    
    //Get / Set
    
    public Voluntario getVoluntario() {
		return voluntario;
	}
    
    public void setVoluntario(Voluntario voluntario) {
		this.voluntario = voluntario;
	}
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    
    // metodos
    
    public void cadastrarVoluntarios(Voluntario voluntario) {
	this.voluntariosCadastrados.add(voluntario);
    }
	
    public void cadastrarDoacoes(String doacao, String data) {
        this.doacoesCadastradas.add(data+" - R$"+doacao);
    }
    
    public void removerVoluntarios(Voluntario voluntario) {
	this.voluntariosCadastrados.remove(voluntario);
    }
	
    public void cadastrarRelatorios(String relatorio) {
        this.relatoriosEmitidos.add(relatorio);
    }
    
    public Voluntario consultaVoluntario(String matricula){
       Utils util = Utils.getInstancia();
        
        for (Voluntario v: this.voluntariosCadastrados){
            
            if (v.getMatricula().equalsIgnoreCase(matricula)){
                return (v);
        
        }
        
       

    }return null; 
    
    }
    
    public String doacaoToString() {
        StringBuilder sb = new StringBuilder();
        for (String doacao: this.doacoesCadastradas){
            sb.append(doacao + "\n" );
        }     
       return sb.toString();
       }
    
    public String voluntarioToString(Voluntario v) {
         StringBuilder sb = new StringBuilder();
          sb.append("Nome: " + v.getNome() + "\n");
          sb.append("Matrícula: " + v.matricula + "\n");
          return sb.toString();
    }
}