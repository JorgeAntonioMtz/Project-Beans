
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alberto jaquez
 */
public class login extends javax.swing.JFrame {
    /**
     * Creates new form login
     */
    
    String nombreA = "Alberto";
    String nombreD = "Jorge";
    String contraA = "1234";
    String contraD = "1234";
    String usuario;
    String contra;
    
         
    public login() {
        initComponents();
        boton1.setBackground(Color.white);
        btnEntrar.setBackground(Color.gray);
        Check1.setBackground(Color.white);
        Check2.setBackground(Color.white);
        this.setLocation(500,150);
        txtContra.setText("");
        txtContra.setEchoChar('*');
        fondo.setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Check2 = new javax.swing.JCheckBox();
        Check1 = new javax.swing.JCheckBox();
        txtContra = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(null);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(530, 200, 430, 40);

        boton1.setBackground(new java.awt.Color(204, 255, 255));
        boton1.setText("Olvidaste tu contraseña?");
        getContentPane().add(boton1);
        boton1.setBounds(530, 340, 430, 32);

        btnEntrar.setText("Iniciar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(680, 400, 140, 32);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raya.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 80, 50, 480);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/teacher.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 110, 190, 370);

        Check2.setText("Alumno");
        Check2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check2ActionPerformed(evt);
            }
        });
        getContentPane().add(Check2);
        Check2.setBounds(270, 490, 90, 24);

        Check1.setText("Docente");
        getContentPane().add(Check1);
        Check1.setBounds(50, 490, 120, 24);

        txtContra.setText("jPasswordField1");
        getContentPane().add(txtContra);
        txtContra.setBounds(530, 252, 430, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/alu.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 160, 200, 270);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pizarron.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 120, 550, 400);
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 1090, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void Check2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Check2ActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        usuario = txtUsuario.getText();
        contra = txtContra.getText();
        if(usuario.equals(nombreD) && Check1.isSelected() && contra.equals(contraD))
        {
           this.dispose();
           Docente docen = new Docente();
           docen.setVisible(true);
        } 
        else if(usuario.equals(nombreA) && Check2.isSelected() && contra.equals(contraA))
        {
            this.dispose();
            Alumno alum = new Alumno();
            alum.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "La contraseña o el correo pueden ser incorrectas");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login frame = new login();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Check1;
    private javax.swing.JCheckBox Check2;
    private javax.swing.JButton boton1;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
