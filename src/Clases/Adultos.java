package Clases;

import javax.swing.table.DefaultTableModel;


import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author hp
 */
public class Adultos  extends javax.swing.JInternalFrame {
    
    private int idAdulto;
    private String dni;
    private String apellido;
    private String nombre;
    private String fecNac;
    private String telFijo;
    private String cel;
    private String correo;
    private String religion;
    private String nacionalidad;
    private String funcion;
    private String area;
    private String zona;
    private String distrito;
    private String grupo;
    private String sexo;

    public Adultos() {
    }

    public Adultos(String dni, String apellido, String nombre, String fecNac, String telFijo, String cel, String correo, String religion, String nacionalidad, String funcion, String area, String zona, String distrito, String grupo, String sexo) {
        
         setDni(dni);
         setApellido(apellido);
         setNombre(nombre);
         setFecNac(fecNac);
         setTelFijo(telFijo);
         setCel(cel);
         setCorreo(correo);
         setNacionalidad(nacionalidad);
         setReligion(religion);
         setFuncion(funcion);
         setArea(area);
         setZona(zona);
         setDistrito(distrito);
         setGrupo(grupo);
         setSexo(sexo);
            
        this.apellido = apellido;
        this.nombre = nombre;
        this.fecNac = fecNac;
        this.telFijo = telFijo;
        this.cel = cel;
        this.correo = correo;
        this.religion = religion;
        this.nacionalidad = nacionalidad;
        this.funcion = funcion;
        this.area = area;
        this.zona = zona;
        this.distrito = distrito;
        this.grupo = grupo;
        this.sexo = sexo;
    }

    public int getIdAdulto() {
        return idAdulto;
    }

    public void setIdAdulto(int idAdulto) {
        this.idAdulto = idAdulto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecNac() {
        return fecNac;
    }

    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
    }

    public String getTelFijo() {
        return telFijo;
    }

