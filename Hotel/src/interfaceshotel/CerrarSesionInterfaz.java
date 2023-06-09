/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceshotel;

import java.awt.Color;

/**
 *
 * @author user
 */
public class CerrarSesionInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form LoginInterfaz
     */
    public CerrarSesionInterfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelAzul = new javax.swing.JPanel();
        LabelIniciarSesion = new javax.swing.JLabel();
        PanelGris = new javax.swing.JPanel();
        LabelHotelDpoo = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        BotonSiguiente1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAzul.setBackground(new java.awt.Color(51, 102, 255));

        LabelIniciarSesion.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        LabelIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        LabelIniciarSesion.setText("CERRAR SESIÓN");

        javax.swing.GroupLayout panelAzulLayout = new javax.swing.GroupLayout(panelAzul);
        panelAzul.setLayout(panelAzulLayout);
        panelAzulLayout.setHorizontalGroup(
            panelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
            .addGroup(panelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAzulLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LabelIniciarSesion)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelAzulLayout.setVerticalGroup(
            panelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(panelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAzulLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LabelIniciarSesion)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(panelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 400));

        LabelHotelDpoo.setFont(new java.awt.Font("DIN Condensed", 1, 48)); // NOI18N
        LabelHotelDpoo.setText("HOTEL DPOO");

        javax.swing.GroupLayout PanelGrisLayout = new javax.swing.GroupLayout(PanelGris);
        PanelGris.setLayout(PanelGrisLayout);
        PanelGrisLayout.setHorizontalGroup(
            PanelGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGrisLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(LabelHotelDpoo)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        PanelGrisLayout.setVerticalGroup(
            PanelGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGrisLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(LabelHotelDpoo)
                .addContainerGap())
        );

        background.add(PanelGris, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 470, 90));

        labelUsuario.setText("HA SIDO UN PLACER ATENDERLO");
        background.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        BotonSiguiente1.setBackground(new java.awt.Color(51, 102, 255));
        BotonSiguiente1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        BotonSiguiente1.setForeground(new java.awt.Color(255, 255, 255));
        BotonSiguiente1.setText("Cerrar");
        BotonSiguiente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonSiguiente1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonSiguiente1MouseExited(evt);
            }
        });
        BotonSiguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguiente1ActionPerformed(evt);
            }
        });
        background.add(BotonSiguiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSiguiente1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSiguiente1MouseEntered
        // TODO add your handling code here:
        BotonSiguiente1.setBackground(new Color(0,0,255));
    }//GEN-LAST:event_BotonSiguiente1MouseEntered

    private void BotonSiguiente1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSiguiente1MouseExited
        // TODO add your handling code here:
        BotonSiguiente1.setBackground(new Color(51,102,255));
    }//GEN-LAST:event_BotonSiguiente1MouseExited

    private void BotonSiguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguiente1ActionPerformed
        // TODO add your handling code here:
    	dispose();
    }//GEN-LAST:event_BotonSiguiente1ActionPerformed

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
            java.util.logging.Logger.getLogger(CerrarSesionInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CerrarSesionInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CerrarSesionInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CerrarSesionInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CerrarSesionInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSiguiente1;
    private javax.swing.JLabel LabelHotelDpoo;
    private javax.swing.JLabel LabelIniciarSesion;
    private javax.swing.JPanel PanelGris;
    private javax.swing.JPanel background;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelAzul;
    // End of variables declaration//GEN-END:variables
}
