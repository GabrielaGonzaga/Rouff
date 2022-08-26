package ConexaoDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexaobd {
    public Connection conebd() {
        Connection conn = null;
        String localBD = "localhost";
        String usuario = "root";
        String senha = "Senai123";
        try {
            String url = "jdbc:mysql://" + localBD + ":3306/rouff";
            conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("conexão OK!");
        }catch (SQLException erro) {
            throw new RuntimeException("Ocorreu um problema na conexão com o BD", erro);
        }
            return conn;
    }
    
}

