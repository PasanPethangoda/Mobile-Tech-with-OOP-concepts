package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author ASUS
 */
public class DbConnection {
    
   public static Connection connect()
    {
     Connection conn = null;
     try
    {
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/digitalMobile");
         
                  
    }catch (Exception e){
        System.out.println(e);
    }
     return conn;
    }
}

    

    

