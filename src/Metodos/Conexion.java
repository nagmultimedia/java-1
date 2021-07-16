/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author hp
 */
public class Conexion {
    
    public static Connection obtenerConexion() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        
        //Establece el nombre del driver a utilizar
        String driver="com.mysql.jdbc.Driver";
        
        //Establece el nombre de la conexion a utilizar
        String conexion="jdbc:mysql://localhost/ods_db";
        
        //Establece el nombre del usuario
        String usuario="root";
        //Establece el nombre del password
        String clave="1234";
        
        ////Establece el driver para la conexion
        Class.forName(driver).newInstance();
        
        //Retorna la conexion
        return DriverManager.getConnection(conexion, usuario, clave);
    }
    
}
