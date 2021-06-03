package model;

import model.Utils;
        
public class Usuarios {
    
    private String usuario, senha, permissao;
    
    
    public Usuarios (String usuario, String senha, String permissao){
        
        this.usuario = usuario;
        this.senha = senha;
        this.permissao = permissao;
            
        
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }
    
}
