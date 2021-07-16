/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.PanelImagen;
import javax.swing.JFrame;

/**
 *
 * @author Rodrigo
 */
public class frmSistemaFormacion extends JFrame{
    public frmSistemaFormacion()
    {
    add(new PanelImagen());
        setSize(800,600);
        setVisible(true);
    }
    
    public static void main(String[] args) 
    {
    frmSistemaFormacion f = new frmSistemaFormacion();
    }
    
}
