package model;

import java.util.ArrayList;


public class Utils {
    
    
    public ArrayList<Usuarios> usuarios  = new ArrayList<Usuarios>();
     public ArrayList<Funcionario> funcionarios  = new ArrayList<Funcionario>();
    
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
  }  
  
   public Usuarios checkLogin (String usuario){
        
        Utils util = Utils.getInstancia();
        
        for (Usuarios u: util.usuarios){
            
            if (u.getUsuario().equalsIgnoreCase(usuario)){
                return (u);
            }
            
        else {
                return null;
            }    
    }
    return null;
    }
  
  
  
   public String login (String usuario, String senha){
            Usuarios user = checkLogin(usuario);
           
            if (user != null){
                
                if (user.getSenha().equals(senha))
                    
                    return user.getPermissao();
                            
            }
           return "erro";       
    }
}
