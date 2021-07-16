/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Rodrigo
 */
public class MetodoConection {
    
    public String db = "ods_db";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "1234";


   public Connection Conectar(){

       Connection link = null;
            String Nombre = "Rodrigo";
          String Apellido = "Rodrigow";
       try{

           Class.forName("org.gjt.mm.mysql.Driver");

          link = DriverManager.getConnection(this.url, this.user, this.pass);
         
                  
//          Statement comando= link.createStatement();
//          link.executeUpdate("insert into datos_personas(Apellido,Nombre) values ('"Ap.getText()+"',"+tf2.getText()+")");

       }catch(ClassNotFoundException | SQLException ex){

           JOptionPane.showMessageDialog(null, ex);

       }


       return link;

   }
}
