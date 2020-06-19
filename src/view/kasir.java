package view;

import ENTITY.tb_barang;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import DAO.dao_barang;
import DAO.dao_detail_transaksi;
import DAO.dao_transaksi;
import ENTITY.tb_nota;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aylwin
 */
public class kasir extends javax.swing.JFrame {

    List<tb_barang> listbarang = new ArrayList<>();
    dao_barang dao_barang = new dao_barang();
    int row = 0;
    List<tb_nota> listnota = new ArrayList<>();
    List<tb_barang> x = new ArrayList<>();
    dao_transaksi dao_transaksi = new dao_transaksi();
    dao_detail_transaksi dao_detail_transaksi = new dao_detail_transaksi();
    
    public kasir() {
        initComponents();
        Date date = new Date();
        this.setLocationRelativeTo(this);
        tanggal.setDate(date);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tanggal = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_idbrng = new javax.swing.JTextField();
        txt_jumlh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_sub = new javax.swing.JButton();
        btn_insert = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_nota = new javax.swing.JTable();
        BTN_DLT = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbl_hrg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("KASIR MENU");

        jLabel2.setText("TANGGAL");

        jLabel3.setText("ID BARANG");

        jLabel4.setText("JUMLAH");

        txt_idbrng.setForeground(new java.awt.Color(153, 153, 153));
        txt_idbrng.setText("masukan ID Barang");
        txt_idbrng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idbrngActionPerformed(evt);
            }
        });
        txt_idbrng.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_idbrngKeyPressed(evt);
            }
        });

        txt_jumlh.setForeground(new java.awt.Color(153, 153, 153));
        txt_jumlh.setText("masukan jumlah Barang");
        txt_jumlh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_jumlhKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("NOTA");

        btn_sub.setText("SUBMIT");
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
            }
        });

        btn_insert.setText("INSERT");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        jButton3.setText("LIHAT TABEL BARANG");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tbl_nota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "KODE BARANG", "NAMA BARANG", "JUMLAH", "HARGA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_nota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_notaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_nota);
        tbl_nota.getAccessibleContext().setAccessibleDescription("");

        BTN_DLT.setText("DELETE");
        BTN_DLT.setEnabled(false);
        BTN_DLT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BTN_DLTMouseReleased(evt);
            }
        });
        BTN_DLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DLTActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("TOTAL HARGA Rp. ");

        lbl_hrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_hrg.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_idbrng, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(txt_jumlh)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_insert)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_DLT)))
                        .addContainerGap(373, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_sub)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_hrg)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(46, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_idbrng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_jumlh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insert)
                    .addComponent(BTN_DLT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbl_hrg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new tbl_barang().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt_idbrngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idbrngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idbrngActionPerformed

    private void txt_idbrngKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idbrngKeyPressed
        if (txt_idbrng.getForeground() != Color.black) {
            txt_idbrng.setText("");
        }
        txt_idbrng.setForeground(Color.black);
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            txt_jumlh.requestFocus();
        }
        if(evt.getKeyCode()== KeyEvent.VK_DOWN){
            txt_jumlh.requestFocus();
        }
        
    }//GEN-LAST:event_txt_idbrngKeyPressed

    private void txt_jumlhKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlhKeyPressed
        if (txt_jumlh.getForeground() != Color.black) {
            txt_jumlh.setText("");
        }
        txt_jumlh.setForeground(Color.black);
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btn_insertActionPerformed((new ActionEvent( evt.getSource(), evt.getID(),"Key Press proses")));
        }
         if(evt.getKeyCode()== KeyEvent.VK_UP){
            txt_idbrng.requestFocus();
        }
    }//GEN-LAST:event_txt_jumlhKeyPressed

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        if (txt_idbrng.getText().equals("") || txt_jumlh.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Isi Kolom ID dan Jumlah", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                List<tb_barang> list = new ArrayList<>();
                list = dao_barang.cari(Integer.parseInt(txt_idbrng.getText()));
                int x = Integer.parseInt(txt_jumlh.getText());
                if (list.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Barang yang anda cari tidak ditemukan","Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                for (tb_barang b : list) {
                    tbl_nota.setValueAt(b.getId(), row, 0);
                    tbl_nota.setValueAt(b.getNama_barang(), row, 1);
                    tbl_nota.setValueAt(txt_jumlh.getText(), row, 2);
                    int harga = b.getHarga() * Integer.parseInt(txt_jumlh.getText());
                    tbl_nota.setValueAt(harga, row, 3);
                    lbl_hrg.setText((Integer.parseInt(lbl_hrg.getText()) + harga) + "");
                }
                row++;
                txt_idbrng.setText("masukan ID Barang"); txt_idbrng.setForeground(Color.gray);
                txt_jumlh.setText("masukan jumlah Barang");txt_jumlh.setForeground(Color.gray);
                txt_idbrng.requestFocus();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"inputan Kolom ID dan jumlah salah","Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_btn_insertActionPerformed

    private void tbl_notaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_notaMouseClicked
        BTN_DLT.setEnabled(true);
    }//GEN-LAST:event_tbl_notaMouseClicked

    private void BTN_DLTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_DLTMouseReleased
        BTN_DLT.setEnabled(false);
    }//GEN-LAST:event_BTN_DLTMouseReleased

    private void BTN_DLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DLTActionPerformed
        try {
            int i = tbl_nota.getSelectedRow();
            int x = (int) tbl_nota.getValueAt(i, 3);
            if (x != 0) {
                lbl_hrg.setText((Integer.parseInt(lbl_hrg.getText()) - x) + "");
                tbl_nota.setValueAt(null, i, 0);
                tbl_nota.setValueAt(null, i, 1);
                tbl_nota.setValueAt(null, i, 2);
                tbl_nota.setValueAt(null, i, 3);
                while (tbl_nota.getValueAt(i + 1, 0) != null) {
                    tbl_nota.setValueAt(tbl_nota.getValueAt(i + 1, 0), i, 0);
                    tbl_nota.setValueAt(tbl_nota.getValueAt(i + 1, 1), i, 1);
                    tbl_nota.setValueAt(tbl_nota.getValueAt(i + 1, 2), i, 2);
                    tbl_nota.setValueAt(tbl_nota.getValueAt(i + 1, 3), i, 3);

                    tbl_nota.setValueAt(null, i + 1, 0);
                    tbl_nota.setValueAt(null, i + 1, 1);
                    tbl_nota.setValueAt(null, i + 1, 2);
                    tbl_nota.setValueAt(null, i + 1, 3);
                    i++;
                }
                row = i;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_BTN_DLTActionPerformed

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed
        try {
            Date t= new Date();
            String tanggal = (t.toGMTString()).substring(0,11);
            dao_transaksi.InsertData(Integer.parseInt(lbl_hrg.getText()), tanggal);
            listnota = dao_transaksi.searchData(tanggal);
            int id_nota = 0;    
            for (tb_nota n : listnota) {
                id_nota = n.getId_nota();
            }
            
            for (int i = 0; i < row; i++) {
                int id = (int) tbl_nota.getValueAt(i, 0);
                String jumlah = (String) tbl_nota.getValueAt(i, 2);
                x = dao_barang.cari(id);
                int stock = 0;
                for (tb_barang n : x) {
                    stock = n.getStok();
                }
                System.out.println(stock);
                int hsl = stock-Integer.parseInt(jumlah);
                dao_barang.update(hsl,id);
                int harga = (int) tbl_nota.getValueAt(i, 3);
                dao_detail_transaksi.Insert_dtl_transaksi(id_nota, id, Integer.parseInt(jumlah), harga);
            }
            tbl_nota.setModel(new DefaultTableModel(new String[]{"Kode Barang", "Nama Barang", "Jumlah", "Harga"}, 100));
            row = 0;
            lbl_hrg.setText("0");

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_subActionPerformed

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
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kasir().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_DLT;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_sub;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_hrg;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JTable tbl_nota;
    private javax.swing.JTextField txt_idbrng;
    private javax.swing.JTextField txt_jumlh;
    // End of variables declaration//GEN-END:variables
}
