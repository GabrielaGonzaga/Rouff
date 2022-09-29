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
    
        public void aprovarAdocao(AdocaoDTO objAdocao){
        String sql = "UPDATE adocoes SET status = ? where id= ?;";
        conn = new Conexaobd().conebd();
        
        try {
            UserDAO us = new UserDAO();
            
            pstm = conn.prepareStatement(sql);
            pstm.setBoolean(1, objAdocao.isStatus());
            System.out.println((objAdocao.isStatus()));
            pstm.setInt(2, Integer.parseInt(objAdocao.getId()));
            System.out.println(objAdocao.getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel Cadastrar "+ erro);
        }
    }
    
    public ArrayList<AdocaoDTO> listarAdocoes(Connection con){
        //String sql = "SELECT a.id, an.nome as animal, us.nome, a.status FROM adocoes a INNER JOIN animal an ON a.id_animal = an.id INNER JOIN usuario us ON a.id_adoatnte = us.id";
        String sql = "SELECT a.id, us.nome, an.nome as animal, a.status FROM adocoes AS a INNER JOIN animal as an ON (a.id_animal = an.id) INNER JOIN usuario as us ON (a.id_adotante = us.id);";
        ArrayList<AdocaoDTO> list = new ArrayList<>();
        conn = new Conexaobd().conebd();
        
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                AdocaoDTO obj = new AdocaoDTO();

                rs.getString("id");
                obj.setId(rs.getString("id"));
                obj.setAnimal(rs.getString("animal"));
                obj.setUsuario(rs.getString("nome"));
                obj.setStatus(rs.getBoolean("status"));

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
  