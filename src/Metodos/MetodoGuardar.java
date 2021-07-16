/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MetodoGuardar {
MetodoPool metodospool = new MetodoPool();
public void Guardar(String DNI, String apellidos, String nombres, String fec_nac, String tel_fijo, String celular, String email, String Religion, String nacionalidad,  String funcion, String area, String zona, String distrito, String nom_grupo, String sexo ){
int resultado = 0;
Connection con = null;
String SSQL = "INSERT INTO datos_personas (nombres, apellidos, DNI, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, 	Zona, Distrito, Nombre_Grupo, Sexo) "
+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?)";
try {
con = metodospool.dataSource.getConnection();
PreparedStatement psql = con.prepareStatement(SSQL);
psql.setString(1, DNI );
psql.setString(2, apellidos);
psql.setString(3, nombres);
psql.setString(4, fec_nac);
psql.setString(5, tel_fijo);
psql.setString(6, celular);
psql.setString(7, email);
psql.setString(8, Religion);
psql.setString(9, nacionalidad);
psql.setString(10, funcion);
psql.setString(11, area);
psql.setString(12, zona);
psql.setString(13, distrito);
psql.setString(14, nom_grupo);
psql.setString(15, sexo);

resultado = psql.executeUpdate();
psql.close();
} catch (SQLException e) {
JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n" + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
}finally{
try {
if(con!=null){
con.close();
}
} catch (SQLException ex) {
JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n" + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
}
}
//return resultado;
}
}