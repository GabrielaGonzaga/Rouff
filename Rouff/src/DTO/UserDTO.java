package DTO;
public class UserDTO {
    //atributos
    private String senha, email, nome, tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    //metodos especiais
    public String getSenha() {
        return senha;
    }

    public void setSenha(String nome) {
        this.senha = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
