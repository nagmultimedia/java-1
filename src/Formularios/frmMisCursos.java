
package Formularios;



import Metodos.MetodosBD;
import java.net.URI;
import java.awt.Desktop;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class frmMisCursos extends javax.swing.JInternalFrame {

    static void AccessibleJInternalFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form VentanaMiscursos
     */
   public frmMisCursos() {
        super("Mis Cursos", true, true, true,true);
        initComponents();
        
        
//        String palabrasABuscar = txtBuscar.getText();


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        txtValorBusquedaMisCursos = new javax.swing.JTextField();
        btnBuscarfrmMisCursos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbFiltroMisCursos = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMisCursos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        btnBuscarfrmMisCursos.setText("Buscar");
        btnBuscarfrmMisCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarfrmMisCursosActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar por");

        cmbFiltroMisCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Area" }));
        cmbFiltroMisCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltroMisCursosActionPerformed(evt);
            }
        });

        tblMisCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_usuarios", "DNI", "Area", "El_rol_del_Educador_Scout ", "Conociendo_el_movimiento_Scout ", "Las_obligaciones_Institucionales ", "El_Educador_y_su_Fe_1 ", "Supervisión_(Supervisado) ", "Educación_en_la_Fe ", "Planificando_el_Programa_1 ", "Animando_el_programa_1 ", "La_gestión_institucional ", "Supervisión_2_(Supervisor)", "Promoción_comunitaria_y_alianzas_estratégicas ", "El_Educador_y_su_Fe_2 ", "Planificando_el_Programa_2 ", "Animando_el_programa_2 ", "Planificación_y_conducción_de_actividades_al_aire_libre_jovenes ", "Herramientas_para_la_Gestión ", "Administración_general ", "Planificación_y_conducción_de_actividades_al_aire_libre_Gestion ", "Desarrollo_de_habilidades_de_liderazgo ", "Planificación ", "El_Educador_y_su_Fe_3 ", "Recursos_Educativos ", "La_gestión_de_SAAC ", "Captación_en_SAAC "
            }
        ));
        tblMisCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMisCursosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblMisCursos);

        jButton1.setText("Ver mis cursos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbFiltroMisCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtValorBusquedaMisCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnBuscarfrmMisCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbFiltroMisCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorBusquedaMisCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarfrmMisCursos)
                    .addComponent(jButton1))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarfrmMisCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarfrmMisCursosActionPerformed
        MetodosBD metodosbd = new MetodosBD();
        //metodosbd.Buscar(txtValorbusqueda.getText(), cmbFiltro.getSelectedItem().toString(), tblBuscar);
        metodosbd.buscarMisCursos(txtValorBusquedaMisCursos.getText(), cmbFiltroMisCursos.getSelectedItem().toString(), tblMisCursos);
    }//GEN-LAST:event_btnBuscarfrmMisCursosActionPerformed

    private void cmbFiltroMisCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiltroMisCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFiltroMisCursosActionPerformed

    private void tblMisCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMisCursosMouseClicked
     /*   //         // Activa el boton 'eliminar'
        //        btnEliminar.setEnabled(true);
        //        // Activa el boton 'guardar'
        //        btnGuardar.setEnabled(true);
        // Obtiene el item seleccionado y lo guarda en un objeto
        //       int row = tblBuscar.getSelectedRow();
        //        Object tablares = modeloClientes.getValueAt(row, 0);
        //        String a = tblBuscar.getValueAt(row, 0).toString();// revisar esta liena para que devuelva de la tabla los datos a lso campos
        //       // tblBuscar.getSelectionModel();
        //        txtApellido.setText(a);
        //        txtNombre.setText(a);
        //        txtDni.setText(a);
        //        txtFecNac.setText(a);
        //        txtTelFijo.setText(a);
        //        txtCel.setText(a);
        //        cmbPais.setActionCommand(a);
        //        cmbArea.setActionCommand(a);
        //        cmbFuncion.setActionCommand(a);
        //        cmbReligion.setActionCommand(a);
        //        cmbSexo.setActionCommand(a);
        //        txtGrupo.setText(a);
        //        txtDistrito.setText(a);
        //        txtZona.setText(a);
        //        txtCorreo.setText(a);

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

        //       //tblBuscar.getSelectionModel(a);
        //        // Completa las cajas de texto segun el elemento
        //        txtNombre.setText(a.getNombre());
        //        txtApellido.setText(a.getApellido());
        //        txtDni.setText((String.valueOf(a.getDni())));
        //        // Completa el combo de pais
        //        cmbPais.setSelectedItem(a.getNacionalidad())

        /*try
        {

            String Table_Click = (tblBuscar.getModel().getValueAt(row, 0).toString());
            String Sql = "select * from datos_personas where Apellido= '"+Table_Click+"' ";

            conect = MetodosBD.dataSource.getConnection();
            PreparedStatement st = conect.prepareStatement(SSQL);
            ResultSet rs = st.executeQuery();

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

        */
    }//GEN-LAST:event_tblMisCursosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try 
        {
        Desktop.getDesktop().browse(new URI("https://drive.google.com/drive/u/2/my-drive"));
        } catch (Exception ex) 
        {
        JOptionPane.showMessageDialog(null, "Error, no se puede entrar");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarfrmMisCursos;
    private javax.swing.JComboBox<String> cmbFiltroMisCursos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblMisCursos;
    private javax.swing.JTextField txtValorBusquedaMisCursos;
    // End of variables declaration//GEN-END:variables
}