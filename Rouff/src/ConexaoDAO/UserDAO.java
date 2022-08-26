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
            JOptionPane.showMessageDialog(null, "UserDAO "+ erro);
        }
    }
    
    public boolean login(UserDTO objadotadordto){
        String sql = "SELECT * FROM usuario WHERE email = ? AND senha = ?;";
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
        catch(Exception e){
            e.printStackTrace();
            return false ;  
        }       
    }
    
}
  