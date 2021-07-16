package Metodos;
import com.sun.istack.internal.Pool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MetodosBD {
MetodoPool metodospool = new MetodoPool(){};
DefaultTableModel ModeloTabla;
public void Buscar(String valor, String filtro, JTable tblBuscar){

String [] columnas={"id_usuarios","DNI","Apellido","Nombre","Fecha_Nac","Telefono","Celular","Email","Religion","Nacionalidad","Funcion","Area","Zona","Distrito","Nombre_Grupo","Sexo"};



String [] registros=new String[16];
ModeloTabla=new DefaultTableModel(null,columnas);
String SSQL;
Connection conect = null;
if(filtro.equals("id_usuarios")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE id_usuarios LIKE '%"+valor+"%'";
}else if(filtro.equals("DNI")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE DNI LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Apellido")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Apellido LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Nombre")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Nombre LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Fecha_Nac")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Fecha_Nac LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Telefono")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Telefono LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Celular")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Celular LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Email")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Email LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Religion")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Religion LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Nacionalidad")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Nacionalidad LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Funcion")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Funcion LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Area")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Area LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Nombre_Grupo")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Nombre_Grupo LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Distrito")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Distrito LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Zona")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Zona LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Sexo")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Sexo LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else{
SSQL= "SELECT * From datos_personas";// esto te deja ver toda la tabla
}
try {
conect = metodospool.dataSource.getConnection();
PreparedStatement st = conect.prepareStatement(SSQL);
ResultSet rs = st.executeQuery();
while (rs.next()){
registros[0]=rs.getString("id_usuarios");
registros[1]=rs.getString("DNI");
registros[2]=rs.getString("Apellido");
registros[3]=rs.getString("Nombre");
registros[4]=rs.getString("Fecha_Nac");
registros[5]=rs.getString("Telefono");
registros[6]=rs.getString("Celular");
registros[7]=rs.getString("Email");
registros[8]=rs.getString("Religion");
registros[9]=rs.getString("Nacionalidad");
registros[10]=rs.getString("Funcion");
registros[11]=rs.getString("Area");
registros[12]=rs.getString("Zona");
registros[13]=rs.getString("Distrito");
registros[14]=rs.getString("Nombre_Grupo");
registros[15]=rs.getString("Sexo");

ModeloTabla.addRow(registros);

}
tblBuscar.setModel(ModeloTabla);
} catch (SQLException e) {
JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);

}finally{
if(conect!=null){
try {
conect.close();
} catch (SQLException ex) {
JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);
}
}
}
}


