package vista;

import controlador.ctrlmascota;

public class formulario extends javax.swing.JFrame {
    public formulario() {
        initComponents();
    }
    public void AsignarEscuchar(ctrlmascota c){
        btnconsultar.addActionListener(c);
        btneliminar.addActionListener(c);
        btnmodificar.addActionListener(c);
        btninsertar.addActionListener(c);
        btnlistar.addActionListener(c);
        btnlimpiar.addActionListener(c);
        
    }
    public void AsignarEscuchar2(ctrlmascota c){
        jtablemascotas.addMouseListener(c);
    }
    public void AsignarEscuchar3(ctrlmascota c){
        jtablemascotas.addKeyListener(c);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btninsertar = new javax.swing.JButton();
        txtidmascota = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtubicacion = new javax.swing.JTextField();
        lblresu = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        txtespecie = new javax.swing.JComboBox<>();
        txtsexo = new javax.swing.JComboBox<>();
        txtestado = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnconsultar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();
        txtconsulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablemascotas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso De Datos\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("ID_Mascota : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nombre : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Ubicación : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Estado : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        btninsertar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btninsertar.setText("Insertar");
        jPanel1.add(btninsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 40));

        txtidmascota.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtidmascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 100, 30));

        txtnombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 130, 30));

        txtubicacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 90, 30));

        lblresu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblresu.setText("Resultado");
        jPanel1.add(lblresu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 320, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Especie : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Sexo : ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        btnlimpiar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnlimpiar.setText("Limpiar");
        jPanel1.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 100, 30));

        txtespecie.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtespecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "P", "G" }));
        jPanel1.add(txtespecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 90, -1));

        txtsexo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "H" }));
        jPanel1.add(txtsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 90, -1));

        txtestado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "A", "B" }));
        jPanel1.add(txtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 580, 310));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CRUD\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Ingrese ID a Consultar : ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 30));

        btnconsultar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnconsultar.setText("Consultar");
        jPanel2.add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        btnmodificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnmodificar.setText("Modificar");
        jPanel2.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        btneliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btneliminar.setText("Eliminar");
        jPanel2.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        btnlistar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnlistar.setText("Listar");
        jPanel2.add(btnlistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        txtconsulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(txtconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 70, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 580, 190));

        jtablemascotas.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jtablemascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Mascota", "Nombre", "Especie", "Sexo", "Ubicacion", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jtablemascotas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 520, 250));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnconsultar;
    public javax.swing.JButton btneliminar;
    public javax.swing.JButton btninsertar;
    public javax.swing.JButton btnlimpiar;
    public javax.swing.JButton btnlistar;
    public javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtablemascotas;
    public javax.swing.JLabel lblresu;
    public javax.swing.JTextField txtconsulta;
    public javax.swing.JComboBox<String> txtespecie;
    public javax.swing.JComboBox<String> txtestado;
    public javax.swing.JTextField txtidmascota;
    public javax.swing.JTextField txtnombre;
    public javax.swing.JComboBox<String> txtsexo;
    public javax.swing.JTextField txtubicacion;
    // End of variables declaration//GEN-END:variables
}
