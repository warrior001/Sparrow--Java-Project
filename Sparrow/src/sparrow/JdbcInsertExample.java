

package sparrow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class JdbcInsertExample {
   public static void main(String args[]){
       Connection connection=null;
       try{
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           String dbUrl="djbc:mysql://localhost/survivors";
           connection = DriverManager.getConnection(dbUrl, "root", "");
           System.out.println("Database connection established");
           
           Statement statment = connection.createStatement();
           
           String tribeName = JOptionPane.showInputDialog("Enter new tribe's name");
           if(tribeName.length()>0){
               String S="INSERT INTO 'Survivors'. 'tribes' ('name') VALUES ('" + tribeName + "')";
               int numOfAffectedRows = statment.executeUpdate(S);
               System.out.println("numOfAffectedRows="+ numOfAffectedRows);
           
           }
       }catch (InstantiationException e) {e.printStackTrace();
       }catch (IllegalAccessException e) {e.printStackTrace();
       }catch (ClassNotFoundException e) {e.printStackTrace();
       }catch(SQLException e)            {e.printStackTrace();
       }finally {
           try {
               connection.close();
           }catch(SQLException e){
               e.printStackTrace();
           }
       }
       
   }
}
