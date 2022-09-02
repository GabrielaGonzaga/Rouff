package ConexaoDAO;

import DTO.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UserDAO {
     Connection conn;
     PreparedStatement pstm;
     
    public String id;
     
    public String getId() {
        return id;
    };

    public void setId(String id) {
        this.id = id;
    };
    
    public void cadastrar(UserDTO objadotadordto){
        String sql = "INSERT INTO usuario(nome, email, senha) VALUES (?, ?, ?)";
        conn = new Conexaobd().conebd();
    
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objadotadordto.getNome());
            pstm.setString(2, objadotadordto.getEmail());
            pstm.setString(3, objadotadordto.getSenha());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel Cadastrar "+ erro);
        }
    }
    
    public boolean login(UserDTO objadotadordto){
        String sql = "SELECT id FROM usuario WHERE email = ? AND senha = ?;";
        setId(sql);
        conn = new Conexaobd().conebd();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objadotadordto.getEmail());
            pstm.setString(2, objadotadordto.getSenha());
            ResultSet rs = pstm.executeQuery();                        
            if(rs.next())     
                return true ;   
            else
                return false ;            
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar Login "+ erro);
            return false ;  
        }       
    }
    
    public void logout(UserDTO objadotadordto){
        setId(null);
     }
    
     public void deletarConta(UserDTO objadotadordto){
        String sql = "DELETE FROM usuarios WHERE id = ?;";
        conn = new Conexaobd().conebd();
    
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar Usuários "+ erro);
        }
    }
    
      public void listarAdocoes(UserDTO objadotadordto){
        String sql = "SELECT * FROM adocoes WHERE id = ? ;";
        conn = new Conexaobd().conebd();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, id);
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar Usuários "+ erro);
        }
    }
    
}
  