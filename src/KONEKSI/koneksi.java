
package KONEKSI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aylwin
 */
public class koneksi {
     public Connection getConnection(){
            Connection con = null;
            try {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swalayan","root","");
            } catch (SQLException ex){
                
            }
            return con;
        }
}
