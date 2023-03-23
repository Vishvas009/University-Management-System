//mysql connection to java 
//1-Register the Driver Class
//2-Creating Connecton String
//3-Creating Statement
//4-Executing MySQL Queries
//5-Closing the Connection
package university.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem","root","VishuDipu@2812");
            s = c.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
