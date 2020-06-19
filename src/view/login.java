
package view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        loading = new javax.swing.JProgressBar();
        loading.setStringPainted(true);
        }
        public class progres implements ActionListener{
       @Override
        public void actionPerformed(ActionEvent ae) {
            int n = loading.getValue();
            if(n<100){
                n++;
                loading.setValue(n);
            }else{
                timer.stop();
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXT_USER = new javax.swing.JTextField();
        TXT_PASS = new javax.swing.JPasswordField();
        RB_ADMIN = new javax.swing.JRadioButton();
        RB_USER = new javax.swing.JRadioButton();
        B_LOGIN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setForeground(new java.awt.Color(51, 255, 255));
        setLocation(new java.awt.Point(300, 100));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 15, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("USERNAME");

        jLabel2.setText("PASSWORD");

        TXT_USER.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXT_USERKeyPressed(evt);
            }
        });

        TXT_PASS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXT_PASSKeyPressed(evt);
            }
        });

        RB_ADMIN.setText("ADMIN");
        RB_ADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_ADMINActionPerformed(evt);
            }
        });

        RB_USER.setText("KASIR");
        RB_USER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_USERActionPerformed(evt);
            }
        });

        B_LOGIN.setText("LOGIN");
        B_LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LOGINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXT_USER)
                            .addComponent(TXT_PASS, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RB_ADMIN)
                        .addGap(18, 18, 18)
                        .addComponent(RB_USER)
                        .addGap(89, 89, 89)
                        .addComponent(B_LOGIN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TXT_USER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXT_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB_ADMIN)
                    .addComponent(RB_USER)
                    .addComponent(B_LOGIN))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Algerian", 1, 100)); // NOI18N
        jLabel3.setText("LOGIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(191, 191, 191))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RB_ADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_ADMINActionPerformed
        RB_USER.setSelected(false);
    }//GEN-LAST:event_RB_ADMINActionPerformed

    private void RB_USERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_USERActionPerformed
        RB_ADMIN.setSelected(false);
    }//GEN-LAST:event_RB_USERActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        RB_USER.setSelected(true);
        timer = new Timer(10,new progres());
    }//GEN-LAST:event_formWindowOpened

    private void B_LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LOGINActionPerformed
        String x = TXT_USER.getText();
        String y = TXT_PASS.getText();
        
         if (x.isEmpty()||y.isEmpty()) {
            JOptionPane.showMessageDialog(jPanel1,"username dan password harus diisi","FAILED",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (x.equalsIgnoreCase("admin")&&y.equals("admin") && RB_ADMIN.isSelected()) {
            timer.start();
            JOptionPane.showMessageDialog(jPanel1,loading,"sukses",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            new view.menu_admin().setVisible(true);
        }
        else if (x.equalsIgnoreCase("kasir")&&y.equals("kasur") && RB_USER.isSelected()) {
            timer.start();
            JOptionPane.showMessageDialog(jPanel1,loading,"sukses",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            new view.kasir().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(jPanel1,"username dan password salah","FAILED",JOptionPane.INFORMATION_MESSAGE);
        }
        loading.setValue(0);
    }//GEN-LAST:event_B_LOGINActionPerformed

    private void TXT_USERKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_USERKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_DOWN) {
            TXT_PASS.requestFocus();
        }
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
            TXT_PASS.requestFocus();
        } else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            RB_USER.setSelected(true);
            RB_ADMIN.setSelected(false);
        }
        else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
             RB_USER.setSelected(false);
            RB_ADMIN.setSelected(true);
        }

    }//GEN-LAST:event_TXT_USERKeyPressed

    private void TXT_PASSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_PASSKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_UP) {
            TXT_USER.requestFocus();
        }
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
            B_LOGINActionPerformed(new ActionEvent(evt.getSource(), evt.getID(), ""));
        }
         else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            RB_USER.setSelected(true);
            RB_ADMIN.setSelected(false);
        }
        else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
             RB_USER.setSelected(false);
            RB_ADMIN.setSelected(true);
        }
    }//GEN-LAST:event_TXT_PASSKeyPressed

 
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
                new login().setVisible(true);
            }
        });
    }
    private Timer timer;
    private javax.swing.JProgressBar loading;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_LOGIN;
    private javax.swing.JRadioButton RB_ADMIN;
    private javax.swing.JRadioButton RB_USER;
    private javax.swing.JPasswordField TXT_PASS;
    private javax.swing.JTextField TXT_USER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
