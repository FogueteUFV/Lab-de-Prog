
package Conection;
import javax.swing.JOptionPane;
import java.sql.*;

public class Conec {
    public static Connection Conectar() throws ClassNotFoundException{
        try{
        Class.forName("org.postgres.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Wattan","postgres" ,"postgres");
        JOptionPane.showMessageDialog(null, "Conectado");
        return con;
        }
        
        catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        }
        return null;
    }
    
}
