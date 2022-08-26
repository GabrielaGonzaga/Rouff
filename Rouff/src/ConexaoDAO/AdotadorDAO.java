package ConexaoDAO;

import DTO.AdotadorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AdotadorDAO {
     Connection conn;
     PreparedStatement pstm;
     
    public void cadastrarAdotante(AdotadorDTO objadotadordto){
        String sql = "insert into usuario (nome, email) values (?,?)";
    conn = new Conexaobd().conebd();
    
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objadotadordto.getNome());
            pstm.setString(2, objadotadordto.getEmail());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AdotanteDAO "+ erro);
        }
    }
    
}
