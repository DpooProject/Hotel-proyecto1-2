package interfacesRecepcionista;

import java.awt.Color;

import prosecution.RecepcionistProcess;

public class RecepcionistaReservarHabitacion extends javax.swing.JFrame {

    /**
     * Creates new form RecepcionistaConsultarHabitacion
     */
    public RecepcionistaReservarHabitacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        PanelAzul1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LabelNumerDias = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        LabelNumerPersonas = new javax.swing.JLabel();
        ComboBoxNumeroPersonas = new javax.swing.JComboBox<>();
        SliderNumeroDias = new javax.swing.JSlider();
        BotonSiguiente = new javax.swing.JButton();
        TextFieldAño = new javax.swing.JTextField();
        TextFieldMes = new javax.swing.JTextField();
        TextFieldDia = new javax.swing.JTextField();
        LabelNumerPersonas1 = new javax.swing.JLabel();
        LabelNumerPersonas2 = new javax.swing.JLabel();
        LabelNumerPersonas3 = new javax.swing.JLabel();

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
        jLabel1.setText("2. Reservar Habitacion ");

        javax.swing.GroupLayout PanelAzul1Layout = new javax.swing.GroupLayout(PanelAzul1);
        PanelAzul1.setLayout(PanelAzul1Layout);
        PanelAzul1Layout.setHorizontalGroup(
            PanelAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzul1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        PanelAzul1Layout.setVerticalGroup(
            PanelAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzul1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Fondo.add(PanelAzul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 630, 80));

        LabelNumerDias.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelNumerDias.setText("Numero de Dias");
        Fondo.add(LabelNumerDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        LabelNombre.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelNombre.setText("Nombre");
        Fondo.add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        TextFieldNombre.setText("Ingrese aca el nombre del cliente");
        TextFieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldNombreMouseClicked(evt);
            }
        });
        Fondo.add(TextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        LabelNumerPersonas.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelNumerPersonas.setText("Dia");
        Fondo.add(LabelNumerPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        ComboBoxNumeroPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        Fondo.add(ComboBoxNumeroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        SliderNumeroDias.setMajorTickSpacing(5);
        SliderNumeroDias.setMaximum(20);
        SliderNumeroDias.setMinorTickSpacing(1);
        SliderNumeroDias.setPaintLabels(true);
        SliderNumeroDias.setPaintTicks(true);
        SliderNumeroDias.setValue(10);
        Fondo.add(SliderNumeroDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 320, 40));

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
        Fondo.add(BotonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        TextFieldAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAñoActionPerformed(evt);
            }
        });
        Fondo.add(TextFieldAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        TextFieldMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldMesActionPerformed(evt);
            }
        });
        Fondo.add(TextFieldMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));
        Fondo.add(TextFieldDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        LabelNumerPersonas1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelNumerPersonas1.setText("Numero de Personas");
        Fondo.add(LabelNumerPersonas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        LabelNumerPersonas2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelNumerPersonas2.setText("Año");
        Fondo.add(LabelNumerPersonas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        LabelNumerPersonas3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelNumerPersonas3.setText("Mes");
        Fondo.add(LabelNumerPersonas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void TextFieldNombreMouseClicked(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
        TextFieldNombre.setText("");
    }                                            

    private void BotonSiguienteMouseEntered(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
        BotonSiguiente.setBackground(new Color(0,0,255));
    }                                           

    private void BotonSiguienteMouseExited(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
        BotonSiguiente.setBackground(new Color(51,102,255));
    }                                          

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {                                               
    	String nombre = TextFieldNombre.getText();
        int dias = SliderNumeroDias.getValue();
        int personas = ComboBoxNumeroPersonas.getItemCount();
        int ano = Integer.parseInt(LabelNumerPersonas1.getText());
        int mes = Integer.parseInt(LabelNumerPersonas2.getText());
        int dia = Integer.parseInt(LabelNumerPersonas3.getText());
        
        
        
        RecepcionistProcess.reservarHabitacion(" ", nombre, personas, dias, dia, mes, ano);
        dispose();

    }                                              

    private void TextFieldAñoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void TextFieldMesActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

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
            java.util.logging.Logger.getLogger(RecepcionistaReservarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecepcionistaReservarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecepcionistaReservarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecepcionistaReservarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecepcionistaReservarHabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JComboBox<String> ComboBoxNumeroPersonas;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelNumerDias;
    private javax.swing.JLabel LabelNumerPersonas;
    private javax.swing.JLabel LabelNumerPersonas1;
    private javax.swing.JLabel LabelNumerPersonas2;
    private javax.swing.JLabel LabelNumerPersonas3;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelAzul1;
    private javax.swing.JSlider SliderNumeroDias;
    private javax.swing.JTextField TextFieldAño;
    private javax.swing.JTextField TextFieldDia;
    private javax.swing.JTextField TextFieldMes;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}