    public void setTelFijo(String telFijo) {
        this.telFijo = telFijo;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

//metodos
     
    //obtener todos
    public static ArrayList obtenerTodos(Connection c) throws Exception
    {
        // Arma la consulta y la ejecuta
        String sql = "SELECT * FROM datos_personas";
        Statement consulta = c.createStatement();
        ResultSet rs = consulta.executeQuery(sql);
        
        // Informa la insercion a realizar
        System.out.println(">>SQL: " + sql);
        
        // Construye la coleccion de autos
        ArrayList adultos = new ArrayList();
        
        // Muestra los datos
        while( rs.next() )
        {
            // Arma el objeto adulto con los datos de la consulta
            Adultos unAdulto = new Adultos();
            unAdulto.setIdAdulto( rs.getInt("id_usuario") );
            unAdulto.setNombre(rs.getString("Nombre") );
            unAdulto.setApellido(rs.getString("Apellido") );
            unAdulto.setDni(rs.getString("DNI") );
            unAdulto.setFecNac(rs.getString("Fecha_Nac") );
            unAdulto.setTelFijo(rs.getString("Telefono") );
            unAdulto.setCel(rs.getString("Celular") );
            unAdulto.setNacionalidad(rs.getString("Nacionalidad") );
            unAdulto.setReligion(rs.getString("Religion") );
            unAdulto.setSexo(rs.getString("Sexo") );
            unAdulto.setFuncion(rs.getString("Funcion") );
            unAdulto.setArea(rs.getString("Area") );
            unAdulto.setGrupo(rs.getString("Nombre_Grupo") );
            unAdulto.setDistrito(rs.getString("Distrito") );
            unAdulto.setZona(rs.getString("Zona") );
            unAdulto.setCorreo(rs.getString("Email") );
            
            
            
            // Agrega el cliente a la coleccion
            adultos.add(unAdulto);
        }
            
        // Cierra el Statement
        consulta.close(); 
        
        // Retorna la coleccion
        return adultos;
    }
//    //obtener DNI,APELLIDO,NOMBRE
//    public static ArrayList obtenerDAN (Connection c) throws Exception
//    {
//        // Arma la consulta y la ejecuta
//        String sql = "SELECT * FROM datos_personas";
//        Statement consulta = c.createStatement();
//        ResultSet rs = consulta.executeQuery(sql);
//        
//        // Informa la insercion a realizar
//        System.out.println(">>SQL: " + sql);
//        
//        // Construye la coleccion de autos
//        ArrayList adultos = new ArrayList();
//        
//        // Muestra los datos
//        while( rs.next() )
//        {
//            // Arma el objeto adulto con los datos de la consulta
//            Adultos unAdulto = new Adultos();
////            unAdulto.setIdAdulto( rs.getInt("id_usuario") );
//            unAdulto.setNombre(rs.getString("Nombre") );
//            unAdulto.setApellido(rs.getString("Apellido") );
//            unAdulto.setDni(rs.getString("DNI") );
//            unAdulto.setFecNac(rs.getString("Fecha_Nac") );
//            unAdulto.setTelFijo(rs.getString("Telefono") );
//            unAdulto.setCel(rs.getString("Celular") );
//            unAdulto.setNacionalidad(rs.getString("Nacionalidad") );
//            unAdulto.setReligion(rs.getString("Religion") );
//            unAdulto.setSexo(rs.getString("Sexo") );
//            unAdulto.setFuncion(rs.getString("Funcion") );
//            unAdulto.setArea(rs.getString("Area") );
//            unAdulto.setGrupo(rs.getString("Nombre_Grupo") );
//            unAdulto.setDistrito(rs.getString("Distrito") );
//            unAdulto.setZona(rs.getString("Zona") );
//            unAdulto.setCorreo(rs.getString("Email") );
//                              
//            }
//            
//        // Cierra el Statement
//        consulta.close(); 
//        
//        // Retorna la coleccion
//        return adultos;
//    }
//    
//    
    
    
    
    
    
    //metodo obtener segun ID
    public static Adultos obtenerSegunId(Connection c, int id_usuario) {
        Adultos unAdulto = null;
        try {
            Statement consulta = c.createStatement();
            ResultSet rs = consulta.executeQuery("SELECT * FROM datos_personas WHERE id_usuarios = " + id_usuario);

            if(rs.next()){
            // Arma el objeto Adulto con los datos de la consulta
            
            unAdulto = new Adultos();
            unAdulto.setIdAdulto( rs.getInt("id_usuario") );
            unAdulto.setNombre(rs.getString("Nombre") );
            unAdulto.setApellido(rs.getString("Apellido") );
            unAdulto.setDni(rs.getString("DNI") );
            unAdulto.setFecNac(rs.getString("Fecha_Nac") );
            unAdulto.setTelFijo(rs.getString("Telefono") );
            unAdulto.setCel(rs.getString("Celular") );
            unAdulto.setNacionalidad(rs.getString("Nacionalidad") );
            unAdulto.setReligion(rs.getString("Religion") );
            unAdulto.setSexo(rs.getString("Sexo") );
            unAdulto.setFuncion(rs.getString("Funcion") );
            unAdulto.setArea(rs.getString("Area") );
            unAdulto.setGrupo(rs.getString("Nombre_Grupo") );
            unAdulto.setDistrito(rs.getString("Distrito") );
            unAdulto.setZona(rs.getString("Zona") );
            unAdulto.setCorreo(rs.getString("Email") );

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return unAdulto;
    }
    
    
    
    //metodo insertar

    public void insertar (Connection c) throws Exception {

        // Arma la sentencia de inserción 
        String sql ="INSERT INTO datos_personas(DNI, Apellido, Nombre, Fecha_Nac, "
                + "Telefono, Celular, Email, Religion, "
                + "Nacionalidad, Funcion, Area, Zona, Distrito, "
                + "Nombre_Grupo, Sexo) "
        + "VALUES("+this.getDni()+
                ",'"+this.getApellido()+
                "','"+this.getNombre()+
                "','"+this.getFecNac()+
                "','"+this.getTelFijo()+
                "','"+this.getCel()+
                "','"+this.getCorreo()+
                "','"+this.getReligion()+
                "','"+this.getNacionalidad()+
                "','"+this.getFuncion()+
                "','"+this.getArea()+
                "',"+this.getZona()+
                ","+this.getDistrito()+
                ",'"+this.getGrupo()+
                "','"+this.getSexo()+"')";
        
        Statement insercion = c.createStatement();
        
        //Ejecuta la consulta
        insercion.execute(sql);
        
        //Cierra la conexion
        insercion.close();
        
        
      //Informa que la insercion se realiao correctamente
        System.out.println("La insercion se realizo con exito!...");
            
    }
    
    public void actualizar (Connection c) throws Exception {

//        Connection c = Conexion.obtenerConexion();
System.out.println("entrando a actualizar");
        String sql = "UPDATE datos_personas SET "
                + "id_usuarios = '" + this.idAdulto
                
//                 
//                "', edad=" + this.edad + 
//                ", pais='" + this.pais+"'"+
//                 WHERE idcliente = " + this.idcliente;
        
                + "DNI = '"+this.dni+
                "', Apellido='" + this.apellido +
                "', Nombre='" +this.nombre+ 
                "', Fecha_Nac='" +this.fecNac+
                "', Telefono='" +this.telFijo+
                "', Celular='" +this.cel+
                "', Email='" +this.correo+
                "', Religion='" +this.religion+
                "', Nacionalidad='" +this.nacionalidad+
                "', Funcion='" +this.funcion+
                "', Area='" +this.area+
                "', Zona='" +this.zona+
                "', Distrito='" +this.distrito+
                "', Nombre_Grupo='" +this.grupo+
                " WHERE Sexo=" + this.sexo;
             //   " WHERE id_usuarios = " + this.idAdulto;
             
        System.out.println("Ya actualice");
        Statement actualizacion = c.createStatement();
        
        actualizacion.execute(sql);
        
        // Cierra el Statement y la Connection
        actualizacion.close();
        
        
        // Informa que la actualización ha sido realizada con éxito
        System.out.println("La actualización ha sido realizada con éxito...");








// Arma la sentencia de actualización y la ejecuta
//        String sql = "UPDATE clientes SET edad = 100 WHERE nombre = '"
//                +this.getNombre()+"'";
        
//        Statement actualizacion = c.createStatement();
//        
//        actualizacion.execute(sql);
//        
//        // Cierra el Statement y la Connection
//        actualizacion.close();
//        
//        
        // Informa que la actualización ha sido realizada con éxito
        System.out.println("La actualización ha sido realizada con éxito...");
    }
    
    
    
    public void eliminar (Connection c) throws Exception {

        
        // Arma la sentencia de eliminación y la ejecuta
        String sql = "DELETE FROM datos_personas WHERE '"+this.getIdAdulto()+"'";
      
        
        Statement eliminacion = c.createStatement();
        
        eliminacion.execute(sql);
        
        // Cierra el Statement y la Connection
        eliminacion.close();
        
        
        // Informa que la eliminación ha sido realizada con éxito
        System.out.println("La eliminación ha sido realizada con éxito...");
}
    
    public void eliminar (Connection c, JTable tablitaB) throws Exception {

        
        // Arma la sentencia de eliminación y la ejecuta
        String sql = "DELETE FROM datos_personas WHERE '"+tablitaB.getSelectedRows()+"'";
        
        
        Statement eliminacion = c.createStatement();
        
        eliminacion.execute(sql);
        
        // Cierra el Statement y la Connection
        eliminacion.close();
        
        
        // Informa que la eliminación ha sido realizada con éxito
        System.out.println("La eliminación ha sido realizada con éxito...");
}

}
