/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Adultos;
import Metodos.Conexion;
import Metodos.MetodoPool;
import Metodos.MetodosBD;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import com.sun.istack.internal.Pool;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




/**
 *
 * @author Rodrigo
 */
public class frmUsuarios extends javax.swing.JInternalFrame {
    


    /**
     * Creates new form frmUsuarios
     */
    public static boolean abierta=false;
    DefaultTableModel modeloClientes = new DefaultTableModel();
    public frmUsuarios() {
        super("Usuarios", true, true, true, true);
        float escalar = 0.5F; // una ventana al 50% del tamaño de la pantalla
    int ancho = (int)(Toolkit.getDefaultToolkit().getScreenSize(). width*escalar);
    int alto = (int)(Toolkit.getDefaultToolkit().getScreenSize(). height*escalar);
    this.setSize(ancho,alto);
        abierta = true;
        initComponents();
        tblBuscar.setModel(modeloClientes); 
        
        //llenarListaDeClientes();
     btnGuardar.setEnabled(true);// esto hace que se active el boton
        btnNuevo.setEnabled(true);// esto hace que se active el boton
        btnEliminar.setEnabled(true);// esto hace que se cancele la accion del boton osea deshabilita
        btnCancelar.setEnabled(true);// esto hace que se cancele la accion del boton osea deshabilita
        btnActualizarCampos.setEnabled(true);
         
        
    }
/*private void llenarListaDeClientes() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
      //  modeloClientes.removeAllElements();
        Adultos b = null;
        Connection c = Conexion.obtenerConexion();

        try {
//            b.obtenerTodos();
            Iterator it = b.obtenerTodos(c).iterator();
            while (it.hasNext()) {
                modeloClientes.addRow(it.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    */
    
     public void limpiarformulario() 
     {
    
    txtNombre.setText(null);
    txtApellido.setText(null);
    txtFecNac.setText(null);
    txtDni.setText(null);
    txtTelFijo.setText(null);
    txtCel.setText(null);
    cmbPais.setSelectedItem(null);
    cmbReligion.setSelectedItem(null);
    cmbSexo.setSelectedItem(null);
    cmbFuncion.setSelectedItem(null);
    cmbArea.setSelectedItem(null);
    txtGrupo.setText(null);
    txtDistrito.setText(null);
    txtZona.setText(null);
    txtCorreo.setText(null);

 
     }
     
 
 
 public boolean validarformulario() {
     //validar nombre completo
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que completar el Nombre",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            txtNombre.requestFocus();
            return false;
        }
        //validar Apellido completo
        if (txtApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que completar el Apellido",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            txtApellido.requestFocus();
            return false;
        }
        //validar FecNac completo
        if (txtFecNac.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que completar la fecha de nacimiento dd/mm/aaaa",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            txtFecNac.requestFocus();
            return false;
        }
        
         //Validar Dni
        if (txtDni.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que completar el DNI",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            txtDni.requestFocus();
            return false;
        }
          
        //validar celular completo
        if (txtCel.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que completar el Celular",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            txtCel.requestFocus();
            return false;
        }
            //validar Pais completo
        if (cmbPais.getSelectedIndex() ==0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que seleccionar un pais",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            cmbPais.requestFocus();
            return false;
        }
        
         //validar Religion completo
        if (cmbReligion.getSelectedIndex() ==0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que seleccionar una Religion",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            cmbReligion.requestFocus();
            return false;
        }
        
              //validar Sexo completo
        if (cmbSexo.getSelectedIndex() ==0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que seleccionar un Sexo",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            cmbSexo.requestFocus();
            return false;
        } 
        
              //validar Funcion completo
        if (cmbFuncion.getSelectedIndex() ==0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que seleccionar una Funcion",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            cmbFuncion.requestFocus();
            return false;
        } 
        
              //validar Area completo
        if (cmbArea.getSelectedIndex() ==0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que seleccionar un Area",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            cmbArea.requestFocus();
            return false;
        } 
        
