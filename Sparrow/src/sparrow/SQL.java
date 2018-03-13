

package sparrow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL {
        public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //OR:
            //Driver Driver = new com.mysql.jdbc.Driver();
            //DriverManager.registerDriver(driver);
            
            String dbUrl = "jdbc:mysql://localhost/survivors";
            connection = DriverManager.getConnection(dbUrl, "root", "");
            
            System.out.println("Database connection established");
            
            Statement statement=connection.createStatement();
            
            ResultSet rs= statement.executeQuery("SELEC * From tribes");
            while(rs.next()) {
                System.out.println(rs.getInt("id")+"- "+rs.getString("name"));
            
            }
            connection.close();
        } catch (InstantiationException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();    
        }
     
        }
}
