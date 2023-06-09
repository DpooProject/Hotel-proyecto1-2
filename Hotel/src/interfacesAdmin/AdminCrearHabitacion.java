/*
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacesAdmin;

import java.awt.Color;

import interfaceshotel.LoginInterfaz;
import prosecution.InventoryController;
import prosecution.RestaurantMenuController;

/**
 *
 * @author user
 */
public class AdminCrearHabitacion extends javax.swing.JFrame {
	static InventoryController inveCont;
    private String id;
	private String tipoHabitacion;
	private String ubicacion;
	private int numeroCamas;
	private String tamañoCama;
	private boolean cocina;
	private boolean balcon;
	private boolean vista;
	/**
     * Creates new form AdminCrearHabitacion
     */
    public AdminCrearHabitacion( InventoryController inveCont) {
    	AdminCrearHabitacion.inveCont=inveCont;
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
        PanelAzul1 = new javax.swing.JPanel();
        PanelAzul2 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        TextFieldID = new javax.swing.JTextField();
        LabelCaracteristicas = new javax.swing.JLabel();
        LabelId = new javax.swing.JLabel();
        LabelUbicacion = new javax.swing.JLabel();
        LabelNumeroCamas = new javax.swing.JLabel();
        LabelTamañoCama = new javax.swing.JLabel();
        ComboBoxTamañoCama = new javax.swing.JComboBox<>();
        ComboBoxUbicacion = new javax.swing.JComboBox<>();
        ComboBoxNumeroCama = new javax.swing.JComboBox<>();
        CheckBoxCocina = new javax.swing.JCheckBox();
        CheckBoxBalcon = new javax.swing.JCheckBox();
        CheckBoxVista = new javax.swing.JCheckBox();
        BotonSiguiente = new javax.swing.JButton();
        LabelUbicacion1 = new javax.swing.JLabel();
        ComboBoxTipo = new javax.swing.JComboBox<>();

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
        Titulo.setText("1. Crear una habitación en el inventario");

        javax.swing.GroupLayout PanelAzul2Layout = new javax.swing.GroupLayout(PanelAzul2);
        PanelAzul2.setLayout(PanelAzul2Layout);
        PanelAzul2Layout.setHorizontalGroup(
            PanelAzul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzul2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(Titulo)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        PanelAzul2Layout.setVerticalGroup(
            PanelAzul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzul2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Titulo)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Fondo.add(PanelAzul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 650, 60));

        TextFieldID.setText("Digite acá el nuevo id de la habitación");
        TextFieldID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldIDMouseClicked(evt);
            }
        });
        Fondo.add(TextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        LabelCaracteristicas.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelCaracteristicas.setText("CARACTERISTICAS");
        Fondo.add(LabelCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        LabelId.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelId.setText("ID");
        Fondo.add(LabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        LabelUbicacion.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelUbicacion.setText("TIPO DE HABITACION");
        Fondo.add(LabelUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        LabelNumeroCamas.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelNumeroCamas.setText("NUMERO CAMA");
        Fondo.add(LabelNumeroCamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        LabelTamañoCama.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelTamañoCama.setText("TAMAÑO CAMA");
        Fondo.add(LabelTamañoCama, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        ComboBoxTamañoCama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tamaño de camas", "Pequeña​", "Mediana​", "Grande" }));
        Fondo.add(ComboBoxTamañoCama, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        ComboBoxUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la Ubicación", "Primer piso​", "Segundo piso​", "Tercer piso" }));
        Fondo.add(ComboBoxUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        ComboBoxNumeroCama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione numero de camas", "1​", "2​", "3​", "4​", "5" }));
        Fondo.add(ComboBoxNumeroCama, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        CheckBoxCocina.setText("Cocina Integrada");
        Fondo.add(CheckBoxCocina, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        CheckBoxBalcon.setText("Balcón​\n");
        Fondo.add(CheckBoxBalcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        CheckBoxVista.setText("Vista");
        CheckBoxVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxVistaActionPerformed(evt);
            }
        });
        Fondo.add(CheckBoxVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

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
        Fondo.add(BotonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));

        LabelUbicacion1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelUbicacion1.setText("UBICACIÓN");
        Fondo.add(LabelUbicacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        ComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de habitacion", "Suite", "Suite Doble", "Estandar" }));
        Fondo.add(ComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void CheckBoxVistaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    	
    }                                             

    private void TextFieldIDMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        TextFieldID.setText("");
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
        // Guarda la información de cada campo en las variables de instancia
        this.id = TextFieldID.getText();
        this.tipoHabitacion = ComboBoxTipo.getSelectedItem().toString();
        this.ubicacion = ComboBoxUbicacion.getSelectedItem().toString();
        this.numeroCamas = ComboBoxNumeroCama.getSelectedIndex();
        this.tamañoCama = ComboBoxTamañoCama.getSelectedItem().toString();
        this.cocina = CheckBoxCocina.isSelected();
        this.balcon = CheckBoxBalcon.isSelected();
        this.vista = CheckBoxVista.isSelected(); 
        AdminCrearHabitacion.inveCont.createRoom(id, ubicacion, tipoHabitacion, balcon, vista, cocina, numeroCamas, tamañoCama);
        AdminCrearHabitacion.inveCont.update();
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
        
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JCheckBox CheckBoxBalcon;
    private javax.swing.JCheckBox CheckBoxCocina;
    private javax.swing.JCheckBox CheckBoxVista;
    private javax.swing.JComboBox<String> ComboBoxNumeroCama;
    private javax.swing.JComboBox<String> ComboBoxTamañoCama;
    private javax.swing.JComboBox<String> ComboBoxTipo;
    private javax.swing.JComboBox<String> ComboBoxUbicacion;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel LabelCaracteristicas;
    private javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelNumeroCamas;
    private javax.swing.JLabel LabelTamañoCama;
    private javax.swing.JLabel LabelUbicacion;
    private javax.swing.JLabel LabelUbicacion1;
    private javax.swing.JPanel PanelAzul1;
    private javax.swing.JPanel PanelAzul2;
    private javax.swing.JTextField TextFieldID;
    private javax.swing.JLabel Titulo;
    // End of variables declaration                   
}


