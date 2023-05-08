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
public class AdminInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form AdminInterfaz
     */
    public AdminInterfaz() {
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

        Background = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        ComboBoxAcciones = new javax.swing.JComboBox<>();
        BotonSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul.setBackground(new java.awt.Color(51, 102, 255));

        titulo1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setText("BIENVENIDO ");

        titulo2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("ADMINISTRADOR");

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addGroup(PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAzulLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(titulo2))
                    .addGroup(PanelAzulLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(titulo1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAzulLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titulo2)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        Background.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 400));

        Titulo.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        Titulo.setText("ACCIONES");
        Background.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        ComboBoxAcciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la opción que desea ejecutar", "1. Crear una nueva habitacion en el invenatario", "2. Cargar nuevas habitaciones en el inventario con un archivo .CSV", "3. Actualizar informacion de habitaciones del inventario con un archivo .CSV", "4. Cambiar tarifa de los servicios del hotel", "5. Editar menu del restaurante", "6. Cargar las tarifas por tipo de cuarto", "7. Cerrar sesion" }));
        ComboBoxAcciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAccionesActionPerformed(evt);
            }
        });
        Background.add(ComboBoxAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 450, -1));

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
        Background.add(BotonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxAccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxAccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAccionesActionPerformed

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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JComboBox<String> ComboBoxAcciones;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