public void buscarMisCursos(String valor, String filtro, JTable tblBuscar)
{
 
String [] columnas={"id_usuarios","DNI","Area","El_rol_del_Educador_Scout","Conociendo_el_movimiento_Scout","Las_obligaciones_Institucionales","El_Educador_y_su_Fe_1","Supervisión_(Supervisado)","Educación_en_la_Fe","Planificando_el_Programa_1",	"Animando_el_programa_1","La_gestión_institucional","Supervisión_2_(Supervisor)","Promoción_comunitaria_y_alianzas_estratégicas","El_Educador_y_su_Fe_2","Planificando_el_Programa_2","Animando_el_programa_2","Planificación_y_conducción_de_actividades_al_aire_libre_jovenes","Herramientas_para_la_Gestión","Administración_general","Planificación_y_conducción_de_actividades_al_aire_libre_Gestion","Desarrollo_de_habilidades_de_liderazgo","Planificación","El_Educador_y_su_Fe_3","Recursos_Educativos","La_gestión_de_SAAC","Captación_en_SAAC"};

String [] registros=new String[27];

ModeloTabla=new DefaultTableModel(null,columnas);
String SSQL = null;
Connection conect = null;
if(filtro.equals("DNI")){
SSQL= "SELECT *"
       + " FROM estatus_nuevo_sistema WHERE DNI LIKE '%"+valor+"%'";
}else if(filtro.equals("Area")){
SSQL= "SELECT *"
        
+ "FROM estatus_nuevo_sistema WHERE Area LIKE '%"+valor+"%'"; 
}


try {
conect = metodospool.dataSource.getConnection();
PreparedStatement st = conect.prepareStatement(SSQL);
ResultSet rs = st.executeQuery();
while (rs.next()){
registros[0]=rs.getString("id_usuarios");
registros[1]=rs.getString("DNI");
registros[2]=rs.getString("Area");
registros[3]=rs.getString("El_rol_del_Educador_Scout");
registros[4]=rs.getString("Conociendo_el_movimiento_Scout");
registros[5]=rs.getString("Las_obligaciones_Institucionales");
registros[6]=rs.getString("El_Educador_y_su_Fe_1");
registros[7]=rs.getString("Supervisión_(Supervisado)");
registros[8]=rs.getString("Educación_en_la_Fe");
registros[9]=rs.getString("Planificando_el_Programa_1");
registros[10]=rs.getString("Animando_el_programa_1");
registros[11]=rs.getString("La_gestión_institucional");
registros[12]=rs.getString("Supervisión_2_(Supervisor)");
registros[13]=rs.getString("Promoción_comunitaria_y_alianzas_estratégicas");
registros[14]=rs.getString("El_Educador_y_su_Fe_2");
registros[15]=rs.getString("Planificando_el_Programa_2");
registros[16]=rs.getString("Animando_el_programa_2");
registros[17]=rs.getString("Planificación_y_conducción_de_actividades_al_aire_libre_jovenes");
registros[18]=rs.getString("Herramientas_para_la_Gestión");
registros[19]=rs.getString("Administración_general");
registros[20]=rs.getString("Planificación_y_conducción_de_actividades_al_aire_libre_Gestion");
registros[21]=rs.getString("Desarrollo_de_habilidades_de_liderazgo");
registros[22]=rs.getString("Planificación");
registros[23]=rs.getString("El_Educador_y_su_Fe_3");
registros[24]=rs.getString("Recursos_Educativos");
registros[25]=rs.getString("La_gestión_de_SAAC");
registros[26]=rs.getString("Captación_en_SAAC");


ModeloTabla.addRow(registros);

}
tblBuscar.setModel(ModeloTabla);
} catch (SQLException e) {
JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);

}
finally{
if(conect!=null){
try {
conect.close();
} catch (SQLException ex) {
JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);
}
}
}

}


 
/*public void buscarMisCursos(String valor, String filtro, JTable tblBuscar){

String [] columnas={"id_usuarios","DNI","Apellido","Nombre","Fecha_Nac","Telefono","Celular","Email","Religion","Nacionalidad","Funcion","Area","Zona","Distrito","Nombre_Grupo","Sexo"};



String [] registros=new String[16];
ModeloTabla=new DefaultTableModel(null,columnas);
String SSQL;
Connection conect = null;
if(filtro.equals("id_usuarios")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM estatus_nuevo_sistema WHERE id_usuarios LIKE '%"+valor+"%'";
}else if(filtro.equals("DNI")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE DNI LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Apellido")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Apellido LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Nombre")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Nombre LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Fecha_Nac")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Fecha_Nac LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Telefono")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Telefono LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Celular")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Celular LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Email")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Email LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Religion")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Religion LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Nacionalidad")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Nacionalidad LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Funcion")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Funcion LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Area")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Area LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Nombre_Grupo")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Nombre_Grupo LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Distrito")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Distrito LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Zona")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Zona LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else if(filtro.equals("Sexo")){
SSQL= "SELECT id_usuarios, DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo "
+ "FROM datos_personas WHERE Sexo LIKE '%"+valor+"%'"; // esto te filtra la busqueda con el valor que le des EJ Email (tiene que coincidir los campos con la BD)
}
else{
SSQL= "SELECT * From datos_personas";// esto te deja ver toda la tabla
}
try {
conect = metodospool.dataSource.getConnection();
PreparedStatement st = conect.prepareStatement(SSQL);
ResultSet rs = st.executeQuery();
while (rs.next()){
registros[0]=rs.getString("id_usuarios");
registros[1]=rs.getString("DNI");
registros[2]=rs.getString("Apellido");
registros[3]=rs.getString("Nombre");
registros[4]=rs.getString("Fecha_Nac");
registros[5]=rs.getString("Telefono");
registros[6]=rs.getString("Celular");
registros[7]=rs.getString("Email");
registros[8]=rs.getString("Religion");
registros[9]=rs.getString("Nacionalidad");
registros[10]=rs.getString("Funcion");
registros[11]=rs.getString("Area");
registros[12]=rs.getString("Zona");
registros[13]=rs.getString("Distrito");
registros[14]=rs.getString("Nombre_Grupo");
registros[15]=rs.getString("Sexo");

ModeloTabla.addRow(registros);

}
tblBuscar.setModel(ModeloTabla);
} catch (SQLException e) {
JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);

}finally{
if(conect!=null){
try {
conect.close();
} catch (SQLException ex) {
JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);
}
}
}
}*/

