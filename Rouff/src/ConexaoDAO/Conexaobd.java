package ConexaoDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexaobd {
    public Connection conebd() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/rouff?user=root&password=Semprepea10";
            conn = DriverManager.getConnection(url);
            System.out.println("foi");
            //JOptionPane.showMessageDialog(null,"foi");
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"erro na conexaoDAO"+ erro.getMessage());
        }
            return conn;
    }
    
}
