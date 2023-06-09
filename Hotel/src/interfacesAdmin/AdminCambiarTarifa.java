/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacesAdmin;

import java.awt.Color;

import javax.swing.JOptionPane;

import interfaceshotel.LoginInterfaz;
import prosecution.ServicesInventoryController;

/**
 *
 * @author user
 */
public class AdminCambiarTarifa extends javax.swing.JFrame {
	private static ServicesInventoryController servCont;
	String name;
	int price;
    /**
     * Creates new form AdminCrearHabitacion
     */
    public AdminCambiarTarifa(ServicesInventoryController servCont) {
        initComponents();
        AdminCambiarTarifa.servCont=servCont;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        PanelAzul1 = new javax.swing.JPanel();
        PanelAzul2 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ComboBoxServicios = new javax.swing.JComboBox<>();
        TextFieldPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BotonSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul1.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout PanelAzul1Layout = new javax.swing.GroupLayout(PanelAzul1);
        PanelAzul1.setLayout(PanelAzul1Layout);
        PanelAzul1Layout.setHorizontalGroup(
            PanelAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        PanelAzul1Layout.setVerticalGroup(
            PanelAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        Fondo.add(PanelAzul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 400));

        PanelAzul2.setBackground(new java.awt.Color(51, 102, 255));

        Titulo.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("4. Cambiar tarifa de los servicios del hotel ");

        javax.swing.GroupLayout PanelAzul2Layout = new javax.swing.GroupLayout(PanelAzul2);
        PanelAzul2.setLayout(PanelAzul2Layout);
        PanelAzul2Layout.setHorizontalGroup(
            PanelAzul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzul2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Titulo)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        PanelAzul2Layout.setVerticalGroup(
            PanelAzul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzul2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Titulo)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Fondo.add(PanelAzul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 650, 60));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("NUEVO PRECIO");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        ComboBoxServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el servicio que desea cambiar","Alojamiento individual",
"Alojamiento doble","Desayuno buffet","Acceso a gimnasio","Acceso a piscina","Servicio de habitación","Internet Wi-Fi","Estacionamiento","Lavandería"
        		,"Traslado al aeropuerto"
        		,"Alquiler de salón para eventos"
        		,"Catering para eventos"
        		,"Tour grupal por la ciudad"
        		,"Clases de yoga en grupo"
        		,"Actividades recreativas grupales" }));
        Fondo.add(ComboBoxServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        TextFieldPrecio.setText("ingrese acá el nuevo precio del servicio");
        TextFieldPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldPrecioMouseClicked(evt);
            }
        });
        Fondo.add(TextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("SERVICIO A CAMBIAR");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        BotonSiguiente.setBackground(new java.awt.Color(51, 102, 255));
        BotonSiguiente.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        BotonSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        BotonSiguiente.setText("SIGUIENTE");
        BotonSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonSiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonSiguienteMouseExited(evt);
            }
        });
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });
        Fondo.add(BotonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldPrecioMouseClicked
        // TODO add your handling code here:
        TextFieldPrecio.setText("");
    }//GEN-LAST:event_TextFieldPrecioMouseClicked

    private void BotonSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSiguienteMouseEntered
        // TODO add your handling code here:
        BotonSiguiente.setBackground(new Color(0,0,255));
    }//GEN-LAST:event_BotonSiguienteMouseEntered

    private void BotonSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSiguienteMouseExited
        // TODO add your handling code here:
        BotonSiguiente.setBackground(new Color(51,102,255));
    }//GEN-LAST:event_BotonSiguienteMouseExited

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
        // TODO add your handling code here:
    	this.name = ComboBoxServicios.getSelectedItem().toString();
    	try {
            this.price = (int) Double.parseDouble(TextFieldPrecio.getText());
        } catch (NumberFormatException e) {
            // Manejar la excepción si el valor ingresado no es un número válido
            // Por ejemplo, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido para el precio.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    	AdminCambiarTarifa.servCont.changeRate(name, price);
    	AdminCambiarTarifa.servCont.update();
        dispose();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterfaz().setVisible(true);
            }
        });
    	
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminCambiarTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminCambiarTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminCambiarTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminCambiarTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCambiarTarifa(servCont).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JComboBox<String> ComboBoxServicios;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel PanelAzul1;
    private javax.swing.JPanel PanelAzul2;
    private javax.swing.JTextField TextFieldPrecio;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
