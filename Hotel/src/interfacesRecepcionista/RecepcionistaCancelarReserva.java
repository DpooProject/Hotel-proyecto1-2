/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacesRecepcionista;

import java.awt.Color;

/**
 *
 * @author user
 */
public class RecepcionistaCancelarReserva extends javax.swing.JFrame {

    /**
     * Creates new form RecepcionistaConsultarHabitacion
     */
    public RecepcionistaCancelarReserva() {
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

        Fondo = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        PanelAzul1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ID1 = new javax.swing.JLabel();
        TextFieldID1 = new javax.swing.JTextField();
        BotonSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        Fondo.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 390));

        PanelAzul1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("3. Cancelar Reserva");

        javax.swing.GroupLayout PanelAzul1Layout = new javax.swing.GroupLayout(PanelAzul1);
        PanelAzul1.setLayout(PanelAzul1Layout);
        PanelAzul1Layout.setHorizontalGroup(
            PanelAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzul1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        PanelAzul1Layout.setVerticalGroup(
            PanelAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzul1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Fondo.add(PanelAzul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 630, 80));

        ID1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        ID1.setText("ID de Reserva");
        Fondo.add(ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        TextFieldID1.setText("Ingrese aca el ID de la reserva a cancelar");
        TextFieldID1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldID1MouseClicked(evt);
            }
        });
        Fondo.add(TextFieldID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

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
        Fondo.add(BotonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 689, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldID1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldID1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldID1MouseClicked

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
            java.util.logging.Logger.getLogger(RecepcionistaCancelarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecepcionistaCancelarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecepcionistaCancelarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecepcionistaCancelarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecepcionistaCancelarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel ID1;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelAzul1;
    private javax.swing.JTextField TextFieldID1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}