               //Validar Grupo
        if (txtGrupo.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que completar el Nombre de Grupo",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            txtGrupo.requestFocus();
            return false;
        }
             //Validar Distrito
        if (txtDistrito.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que completar el Numero de Distrito",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            txtDistrito.requestFocus();
            return false;
        }
        
         //Validar Zona
        if (txtZona.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que completar el Numero de Zona",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            txtZona.requestFocus();
            return false;
        }
        
        
            //Validar Correo
        if (txtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que completar el Correo",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            txtCorreo.requestFocus();
            return false;
        }
                     
      return true;
        
            }
 
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtValorbusqueda = new javax.swing.JTextField();
        btnBuscarfrmBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbFiltro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscar = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        txtZona = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFecNac = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox<>();
        cmbFuncion = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelFijo = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        cmbReligion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtCel = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbArea = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnActualizarCampos = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setBackground(new java.awt.Color(181, 217, 255));
        setClosable(true);
        setForeground(new java.awt.Color(164, 205, 255));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Usuarios");

        btnBuscarfrmBuscar.setText("Buscar");
        btnBuscarfrmBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarfrmBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por");

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id_usuarios", "DNI", "Apellido", "Nombre", "Fecha_Nac", "Telefono", "Celular", "Email", "Religion", "Nacionalidad", "Funcion", "Area", "Zona", "Distrito", "Nombre_Grupo", "Sexo", " ", " " }));
        cmbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltroActionPerformed(evt);
            }
        });

        tblBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_usuarios", "DNI", "Apellido", "Nombre", "Fecha_Nac", "Telefono", "Celular", "Email", "Religion", "Nacionalidad", "Funcion", "Area", "Zona", "Distrito", "Nombre_Grupo", "Sexo"
            }
        ));
        tblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuscar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtValorbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnBuscarfrmBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarfrmBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel13.setText("Datos Personales");

        jLabel20.setText("Religion");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Masculino", "Femenino", "OTRO" }));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });

        txtZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZonaActionPerformed(evt);
            }
        });

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        jLabel21.setText("Fecha de Nacimiento");

        jLabel8.setText("Celular");

        txtFecNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFecNacActionPerformed(evt);
            }
        });

        jLabel11.setText("DNI");

        txtGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel22.setText("Funcion");

        jLabel23.setText("Area");

        jLabel16.setText("Nacionalidad");

        cmbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Argentina", "Brasil", "Chile", "Uruguay", "Paraguay", "Venezuela", "Colombia", "Otro", " " }));

        cmbFuncion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Director", "Jefe", "Sub Jefe", "Ayudante", "Colaborador" }));
        cmbFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFuncionActionPerformed(evt);
            }
        });

        jLabel25.setText("Distrito");

        jLabel24.setText("Grupo");

        jLabel12.setText("Sexo");

        txtDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistritoActionPerformed(evt);
            }
        });

        txtTelFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelFijoActionPerformed(evt);
            }
        });

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        cmbReligion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Catolica", "Judio", "Evangelico", "Budista", "Santos de los ultimos dias", "Musulmanes", "Iglesia Ortodoxa de Antioquía" }));
        cmbReligion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbReligionActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellidos");

        txtCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelActionPerformed(evt);
            }
        });

        jLabel15.setText("Zona");

        jLabel10.setText("Correo");

        jLabel14.setText("Tel Fijo");

        jLabel2.setText("Nombres");

        cmbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Castores", "Lobatos", "Caminantes", "Rover", "Colaborador", "Grupo", "Distrito", "Zona" }));
        cmbArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12)
                    .addComponent(jLabel2)
                    .addComponent(jLabel23)
                    .addComponent(jLabel10)
                    .addComponent(jLabel16))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelFijo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbPais, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbArea, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDistrito, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecNac)
                            .addComponent(txtApellido)
                            .addComponent(txtCel)
                            .addComponent(cmbReligion, 0, 212, Short.MAX_VALUE)
                            .addComponent(cmbFuncion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGrupo)
                            .addComponent(txtZona))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtTelFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel11)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel14)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cmbReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnActualizarCampos.setText("Actualizar");
        btnActualizarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCamposActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addGap(35, 35, 35)
                .addComponent(btnEliminar)
                .addGap(35, 35, 35)
                .addComponent(btnGuardar)
                .addGap(35, 35, 35)
                .addComponent(btnActualizarCampos)
                .addGap(35, 35, 35)
                .addComponent(btnCancelar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnActualizarCampos))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(207, 207, 207)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAreaActionPerformed

    private void txtCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelActionPerformed

    private void cmbReligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbReligionActionPerformed

    }//GEN-LAST:event_cmbReligionActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
