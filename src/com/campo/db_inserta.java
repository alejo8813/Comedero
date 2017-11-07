package com.campo;
import java.sql.*;

public class db_inserta
{
       static String bd = "comedero";
       static String login = "root";
       static String password = "";
       static String url = "jdbc:mysql://localhost/"+bd;

       public static void main(String[] args) throws Exception
          {

       }

       void insertar(String nombre, int peso){
           Connection conn = null;
                try {
                     Class.forName("com.mysql.jdbc.Driver");
                      conn = DriverManager.getConnection(url,login,password);
                if (conn != null)
                    {
                       int rows_updated = 0;
                       PreparedStatement stmt1 = conn.prepareStatement("INSERT INTO animales (nombre, peso) "
                       + "VALUES  (?,?)");


                      stmt1.setString(1,nombre);
                      stmt1.setInt(2,peso);
                      
                      

                      rows_updated = stmt1.executeUpdate();

                    }
                    }
                catch(SQLException ex) {
                     System.out.println(ex);
                }
                catch(ClassNotFoundException ex) {
                System.out.println(ex);
                }
       }
}
