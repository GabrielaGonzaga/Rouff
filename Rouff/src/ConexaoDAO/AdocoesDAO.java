package ConexaoDAO;

import DTO.UserDTO;
import ConexaoDAO.UserDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AdocoesDAO {
     Connection conn;
     PreparedStatement pstm;
     
   
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
    

    public void listarAdocoes(UserDTO objadotadordto){
        String sql = "SELECT * FROM adocoes WHERE id = ? ;";
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
  