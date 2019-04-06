
package databse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class connectiondb {

    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        //1. load drivers
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Drivers loaded");
      
        
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/tea4g3","root",""); 
            System.out.println("Connection created");
            
        }
        catch(SQLException e)
        {
            System.out.println("error in connection creation");
            return;
        }
        try
        {
             stmt=con.createStatement(); 
            System.out.println("statement created:");
        }
        catch(SQLException e)
        {
            System.out.println("Statement creation failed");
        }
       try
        {
            rs=stmt.executeQuery("select *from student");  
            
            while(rs.next())
                    {
                       System.out.println("name="+rs.getString(1)+"\trollno="+rs.getInt(2));
                       
                    }
                        System.out.println("query is excuted");
        }
        catch(SQLException e)
        {
            System.out.println("query execution failed");
        } 
 try {
				rs.close();
				 con.close();
				 stmt.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
    }
}




