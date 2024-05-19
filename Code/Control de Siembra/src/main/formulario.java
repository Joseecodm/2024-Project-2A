package main;

import classes.lechuga;
import classes.registroLechugas;
import classes.lechugaEncriptada;
import classes.registroLechugasEncriptadas;
import classes.autenticacion;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Josee
 */
public class formulario extends javax.swing.JFrame {

    /**
     * Creates new form formulario
     */
    private registroLechugas registro;

    public formulario() {

        initComponents();
        registro = new registroLechugas();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtDay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboxID = new javax.swing.JComboBox<>();
        txtTemperature = new javax.swing.JTextField();
        txtHumedad = new javax.swing.JTextField();
        txtLongitud = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        labelTEDCNM = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtAmperaje = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuOption = new javax.swing.JMenu();
        verRegistro = new javax.swing.JMenuItem();
        vAEncripted = new javax.swing.JMenuItem();
        vaciarCampos = new javax.swing.JMenuItem();
        eliminarRegistros = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de siembras de lechugas");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(454, 339));

        txtDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDayActionPerformed(evt);
            }
        });

        jLabel6.setText("Introduce el dia:");

        jLabel7.setText("Id. de la lechuga");

        cboxID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lechuga normal", "Lechuga con antena" }));

        txtTemperature.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtHumedad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHumedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHumedadActionPerformed(evt);
            }
        });

        txtLongitud.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLongitudActionPerformed(evt);
            }
        });

        jLabel1.setText("Introduce la temperatura:");

        jLabel3.setText("Introduce la humedad:");

        jLabel4.setText("Introduce la longitud:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        labelTEDCNM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTEDCNM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTEDCNM.setText("Instituto Tecnologico Superior del Occidente del Estado de Hidalgo");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ing. Tecnologías de la Información y Comunicaciones");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Control de siembra de lechugas");

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txtAmperaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmperaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmperajeActionPerformed(evt);
            }
        });

        jLabel5.setText("Introduce el amperaje:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAmperaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegistrar))
                            .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboxID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 188, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelTEDCNM, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cboxID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHumedad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnRegistrar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLongitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAmperaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(labelTEDCNM)
                    .addContainerGap(323, Short.MAX_VALUE)))
        );

        menuOption.setText("Opciones");

        verRegistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        verRegistro.setText("Ver registros");
        verRegistro.setFocusPainted(true);
        verRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verRegistroActionPerformed(evt);
            }
        });
        menuOption.add(verRegistro);

        vAEncripted.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        vAEncripted.setText("Ver archivo encriptado");
        vAEncripted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vAEncriptedActionPerformed(evt);
            }
        });
        menuOption.add(vAEncripted);

        vaciarCampos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        vaciarCampos.setText("Vaciar campos");
        vaciarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciarCamposActionPerformed(evt);
            }
        });
        menuOption.add(vaciarCampos);

        eliminarRegistros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        eliminarRegistros.setText("Eliminar todos los registros");
        eliminarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarRegistrosActionPerformed(evt);
            }
        });
        menuOption.add(eliminarRegistros);

        jMenuBar1.add(menuOption);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtHumedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHumedadActionPerformed

    }//GEN-LAST:event_txtHumedadActionPerformed

    private void txtLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLongitudActionPerformed

    }//GEN-LAST:event_txtLongitudActionPerformed

    private void verRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verRegistroActionPerformed
        // Verificar credenciales de usuario antes de abrir el archivo encriptado
        String usuario = JOptionPane.showInputDialog(this, "Ingrese su nombre de usuario:");
        String contrasena = JOptionPane.showInputDialog(this, "Ingrese su contraseña:");

        // Verificar las credenciales
        if (autenticacion.autenticar(usuario, contrasena)) {
            // Las credenciales son correctas, abrir el archivo encriptado
            String filePath = "registro_lechugas.txt";
            try {
                File file = new File(filePath);
                if (file.exists()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(this, "El archivo no existe: " + filePath);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            // Las credenciales son incorrectas, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas. No se puede acceder al archivo encriptado.");
        }
    }//GEN-LAST:event_verRegistroActionPerformed

    private void eliminarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRegistrosActionPerformed

        String filePath1 = "registro_lechugas.txt";
        String filePath2 = "registro_lechugas_encriptado.txt";

        try {

            File file1 = new File(filePath1);
            if (file1.exists()) {
                if (file1.delete()) {
                    JOptionPane.showMessageDialog(this, "El archivo se ha eliminado correctamente: " + filePath1);
                } else {
                    JOptionPane.showMessageDialog(this, "El archivo no se pudo eliminar: " + filePath1);
                }
            } else {
                System.out.println("El archivo no existe: " + filePath1);
            }

            File file2 = new File(filePath2);
            if (file2.exists()) {
                if (file2.delete()) {
                    JOptionPane.showMessageDialog(this, "El archivo se ha eliminado correctamente: " + filePath2);
                } else {
                    JOptionPane.showMessageDialog(this, "El archivo no se pudo eliminar: " + filePath2);
                }
            } else {
                System.out.println("El archivo no existe: " + filePath2);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_eliminarRegistrosActionPerformed

    private void txtDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDayActionPerformed

    }//GEN-LAST:event_txtDayActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (txtTemperature.getText().isEmpty()
                || txtHumedad.getText().isEmpty()
                || txtLongitud.getText().isEmpty()
                || txtDay.getText().isEmpty()
                || txtAmperaje.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Campos incompletos", JOptionPane.WARNING_MESSAGE);

        } else {
            int id = cboxID.getSelectedIndex() + 1;
            String fechaPlantacion = txtDay.getText();
            double temperatura = Double.parseDouble(txtTemperature.getText());
            double humedad = Double.parseDouble(txtHumedad.getText());
            String longitud = txtLongitud.getText();
            double amperaje = Double.parseDouble(txtAmperaje.getText());
            
            // Crear lechuga
            lechuga lechuga = new lechuga(id, fechaPlantacion, temperatura, humedad, longitud, amperaje);

            // Agregar lechuga al registro
            registro.agregarLechuga(lechuga);

            // Guardar registro sin encriptar
            registro.guardarRegistro();

            // Guardar registro encriptado
            registroLechugasEncriptadas registroEncriptado = new registroLechugasEncriptadas();
            lechugaEncriptada lechugaEncriptada = new lechugaEncriptada(id, fechaPlantacion, temperatura, humedad, longitud, amperaje);
            registroEncriptado.agregarLechuga(lechugaEncriptada);
            registroEncriptado.guardarRegistroEncriptado();

            // Limpiar campos de texto
            txtDay.setText("");
            txtTemperature.setText("");
            txtHumedad.setText("");
            txtLongitud.setText("");
            txtAmperaje.setText("");
    }//GEN-LAST:event_btnRegistrarActionPerformed
    }
    private void vaciarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciarCamposActionPerformed

        txtDay.setText("");
        txtTemperature.setText("");
        txtHumedad.setText("");
        txtLongitud.setText("");
        txtAmperaje.setText("");
    }//GEN-LAST:event_vaciarCamposActionPerformed

    private void vAEncriptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vAEncriptedActionPerformed
        // Verificar credenciales de usuario antes de abrir el archivo encriptado
        String usuario = JOptionPane.showInputDialog(this, "Ingrese su nombre de usuario:");
        String contrasena = JOptionPane.showInputDialog(this, "Ingrese su contraseña:");

        // Verificar las credenciales
        if (autenticacion.autenticar(usuario, contrasena)) {
            // Las credenciales son correctas, abrir el archivo encriptado
            String filePath = "registro_lechugas_encriptado.txt";
            try {
                File file = new File(filePath);
                if (file.exists()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(this, "El archivo no existe: " + filePath);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            // Las credenciales son incorrectas, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas. No se puede acceder al archivo encriptado.");
        }
    }//GEN-LAST:event_vAEncriptedActionPerformed

    private void txtAmperajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmperajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmperajeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboxID;
    private javax.swing.JMenuItem eliminarRegistros;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelTEDCNM;
    private javax.swing.JMenu menuOption;
    private javax.swing.JTextField txtAmperaje;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtHumedad;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JMenuItem vAEncripted;
    private javax.swing.JMenuItem vaciarCampos;
    private javax.swing.JMenuItem verRegistro;
    // End of variables declaration//GEN-END:variables
}
