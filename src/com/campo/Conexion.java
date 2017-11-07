package com.campo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	 static String bd = "comedero";
     static String login = "root";
     static String password = "";
     static String url = "jdbc:mysql://localhost/"+bd;


    public static void main(String[] args) {

      //conectar
Connection conn = null;
      try {

        Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(url,login,password);



          System.out.println("Conexión a base de datos "+url+" ... OK");



      } catch (ClassNotFoundException ex) {

          System.out.println("Error cargando el Driver MySQL JDBC ... FAIL");

      } catch (SQLException ex) {

          System.out.println("Imposible realizar conexion con "+url+" ... FAIL");

      }


      //desconectar

      try {

          conn.close();

          System.out.println("Cerrar conexion con "+url+" ... OK");

      } catch (SQLException ex) {
          System.out.println("Imposible cerrar conexion ... FAIL");
          //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex)
      }
  }
}

