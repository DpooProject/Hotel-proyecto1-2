/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacesGeneral;

import java.awt.Color;

import interfaceshotel.AdminInterfaz;
import interfaceshotel.EmployerInterfaz;
import interfaceshotel.GeneralInterfaz;
import interfaceshotel.LoginInterfaz;
import prosecution.EmployerProcess;

/**
 *
 * @author user
 */
public class GeneralRegistrarConsumo extends javax.swing.JFrame {

    /**
     * Creates new form GeneralRegistrarConsumo
     */
    public GeneralRegistrarConsumo() {
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

        jPanel1 = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        PanelAzul1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        TextFieldId = new javax.swing.JTextField();
        LabelMonto = new javax.swing.JLabel();
        TextFieldMonto = new javax.swing.JTextField();
        BotonSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jPanel1.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 380));

        PanelAzul1.setBackground(new java.awt.Color(51, 102, 255));

        Titulo.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("1. Registrar Consumos");

        javax.swing.GroupLayout PanelAzul1Layout = new javax.swing.GroupLayout(PanelAzul1);
        PanelAzul1.setLayout(PanelAzul1Layout);
        PanelAzul1Layout.setHorizontalGroup(
            PanelAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzul1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(Titulo)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        PanelAzul1Layout.setVerticalGroup(
            PanelAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzul1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Titulo)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(PanelAzul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 590, 80));

        ID.setText("ID HABITACION");
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        TextFieldId.setText("Digita aca el Id de la habitación");
        TextFieldId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldIdMouseClicked(evt);
            }
        });
        TextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIdActionPerformed(evt);
            }
        });
        jPanel1.add(TextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        LabelMonto.setText("MONTO DEL SERVICIO");
        jPanel1.add(LabelMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        TextFieldMonto.setText("Digite aca el monto del servicio");
        TextFieldMonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldMontoMouseClicked(evt);
            }
        });
        TextFieldMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldMontoActionPerformed(evt);
            }
        });
        jPanel1.add(TextFieldMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

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
        jPanel1.add(BotonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldIdActionPerformed

    private void TextFieldMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMontoActionPerformed

    private void TextFieldMontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldMontoMouseClicked
        // TODO add your handling code here:
        TextFieldMonto.setText("");
    }//GEN-LAST:event_TextFieldMontoMouseClicked

    private void TextFieldIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldIdMouseClicked
        // TODO add your handling code here:
        TextFieldId.setText("");
    }//GEN-LAST:event_TextFieldIdMouseClicked

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
    	String roomid = TextFieldId.getText();
    	String montostring = TextFieldMonto.getText();
    	int monto = Integer.parseInt(montostring);
    	
    	EmployerProcess employerProcess = new EmployerProcess();
		employerProcess.addAmountToRoomBill(roomid, monto);
		dispose();
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(AdminInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(AdminInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(AdminInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(AdminInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new EmployerInterfaz().setVisible(true);
	            }
	        });
    	
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel LabelMonto;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelAzul1;
    private javax.swing.JTextField TextFieldId;
    private javax.swing.JTextField TextFieldMonto;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
