package ConexaoDAO;

import DTO.UserDTO;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class UserDAO {
     Connection conn;
     PreparedStatement pstm;
     
    public String id, auth, role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
     
    public String getId() {
        return id;
    };

    public void setId(String id) {
        this.id = id;
    };
    
    public void cadastrar(UserDTO objadotadordto){
        String sql = "INSERT INTO usuario(nome, email, senha, tipo) VALUES (?, ?, ?, ?)";
        conn = new Conexaobd().conebd();
    
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objadotadordto.getNome());
            pstm.setString(2, objadotadordto.getEmail());
            pstm.setString(3, objadotadordto.getSenha());
            pstm.setString(4, objadotadordto.getTipo());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel Cadastrar "+ erro);
        }
    }
    
    public String login(UserDTO objadotadordto){
        String sql = "SELECT id, tipo FROM usuario WHERE email = ? AND senha = ?";
        conn = new Conexaobd().conebd();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objadotadordto.getEmail());
            pstm.setString(2, objadotadordto.getSenha());
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                setId(rs.getString("id"));
                System.out.println(rs.getString("id"));
                setRole(rs.getString("tipo"));
                String m = rs.getString("tipo").toString();
                System.out.println(m);
                
                auth = m.toString();
                System.out.println(auth);
            }
            pstm.close();
            return auth;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar Usuários "+ erro);
            return "false";
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
     
    
    public ArrayList<UserDTO> listarUsuarios(Connection con){
        String sql = "SELECT email, nome FROM usuario";
        ArrayList<UserDTO> list = new ArrayList<>();
        conn = new Conexaobd().conebd();
        
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                UserDTO obj = new UserDTO();

                obj.setNome(rs.getString("nome"));
                obj.setEmail(rs.getString("email"));

                list.add(obj);
            }

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, id);
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            //JOptionPane.showMessageDialog(null, "Não foi possivel listar Usuários "+ erro);
        }
        
        return list;
    }
    
}
  