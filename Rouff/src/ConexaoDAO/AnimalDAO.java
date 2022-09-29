package ConexaoDAO;

import DTO.AnimalDTO;
import DTO.UserDTO;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AnimalDAO {
    Connection conn;
    PreparedStatement pstm;
     
    public String id, auth, role;

   
    
    public void cadastrar(AnimalDTO objAnimal){
        String sql = "INSERT INTO animal(nome, tipo, raca, descricao) VALUES (?, ?, ?, ?)";
        conn = new Conexaobd().conebd();
    
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAnimal.getNome());
            pstm.setString(2, objAnimal.getTipo());
            pstm.setString(3, objAnimal.getRaca());
            pstm.setString(4, objAnimal.getDescricao());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel Cadastrar "+ erro);
        }
    }
      
    
    public ArrayList<AnimalDTO> listarAnimais(Connection con){
        String sql = "SELECT id, nome, tipo, raca, descricao FROM animal";
        ArrayList<AnimalDTO> list = new ArrayList<>();
        conn = new Conexaobd().conebd();
        
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                AnimalDTO obj = new AnimalDTO();

                rs.getString("id");
                obj.setId(rs.getString("id"));
                obj.setNome(rs.getString("nome"));
                obj.setTipo(rs.getString("tipo"));
                obj.setRaca(rs.getString("raca"));
                obj.setDescricao(rs.getString("descricao"));

                list.add(obj);
            }

            pstm = conn.prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            //JOptionPane.showMessageDialog(null, "Não foi possivel listar os Animais "+ erro);
        }
        
        return list;
    }
    
}
  