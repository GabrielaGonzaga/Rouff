package DB;

import java.sql.*;
import javax.swing.JOptionPane;

public class UserDB {
    Connection conn;
    PreparedStatement pstm;
    
    public void userLogin(UserDB objUser){
        String sql = "SELECT * FROM usuario WHERE email = ? AND senha = ?";
        conn = new DB_Connection().conectDB();
            
         try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUser.);
              

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir!" + e );
        }       
    }
    
    /*public void userLogin(UserDB objUser){
        String sql = "INSERT INTO aluno(id, email, password)" + "VALUES(null, ?, ? )";
        
        conn = new DB_Connection().conectDB();
            
         try{
            pstm = conn.prepareStatement(sql);
            
              

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir!" + e );
        }       
    }
    */
    
    //obter conexao 

}
