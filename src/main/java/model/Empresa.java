package model;

public class Empresa {

    // atributos
    private String razaoSocial, endereco, telefone, email, cnpj, site;

    // construtores

    public Empresa(String razaoSocial, String endereco, String telefone, String email, String cnpj, String site) {
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
        this.site = site;
    }
    public Empresa(){}

    // metodos

    // gets e sets


    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    // outros metodos

    public String toString() {
        return  "\nRazão Social: " + razaoSocial +
                "\nEndereço: " + endereco +
                "\nTelefone: " + telefone +
                "\nEmail: " + email +
                "\nCNPJ: " + cnpj +
                "\nWebsite: " + site;
    }


}
