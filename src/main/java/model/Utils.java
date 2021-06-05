package model;

import java.util.ArrayList;


public class Utils {
    
    
    public ArrayList<Usuarios> usuarios  = new ArrayList<Usuarios>();
     public ArrayList<Funcionario> funcionarios  = new ArrayList<Funcionario>();
     public ArrayList<Voluntario> voluntarios = new ArrayList<Voluntario>();
     public ArrayList<Evento> eventos = new ArrayList<Evento>();
     
     // Constructor
	private Utils() {
	}
  
    private static Utils instancia = null;

	
	public static Utils getInstancia() {
		if (instancia == null) {
			instancia = new Utils();
		}
		return instancia;
	}

        
  public void memoria(){
      
      Usuarios user = new Usuarios("eli", "123", "gestor");
      usuarios.add(user);
      Usuarios user2 = new Usuarios("leo", "abc", "voluntario");
      usuarios.add(user2);
      Usuarios user3 = new Usuarios("lucas", "abc", "funcionario");
      usuarios.add(user3);
    //  Evento evento1 = new Evento("Bingo", "25/12/2021", 5, 10000, 100, "Lucas", "Lar da Providência", "Uniesp", "Arrecadar para o Natal");
     // eventos.add(evento1);
      
  }  
  
   public Usuarios checkLogin (String usuario){
        
        for (Usuarios u: this.usuarios){
            
            if (usuario.equals(u.getUsuario())){
                return (u);
            }
        }
        return null;
    }
  
   
  
   public String login (String usuario, String senha){
            Usuarios user = checkLogin(usuario);
           
            if (user != null){
            
                if(user.getUsuario().equals(usuario) && user.getSenha().equals(senha)){
                    return user.getPermissao();

                }
            }
           return "erro";       
    }
}
