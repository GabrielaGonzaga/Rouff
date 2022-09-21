package ConexaoDAO;

import DTO.UserDTO;
import ConexaoDAO.UserDAO;
import DTO.AdocaoDTO;
import DTO.AnimalDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AdocoesDAO {
     Connection conn;
     PreparedStatement pstm;
     
   
    public void cadastrar(AdocaoDTO objAdocao){
        String sql = "INSERT INTO adocoes(id_adotante, id_animal, status) VALUES (?, ?, false)";
        conn = new Conexaobd().conebd();
        
        try {
            UserDAO us = new UserDAO();
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, Integer.parseInt(objAdocao.getId_adotante()));
            System.out.println(us.getId());
            pstm.setInt(2, Integer.parseInt(objAdocao.getId_animal()));
            System.out.println(objAdocao.getId_animal());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel Cadastrar "+ erro);
        }
    }
    
      /* 
        public ArrayList<AdocaoDTO> listarAdocoes(Connection con){
        String sql = "SELECT id, id_animal, id_adotante, status, descricao FROM animal";
        ArrayList<AdocaoDTO> list = new ArrayList<>();
        conn = new Conexaobd().conebd();
        
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                AdocaoDTO obj = new AdocaoDTO();

                rs.getString("id");
                obj.setId(rs.getString("nome"));
                obj.(rs.getString("tipo"));
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
    */ 
}
  