tblBuscar.show(true);    

//        if (!validarformulario()  ) {
//            return;
//        }
//        JOptionPane.showMessageDialog(
//                    this,
//                    "EL CLIENTE HA SIDO VALIDADO",
//                    "GUARDAR",
//                    JOptionPane.INFORMATION_MESSAGE);
// 
//        limpiarformulario();
//        btnFotoPersonal.setEnabled(false);
//        btnCurriculum.setEnabled(false);
try {
            //        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
//        try {
            // Obtiene la conexión
            Connection c =Conexion.obtenerConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
            // Variables
            boolean esNuevo = true;
            // Valida el formulario
            boolean validacionOk = validarformulario();
            
            // Si el formulario es valido...modifica o carga uno nuevo
            if(validacionOk){
                Adultos unAdulto = new Adultos();
                
//               //Si hay un item seleccionado lo obtiene
//            if( tblBuscar.getSelectedRow()!= -1 ){
//                    //unAdulto = (Adultos)tblBuscar.getSelectedRow();
//                 esNuevo = false;
//             }
                
                // Agrega el Adulto a la lista de Adultos
                 unAdulto.setDni(txtDni.getText());
                unAdulto.setApellido(txtApellido.getText());
                unAdulto.setNombre(txtNombre.getText());
                unAdulto.setFecNac(txtFecNac.getText());
                unAdulto.setTelFijo(txtTelFijo.getText());
                unAdulto.setCel(txtCel.getText());
                unAdulto.setCorreo(txtCorreo.getText());
                unAdulto.setNacionalidad(cmbPais.getItemAt(WIDTH));
                unAdulto.setReligion(cmbReligion.getItemAt(WIDTH));
                unAdulto.setSexo(cmbSexo.getItemAt(WIDTH));
                unAdulto.setFuncion(cmbFuncion.getItemAt(WIDTH));
                unAdulto.setArea(cmbArea.getItemAt(WIDTH));
                unAdulto.setGrupo(txtGrupo.getText());
                unAdulto.setDistrito(txtDistrito.getText());
                unAdulto.setZona(txtZona.getText());
                
                 // Declara una variable del tipo Connection.
            Connection conn = null;
            try {
                // Obtiene una conexión a la DB.
                conn = Conexion.obtenerConexion();

                // Si el Adulto es nuevo, lo inserta en la DB y se recaga el listado.
                if (esNuevo) {
                    unAdulto.insertar(conn);
                    
//                     unCliente = (Cliente)modeloClientes.getElementAt( listClientes.getSelectedIndex());
                } // Si el auto no es nuevo, lo modifica en la DB.
                else {
                    unAdulto.actualizar(conn);
                }
            } catch (Exception e) {
                // Informa que la operación no pudo ser realizada.
                JOptionPane.showMessageDialog(this,
                        "La operacion no pudo ser realizada: " + e.getMessage(),
                        "Operacion",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            } finally {
                try {
                    conn.close();
                } catch (Exception e) {
                    System.out.println("No se ha podido cerrar la conexión a la base de datos.");
                    System.out.println(e.getMessage());
                }
            }

            limpiarformulario();
            btnGuardar.setEnabled(true);
            btnEliminar.setEnabled(false);
            btnNuevo.setEnabled(true);
            btnNuevo.requestFocus();
           

            JOptionPane.showMessageDialog(this, "El cliente ha sido guardado!", "Guardar", JOptionPane.INFORMATION_MESSAGE);
        }
                
        btnGuardar.setEnabled(true);// esto hace que se active el boton
        btnNuevo.setEnabled(true);// esto hace que se active el boton
        btnEliminar.setEnabled(true);// esto hace que se cancele la accion del boton osea deshabilita
        btnCancelar.setEnabled(true);// esto hace que se cancele la accion del boton osea deshabilita
               
             
//MetodoGuardar metodosbd = new MetodoGuardar();
//int exito = 0;
//exito = metodosbd.Guardar(txtNombre.getText(), txtApellido.getText(), txtCorreo.getText(), txtCel.getText(), ){
//JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente", "Éxito en la operación", JOptionPane.INFORMATION_MESSAGE);
//}else{
//JOptionPane.showMessageDialog(null, "Los datos no se pudieron guardar\n"
//+ "Inténtelo nuevamente", "Error en la operación", JOptionPane.ERROR_MESSAGE);
//}    


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFuncionActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
tblBuscar.show(false);    
try {
    
                
                int fila = tblBuscar.getSelectedRow();
               
                 Connection conn =Conexion.obtenerConexion();
                 Statement sent = conn.createStatement();
                 String sql ="delete from datos_personas where id_usuarios like "+ tblBuscar.getValueAt(fila, 0); 

                //sent = conn.createStatement();
                int n =sent.executeUpdate(sql);
          
                
                if (n>0) 
                    
                    
                {
                    JOptionPane.showMessageDialog(null, "Datos Eliminados");
                 
                limpiarformulario();
                }else   {
                  
                limpiarformulario();
                }
                    }
                catch (Exception e)
                {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
                }

        btnGuardar.setEnabled(true);// esto hace que se active el boton
        btnNuevo.setEnabled(true);// esto hace que se active el boton
        btnEliminar.setEnabled(true);// esto hace que se cancele la accion del boton osea deshabilita
        btnCancelar.setEnabled(true);// esto hace que se cancele la accion del boton osea deshabilita
           btnActualizarCampos.setEnabled(false);
             
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarformulario();//
        tblBuscar.show(false);
        btnGuardar.setEnabled(true);// esto hace que se active el boton
        btnEliminar.setEnabled(false);// esto hace que se cancele la accion del boton osea deshabilita
        btnCancelar.setEnabled(true);// esto hace que se cancele la accion del boton osea deshabilita
        btnActualizarCampos.setEnabled(false);
        
        // no hace falta aclarar el boton CERRAR
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtFecNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFecNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFecNacActionPerformed

    private void txtTelFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelFijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelFijoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSexoActionPerformed

    private void txtZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZonaActionPerformed

    private void txtGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupoActionPerformed

    private void txtDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistritoActionPerformed

    private void btnBuscarfrmBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarfrmBuscarActionPerformed
tblBuscar.show(true);    

        MetodosBD metodosbd = new MetodosBD();
        //metodosbd.Buscar(txtValorbusqueda.getText(), cmbFiltro.getSelectedItem().toString(), tblBuscar);
        metodosbd.Buscar(txtValorbusqueda.getText(), cmbFiltro.getSelectedItem().toString(), tblBuscar);
        
        btnGuardar.setEnabled(false);// esto hace que se active el boton
        btnNuevo.setEnabled(true);// esto hace que se active el boton
        btnEliminar.setEnabled(true);// esto hace que se cancele la accion del boton osea deshabilita
        btnCancelar.setEnabled(true);// esto hace que se cancele la accion del boton osea deshabilita
        btnActualizarCampos.setEnabled(true);
         
    }//GEN-LAST:event_btnBuscarfrmBuscarActionPerformed

    private void cmbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFiltroActionPerformed

    private void tblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscarMouseClicked
   
int filaseleccionada;

     try{
     
         filaseleccionada= tblBuscar.getSelectedRow();
         
         if (filaseleccionada==-1){
         
             JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");

         }else{

             DefaultTableModel modelotabla=(DefaultTableModel) tblBuscar.getModel();
              
             String DNI=(String)modelotabla.getValueAt(filaseleccionada, 1);
             String Apellido=(String)modelotabla.getValueAt(filaseleccionada, 2);
             String Nombre=(String) modelotabla.getValueAt(filaseleccionada, 3);
             String FecNac=(String)modelotabla.getValueAt(filaseleccionada, 4);
             String TelFijo=(String)modelotabla.getValueAt(filaseleccionada, 5);
             String Cel=(String)modelotabla.getValueAt(filaseleccionada, 6);
             String Correo=(String)modelotabla.getValueAt(filaseleccionada, 7);
             String Religion=(String)modelotabla.getValueAt(filaseleccionada, 8);
             String Pais=(String)modelotabla.getValueAt(filaseleccionada, 9);
             String Funcion=(String)modelotabla.getValueAt(filaseleccionada, 10);
             String Area=(String)modelotabla.getValueAt(filaseleccionada, 11);
             String Zona=(String)modelotabla.getValueAt(filaseleccionada, 12);
             String Distrito=(String)modelotabla.getValueAt(filaseleccionada, 13);
             String Grupo=(String)modelotabla.getValueAt(filaseleccionada, 14);
             String Sexo=(String)modelotabla.getValueAt(filaseleccionada, 15);
             
             
             
             
            

       // txtId.setText(id_usuarios);
        txtApellido.setText(Apellido);
        txtNombre.setText(Nombre);
        txtDni.setText(DNI);
        txtFecNac.setText(FecNac);
        txtTelFijo.setText(TelFijo);
        txtCel.setText(Cel);
        cmbPais.setSelectedItem(Pais);
        cmbArea.setSelectedItem(Area);
        cmbFuncion.setSelectedItem(Funcion);
        cmbReligion.setSelectedItem(Religion);
        cmbSexo.setSelectedItem(Sexo);
        txtGrupo.setText(Grupo);
        txtDistrito.setText(Distrito);
        txtZona.setText(Zona);
        txtCorreo.setText(Correo);

       }

       }catch (HeadlessException ex){

             JOptionPane.showMessageDialog(null, "Error: "+ex+"\nInténtelo nuevamente", " .::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);

       }         
        
    }//GEN-LAST:event_tblBuscarMouseClicked

    private void btnActualizarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCamposActionPerformed
    tblBuscar.show(false);    
        
        btnGuardar.setEnabled(false);// esto hace que se active el boton
        btnNuevo.setEnabled(true);// esto hace que se active el boton
        btnEliminar.setEnabled(true);// esto hace que se cancele la accion del boton osea deshabilita
        btnCancelar.setEnabled(true);// esto hace que se cancele la accion del boton osea deshabilita
                 

//MetodoPool SQL= new MetodoPool();
         Conexion mysql = new Conexion();
        String sSQL = "";
        int fila = tblBuscar.getSelectedRow();
        if (fila > -1){
        String codigo = String.valueOf(tblBuscar.getValueAt(fila, 0));
        int filaseleccionada;
        DefaultTableModel modelotabla=(DefaultTableModel) tblBuscar.getModel();
            
            filaseleccionada= tblBuscar.getSelectedRow();
            String id_usuarios= (String)modelotabla.getValueAt(filaseleccionada, 0);
            String DNI=txtDni.getText();                   
            String Apellido=txtApellido.getText();
            String Nombre=txtNombre.getText();
            String Fecha_Nac=txtFecNac.getText();
            String Telefono=txtTelFijo.getText();
            String Celular=txtCel.getText();
            String Email=txtCorreo.getText();
            String Religion=cmbReligion.getItemAt(WIDTH);
            String Nacionalidad=cmbPais.getItemAt(WIDTH);
            String Funcion=cmbFuncion.getItemAt(WIDTH);
            String Area=cmbArea.getItemAt(WIDTH);
            String Zona=txtZona.getText();
            String Distrito=txtDistrito.getText();
            String Nombre_Grupo=txtGrupo.getText();
            String Sexo=cmbSexo.getItemAt(WIDTH);
            
           sSQL = "update datos_personas set id_usuarios= ? ,DNI= ? ,Apellido= ? ,Nombre= ? ,Fecha_Nac= ? ,Telefono= ? ,Celular= ? ,Email= ? ,Religion= ? ,Nacionalidad= ? ,Funcion= ? ,Area= ? ,Zona= ? ,Distrito= ? ,Nombre_Grupo= ?,Sexo= ?  where id_usuarios = '"+id_usuarios+"'";          
           
           
           try {            
        Connection cn = mysql.obtenerConexion();
         PreparedStatement pstm = cn.prepareStatement(sSQL);
            pstm.setString(2, DNI);                   
            pstm.setString(3, Apellido);
            pstm.setString(4, Nombre);
            pstm.setString(5, Fecha_Nac);
            pstm.setString(6, Telefono);
            pstm.setString(7, Celular);
            pstm.setString(8, Email);
            pstm.setString(9, Religion);
            pstm.setString(10, Nacionalidad);
            pstm.setString(11, Funcion);
            pstm.setString(12, Area);
            pstm.setString(13, Zona);
            pstm.setString(14, Distrito);
            pstm.setString(15, Nombre_Grupo);
            pstm.setString(16, Sexo);
            pstm.setString(1, String.valueOf(id_usuarios));
            int n = pstm.executeUpdate();
//            pstm.execute();
//            pstm.close();            
          if(n > 0)
            {
                JOptionPane.showMessageDialog(null, "Usted ha actualizado los datos");
             //   CargarTabla("");//l momento de agregar un nuevo registro, actualiza la tabla
            }
          
           }catch(SQLException e){
         System.out.println(e);
      }      catch (ClassNotFoundException ex) {
                 Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
             }
         
         
         
         
         
         
//act.actualizar(DNI, Apellido, Nombre, Fecha_Nac, Telefono, Celular, Email, Religion, Nacionalidad, Funcion, Area, Zona, Distrito, Nombre_Grupo, Sexo,id_usuarios);
//   




        
              
        
        
        /*               
               
                 Connection conn =Conexion.obtenerConexion();
                 Statement sent = conn.createStatement();
                 String sql ="delete from datos_personas where id_usuarios like "+ tblBuscar.getValueAt(fila, 0); 

                //sent = conn.createStatement();
                int n =sent.executeUpdate(sql);
          
                
                if (n>0) 
                    
                    
                {
                    JOptionPane.showMessageDialog(null, "Datos Eliminados");
                    System.out.println("entro al iiiiiifffff!!!!");
                limpiarformulario();
                }else   {
                    System.out.println("NO entro al iiiiiifffff!!!!");
                limpiarformulario();
                }
                    }
                catch (Exception e)
                {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
                }

        btnGuardar.setEnabled(true);// esto hace que se active el boton
        btnNuevo.setEnabled(true);// esto hace que se active el boton
        btnEliminar.setEnabled(true);// esto hace que se cancele la accion del boton osea deshabilita
        btnCancelar.setEnabled(true);// esto hace que se cancele la accion del boton osea deshabilita
*/
        
        limpiarformulario();
    }//GEN-LAST:event_btnActualizarCamposActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCampos;
    private javax.swing.JButton btnBuscarfrmBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbArea;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JComboBox<String> cmbFuncion;
    private javax.swing.JComboBox<String> cmbPais;
    private javax.swing.JComboBox<String> cmbReligion;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuscar;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFecNac;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelFijo;
    private javax.swing.JTextField txtValorbusqueda;
    private javax.swing.JTextField txtZona;
    // End of variables declaration//GEN-END:variables
}
