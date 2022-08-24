
package Project;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider {

    public static Connection getcon(){
        try{
          Class.forName("oracle.jdbc.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
          if (con != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
          return con;
          
        }
         
        catch(Exception e)
        {
            return null;
        }   
        
    }

    
}