public void actualizar(String DNI ,String Apellido ,String Nombre ,String Fecha_Nac ,String Telefono ,String Celular ,String Email ,String Religion ,String Nacionalidad ,String Funcion ,String Area ,String Zona ,String Distrito ,String Nombre_Grupo ,String Sexo,String id_usuarios){
       try {            
           Connection conect = null;
           conect = metodospool.dataSource.getConnection(); 
           PreparedStatement pstm = metodospool.dataSource.getConnection().prepareStatement
        
        ("update datos_personas set  DNI= ? ,Apellido= ? ,Nombre= ? ,Fecha_Nac= ? ,Telefono= ? ,Celular= ? ,Email= ? ,Religion= ? ,Nacionalidad= ? ,Funcion= ? ,Area= ? ,Zona= ? ,Distrito= ? ,Nombre_Grupo= ?,Sexo= ? , where id_usuarios = '"+id_usuarios+"'");          
           
            pstm.setString(1, DNI);                   
            pstm.setString(2, Apellido);
            pstm.setString(3, Nombre);
            pstm.setString(4, Fecha_Nac);
            pstm.setString(5, Telefono);
            pstm.setString(6, Celular);
            pstm.setString(7, Email);
            pstm.setString(8, Religion);
            pstm.setString(9, Nacionalidad);
            pstm.setString(10, Funcion);
            pstm.setString(11, Area);
            pstm.setString(12, Zona);
            pstm.setString(13, Distrito);
            pstm.setString(14, Nombre_Grupo);
            pstm.setString(15, Sexo);
            //pstm.setString(16, String.valueOf(id_usuarios));
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }




public void BuscarCalendario(String filtro, JTable tblBuscarCalendario){

String [] columnas={"EXPERIENCIA_DE_FORMACION","FECHA","Lugar","Costo","Obs"};


String [] registros=new String[5];
ModeloTabla=new DefaultTableModel(null,columnas);
String SSQL;
Connection conect = null;
   
if(filtro.equals("ROL_DEL_EDUCADOR_SCOUT")){
   
SSQL= "SELECT * FROM calen_exp WHERE EXPERIENCIA_DE_FORMACION like '%"+filtro+"%'";
    
}else if(filtro.equals("TALLERES"))
{
SSQL= "SELECT  FROM calen_exp WHERE TALLERES like '%"+filtro+"%'";}
else if(filtro.equals("ANIMANDO_EL_PROGRAMA_1"))
{
SSQL= "SELECT ANIMANDO_EL_PROGRAMA_1 FROM calen_exp WHERE ROL_DEL_EDUCADOR_SCOUT like '%"+filtro+"%'";}
else if(filtro.equals("EDUCACION_EN_LA_FE"))
{
SSQL= "SELECT EDUCACION_EN_LA_FE FROM calen_exp WHERE ROL_DEL_EDUCADOR_SCOUT like '%"+filtro+"%'";}
else if(filtro.equals("CONOCIENDO_EL_MOVIMIENTO_SCOUT"))
{
SSQL= "SELECT CONOCIENDO_EL_MOVIMIENTO_SCOUT FROM calen_exp WHERE ROL_DEL_EDUCADOR_SCOUT like '%"+filtro+"%'";}

else if(filtro.equals("EL_EDUCADOR_Y_SU_FE"))
{
SSQL= "SELECT EL_EDUCADOR_Y_SU_FE FROM calen_exp WHERE ROL_DEL_EDUCADOR_SCOUT like '%"+filtro+"%'";}

else if(filtro.equals("ENCUENTRO_NACIONAL_DE_FORMADORES"))
{
SSQL= "SELECT ENCUENTRO_NACIONAL_DE_FORMADORES FROM calen_exp WHERE ROL_DEL_EDUCADOR_SCOUT like '%"+filtro+"%'";}

else if(filtro.equals("LA_GESTION_INSTITUCIONAL"))
{
SSQL= "SELECT LA_GESTION_INSTITUCIONAL FROM calen_exp WHERE ROL_DEL_EDUCADOR_SCOUT like '%"+filtro+"%'";}

else if(filtro.equals("LAS_OBLIGACIONES_INSTITUCIONALES"))
{
SSQL= "SELECT LAS_OBLIGACIONES_INSTITUCIONALES FROM calen_exp WHERE ROL_DEL_EDUCADOR_SCOUT like '%"+filtro+"%'";}

else if(filtro.equals("PLANIFICANDO_EL_PROGRAMA_1"))
{
SSQL= "SELECT PLANIFICANDO_EL_PROGRAMA_1 FROM calen_exp WHERE ROL_DEL_EDUCADOR_SCOUT like '%"+filtro+"%'";}

else if(filtro.equals("SUPERVISION_(SUPERVISADO)"))
{
SSQL= "SELECT SUPERVISION_(SUPERVISADO) FROM calen_exp WHERE ROL_DEL_EDUCADOR_SCOUT like '%"+filtro+"%'";}


else{
SSQL= "SELECT * From calen_exp";// esto te deja ver toda la tabla
}
try {
conect = metodospool.dataSource.getConnection();
PreparedStatement st = conect.prepareStatement(SSQL);
ResultSet rs = st.executeQuery();
while (rs.next()){
registros[0]=rs.getString("EXPERIENCIA_DE_FORMACION");
registros[1]=rs.getString("FECHA");
registros[2]=rs.getString("Lugar");
registros[3]=rs.getString("Costo");
registros[4]=rs.getString("Obs");
/*registros[5]=rs.getString("Telefono");
registros[6]=rs.getString("Celular");
registros[7]=rs.getString("Email");
registros[8]=rs.getString("Religion");
registros[9]=rs.getString("Nacionalidad");
registros[10]=rs.getString("Funcion");
registros[11]=rs.getString("Area");
registros[12]=rs.getString("Zona");
registros[13]=rs.getString("Distrito");
registros[14]=rs.getString("Nombre_Grupo");
registros[15]=rs.getString("Sexo");*/

ModeloTabla.addRow(registros);

}
tblBuscarCalendario.setModel(ModeloTabla);
} catch (SQLException e) {
JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);

}finally{
if(conect!=null){
try {
conect.close();
} catch (SQLException ex) {
JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);
}
}
}
}


}
