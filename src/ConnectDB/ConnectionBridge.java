package ConnectDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ResourceBundle;

/**
 * Date    : 10/10/2020
 * Purpose : Handles database connection operations.
 */
public class ConnectionBridge {
    
    private static Connection con = null;
    
    public static Connection getConnection(){
        try {
            if(con == null) {
                ResourceBundle rb = ResourceBundle.getBundle("ConnectDB.jdbc");
                String host = rb.getString("host");
                String usr = rb.getString("usr");
                String pwd = rb.getString("pwd");
                String driver = rb.getString("driver");
                
                Class.forName(driver);               
                con = DriverManager.getConnection(host, usr, pwd);
            }
        }
        catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Error : " + e.getMessage());
            System.out.println(e.getMessage());
        }
        return con;
    }
}
