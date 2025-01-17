/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author jose_
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        this.pintarImagen(this.imgCuenta, "/icons/user_50px.png");
        this.pintarImagen(this.imgDinero, "/icons/money_50px.png");
        this.pintarBoton(this.btnIngresar, "/icons/add_money_64px.png");
        this.pintarBoton(this.btnRetirar, "/icons/request_money_64px.png");
        this.pintarBoton(this.btnTransferir, "/icons/initiate_money_transfer_64px.png");
        this.pintarBoton(this.btnAdmin, "/icons/administrative_tools_25px.png");
        this.pintarBoton(this.btnModificar, "/icons/pencil_25px.png");
        this.pintarBoton(this.btnCerrar, "/icons/export_25px.png");
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/icono.png")));
    }

    private void pintarImagen(JLabel lbl, String ruta){
        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
        this.repaint();
    }
    
     private void pintarBoton(JButton btn, String ruta){
        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
        this.repaint();
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
        txtDinero = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNum = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JLabel();
        imgDinero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnTransferir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        imgCuenta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDinero.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        txtDinero.setForeground(new java.awt.Color(225, 225, 225));
        txtDinero.setText("DINERO");
        jPanel1.add(txtDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 250, 40));

        jLabel5.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(225, 225, 225));
        jLabel5.setText("Num. Cuenta:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 30));

        txtNum.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        txtNum.setForeground(new java.awt.Color(225, 225, 225));
        txtNum.setText("Numero de cuenta");
        jPanel1.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 310, 40));

        jLabel7.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(225, 225, 225));
        jLabel7.setText("Saldo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 60, 30));

        jLabel8.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(225, 225, 225));
        jLabel8.setText("Nombre:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, 30));

        txtNombre.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(225, 225, 225));
        txtNombre.setText("Aqui va el nombre");
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 310, 40));

        jLabel10.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(225, 225, 225));
        jLabel10.setText("Apellidos:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 30));

        txtApellido.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(225, 225, 225));
        txtApellido.setText("Aqui va el apellido");
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 310, 40));

        imgDinero.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        imgDinero.setForeground(new java.awt.Color(0, 153, 51));
        imgDinero.setText("$");
        jPanel1.add(imgDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 50, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 350, 440));

        jPanel2.setBackground(new java.awt.Color(55, 63, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresar.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        btnIngresar.setText(" Ingresar dinero");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 370, 80));

        btnRetirar.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        btnRetirar.setText(" Retirar dinero");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 370, 70));

        btnTransferir.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        btnTransferir.setText("Transferir");
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });
        jPanel2.add(btnTransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 370, 70));

        btnModificar.setBackground(new java.awt.Color(21, 21, 32));
        btnModificar.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(182, 182, 182));
        btnModificar.setText("Modificar Cuenta");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 220, 40));

        btnAdmin.setBackground(new java.awt.Color(21, 21, 32));
        btnAdmin.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(182, 182, 182));
        btnAdmin.setText("Administrador");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 220, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 450, 440));

        jPanel3.setBackground(new java.awt.Color(33, 45, 62));

        jLabel3.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(225, 225, 225));
        jLabel3.setText("Datos de la cuenta");

        jLabel2.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(219, 219, 219));
        jLabel2.setText("Opciones");

        btnCerrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCerrar.setText("Cerrar Sesión");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(imgCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAdmin;
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnIngresar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnRetirar;
    public javax.swing.JButton btnTransferir;
    private javax.swing.JLabel imgCuenta;
    private javax.swing.JLabel imgDinero;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel txtApellido;
    public javax.swing.JLabel txtDinero;
    public javax.swing.JLabel txtNombre;
    public javax.swing.JLabel txtNum;
    // End of variables declaration//GEN-END:variables
}
