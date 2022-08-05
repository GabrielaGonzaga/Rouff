package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DB_Connection {
    
    public void conectDB(){
        Connection con = null;         
        try{
                String url = "jdbc:mysql://localhost:3306/rouff?user=root&password=";
                con = DriverManager.getConnection(url);
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "DB Connection" + e.getMessage());
        };    
    };
    
};
