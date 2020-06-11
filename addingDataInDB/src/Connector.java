
import java.sql.*;


public class Connector {
    public static Connection connect() throws SQLException{
         try{
             Class.forName("org.sqlite.JDBC");
             Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\USER\\Desktop\\DB\\Students.db");
             return conn;
         } catch (Exception e) {
            return null;
        }
    }
}
