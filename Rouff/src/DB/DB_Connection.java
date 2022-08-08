package DB;

import java.sql.*;
import javax.swing.JOptionPane;

public class DB_Connection {
    
    public Connection conectDB(){
        Connection conn = null;         
        try{
                String url = "jdbc:mysql://localhost:3306/rouff?user=root&password=";
                conn = DriverManager.getConnection(url);
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "DB Connection" + e.getMessage());
        }
        return conn;
    };
    
};
