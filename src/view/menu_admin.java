package view;

import DAO.dao_barang;
import DAO.dao_detail_transaksi;
import DAO.dao_transaksi;
import ENTITY.tb_barang;
import ENTITY.tb_detail_nota;
import ENTITY.tb_nota;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Aylwin
 */
public class menu_admin extends javax.swing.JFrame {
    
    List<tb_barang> list = new ArrayList<>();
    dao_barang daobarang = new dao_barang();
    
    List<tb_nota> listnt = new ArrayList<>();
    dao_transaksi daotransaksi = new dao_transaksi();
    
    List<tb_detail_nota> listdtl = new ArrayList<>();
    dao_detail_transaksi daodtltransaksi = new dao_detail_transaksi();
    
    

    public menu_admin() {
        initComponents();
        this.setLocationRelativeTo(this);
        refresh_brng();
        refresh_nota();
        refresh_dtlnota();
        Date date = new Date();
        jDateChoosermulai.setDate(date);
    }

    public void refresh_brng(){
        try {
            list = daobarang.lihatdata();
            String [][] data = new String[list.size()][5];
            int x =0;
            for (tb_barang n : list) {
                data[x][0] = String.valueOf(n.getId());
                data[x][1] = String.valueOf(n.getNama_barang());
                data[x][2] = String.valueOf(n.getStok());
                data[x][3] = String.valueOf(n.getHarga());
                data[x][4] = String.valueOf(n.getSupplier());
            x++;
            }
            tbl_barang.setModel(new DefaultTableModel(data, new String[]{"ID Barang", "Nama Barang", "Stock", "Harga","Suplier"}));
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void refresh_nota(){
        try {
            listnt = daotransaksi.lihat();
            String[][] data = new String [listnt.size()][3];
            int x = 0;
            for (tb_nota n : listnt) {
                data[x][0] = String.valueOf(n.getId_nota());
                data[x][1] = String.valueOf(n.getTotal_harga());
                data[x][2] = String.valueOf(n.getTanggal());
                x++;
            }
            tbl_nota.setModel(new DefaultTableModel(data, new String[]{"ID Nota", "Total Harga","Tanggal"}));
                        
        } catch (Exception e) {
            System.out.println(e);
        }       
    }    
        
        public void refresh_dtlnota(){
            try {
                listdtl = daodtltransaksi.lihat();
                String[][] data = new String [listdtl.size()][4];
                int x =0;
                for (tb_detail_nota n : listdtl) {
                    data[x][0] = String.valueOf(n.getId_nota());
                    data[x][1] = String.valueOf(n.getId());
                    data[x][2] = String.valueOf(n.getJumlah());
                    data[x][3] = String.valueOf(n.getHarga());
                    x++;
                }
                tbl_dtl_nota.setModel(new DefaultTableModel(data, new String[]{"ID_Nota","ID Barang", "Jumlah","Harga"}));
                                
            } catch (Exception e) {
                System.out.println(e);
            }
    
        }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ADD = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        nb = new javax.swing.JTextField();
        st = new javax.swing.JTextField();
        hg = new javax.swing.JTextField();
        sp = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_ib2 = new javax.swing.JTextField();
        txt_nb2 = new javax.swing.JTextField();
        txt_st2 = new javax.swing.JTextField();
        txt_hg2 = new javax.swing.JTextField();
        txt_sp2 = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_barang = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_cari_brng = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        delt_nota = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_nota = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_carinota = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        dlt_dtl = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_dtl_nota = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_cari_dtl = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jDateChoosermulai = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("MENU ADMIN");

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        jPanel4.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("ID Barang");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Nama Barang");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Stok");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Harga");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Supplier");

        ADD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ADD.setForeground(new java.awt.Color(255, 0, 0));
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        id.setForeground(new java.awt.Color(255, 0, 51));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nb)
                            .addComponent(st)
                            .addComponent(hg)
                            .addComponent(sp))))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ADD)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ADD)
                .addGap(33, 33, 33))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("ID Barang");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Nama Barang");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("Stok");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("Harga");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("Supplier");

        txt_ib2.setEnabled(false);
        txt_ib2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ib2ActionPerformed(evt);
            }
        });

        txt_nb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nb2ActionPerformed(evt);
            }
        });

        txt_hg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hg2ActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setForeground(new java.awt.Color(255, 0, 0));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_st2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hg2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sp2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ib2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nb2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update)
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ib2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nb2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel14))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_st2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_hg2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sp2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jPanel6.setForeground(new java.awt.Color(0, 0, 204));

        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 0, 0));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));

        tbl_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Barang", "Nama Barang", "Stok", "Harga", "Supplier"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_barang.getTableHeader().setReorderingAllowed(false);
        tbl_barang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbl_barangFocusLost(evt);
            }
        });
        tbl_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_barangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_barang);

        jLabel8.setText("PeDes Project 2016");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 645, Short.MAX_VALUE)
                        .addComponent(delete)
                        .addGap(31, 31, 31))))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(delete))
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel18.setText("TABEL BARANG");

        txt_cari_brng.setForeground(new java.awt.Color(153, 153, 153));
        txt_cari_brng.setText("masukan ID Barang");
        txt_cari_brng.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cari_brngFocusLost(evt);
            }
        });
        txt_cari_brng.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cari_brngKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cari_brngKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("SEARCH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(txt_cari_brng, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_cari_brng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tb_barang", jPanel1);

        jPanel15.setBackground(new java.awt.Color(204, 255, 204));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jPanel15.setForeground(new java.awt.Color(0, 0, 204));

        delt_nota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delt_nota.setForeground(new java.awt.Color(255, 0, 0));
        delt_nota.setText("Delete");
        delt_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delt_notaActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 204));

        tbl_nota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Nota", "Total Harga", "Tanggal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_nota.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tbl_nota);

        jLabel38.setText("PeDes Project 2016");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("TABEL NOTA");

        txt_carinota.setForeground(new java.awt.Color(204, 204, 204));
        txt_carinota.setText("masukan ID nota");
        txt_carinota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_carinotaFocusLost(evt);
            }
        });
        txt_carinota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_carinotaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_carinotaKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("SEARCH");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delt_nota))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txt_carinota, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel2)
                .addContainerGap(366, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_carinota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel38))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delt_nota)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tb_transaksi", jPanel15);

        jPanel16.setBackground(new java.awt.Color(204, 255, 204));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jPanel16.setForeground(new java.awt.Color(0, 0, 204));

        dlt_dtl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dlt_dtl.setForeground(new java.awt.Color(255, 0, 0));
        dlt_dtl.setText("Delete");
        dlt_dtl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlt_dtlActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 204));

        tbl_dtl_nota.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "ID Nota", "ID Barang", "Jumlah", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_dtl_nota.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tbl_dtl_nota);

        jLabel40.setText("PeDes Project 2016");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("TABEL DETAIL NOTA");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("SEARCH");

        txt_cari_dtl.setForeground(new java.awt.Color(204, 204, 204));
        txt_cari_dtl.setText("masukan ID nota");
        txt_cari_dtl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cari_dtlFocusLost(evt);
            }
        });
        txt_cari_dtl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cari_dtlKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cari_dtlKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dlt_dtl))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel9)
                        .addGap(0, 283, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(txt_cari_dtl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txt_cari_dtl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dlt_dtl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tb_detail_nota", jPanel16);

        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel20.setText("TANGGAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChoosermulai, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChoosermulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void dlt_dtlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlt_dtlActionPerformed
        int id = Integer.parseInt(tbl_dtl_nota.getValueAt(tbl_dtl_nota.getSelectedRow(), 0) + "");
        daodtltransaksi.delete(id);
        refresh_dtlnota();
    }//GEN-LAST:event_dlt_dtlActionPerformed

    private void delt_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delt_notaActionPerformed
       int id = Integer.parseInt(tbl_nota.getValueAt(tbl_nota.getSelectedRow(), 0) + "");
        daotransaksi.delete(id);
        refresh_nota();
    }//GEN-LAST:event_delt_notaActionPerformed

    private void tbl_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangMouseClicked
        txt_ib2.setText(tbl_barang.getValueAt(tbl_barang.getSelectedRow(),0)+"");
        txt_nb2.setText(tbl_barang.getValueAt(tbl_barang.getSelectedRow(),1)+"");
        txt_st2.setText(tbl_barang.getValueAt(tbl_barang.getSelectedRow(),2)+"");
        txt_hg2.setText(tbl_barang.getValueAt(tbl_barang.getSelectedRow(),3)+"");
        txt_sp2.setText(tbl_barang.getValueAt(tbl_barang.getSelectedRow(),4)+"");
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_barangMouseClicked

    private void tbl_barangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbl_barangFocusLost
        txt_ib2.setText("");
        txt_nb2.setText("");
        txt_st2.setText("");
        txt_hg2.setText("");
        txt_sp2.setText("");
    }//GEN-LAST:event_tbl_barangFocusLost

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int id = Integer.parseInt(tbl_barang.getValueAt(tbl_barang.getSelectedRow(), 0) + "");
        daobarang.delete(id);
        refresh_brng();
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int id = Integer.parseInt(txt_ib2.getText());
        String nama_barang = txt_nb2.getText();
        int stok = Integer.parseInt(txt_st2.getText());
        int harga = Integer.parseInt(txt_hg2.getText());
        String supplier = txt_sp2.getText();
        daobarang.update(id, nama_barang, stok, harga, supplier);
        txt_ib2.setText(null);
        txt_nb2.setText(null);
        txt_st2.setText(null);
        txt_hg2.setText(null);
        txt_sp2.setText(null);
        refresh_brng();
    }//GEN-LAST:event_updateActionPerformed

    private void txt_hg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hg2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hg2ActionPerformed

    private void txt_nb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nb2ActionPerformed

    private void txt_ib2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ib2ActionPerformed

    }//GEN-LAST:event_txt_ib2ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        id.setText("");
    }//GEN-LAST:event_idActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        daobarang.insert(Integer.parseInt(id.getText()),nb.getText(),Integer.parseInt(st.getText()),Integer.parseInt(hg.getText()),sp.getText());
        id.setText(""); nb.setText(""); st.setText(null); hg.setText(null); sp.setText(null);
        refresh_brng();
    }//GEN-LAST:event_ADDActionPerformed

    private void txt_cari_brngKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cari_brngKeyTyped
          if (txt_cari_brng.getForeground() != Color.BLACK) {
        txt_cari_brng.setText("");
        }
        txt_cari_brng.setForeground(Color.black);            
    }//GEN-LAST:event_txt_cari_brngKeyTyped

    private void txt_cari_brngKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cari_brngKeyReleased
        if(txt_cari_brng.getText().equalsIgnoreCase("")){
            refresh_brng();
        }else{
        try {
           list = daobarang.cari(Integer.parseInt(txt_cari_brng.getText()));
           String[][] data = new String[list.size()][5];
            int i= 0;
            
            for (tb_barang b : list){
                data[i][0] = String.valueOf(b.getId());
                data[i][1] = b.getNama_barang();
                data[i][2] = String.valueOf(b.getStok());
                data[i][3] = String.valueOf(b.getHarga());
                data[i][4] = String.valueOf(b.getSupplier());
                i++;
            }
            tbl_barang.setModel(new DefaultTableModel(data, new String[]{"ID Barang", "Nama Barang", "Stock", "Harga","Suplier"}));
        
        } catch (Exception e) {
        }}
        
    }//GEN-LAST:event_txt_cari_brngKeyReleased

    private void txt_cari_brngFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cari_brngFocusLost
       txt_cari_brng.setText("masukan ID Barang");
       txt_cari_brng.setForeground(Color.GRAY);
    }//GEN-LAST:event_txt_cari_brngFocusLost

    private void txt_carinotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_carinotaKeyReleased
        if(txt_carinota.getText().equalsIgnoreCase("")){
            refresh_nota();
        }else{
        try {
           listnt = daotransaksi.cari(Integer.parseInt(txt_carinota.getText()));
           String[][] data = new String[listnt.size()][3];
            int i= 0;
            
            for (tb_nota b : listnt){
                data[i][0] = String.valueOf(b.getId_nota());
                data[i][1] = String.valueOf(b.getTotal_harga());
                data[i][2] = String.valueOf(b.getTanggal());
                i++;
            }
            tbl_nota.setModel(new DefaultTableModel(data, new String[]{"ID Nota", "Total Harga","Tanggal"}));
        
        } catch (Exception e) {
            System.out.println(e);
        }}
        
    }//GEN-LAST:event_txt_carinotaKeyReleased

    private void txt_carinotaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_carinotaFocusLost
       txt_carinota.setText("masukan ID Nota");
       txt_carinota.setForeground(Color.GRAY);
    }//GEN-LAST:event_txt_carinotaFocusLost

    private void txt_carinotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_carinotaKeyPressed
        if (txt_carinota.getForeground() != Color.BLACK) {
        txt_carinota.setText("");
        }
        txt_carinota.setForeground(Color.black); 
    }//GEN-LAST:event_txt_carinotaKeyPressed

    private void txt_cari_dtlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cari_dtlKeyPressed
        if (txt_cari_dtl.getForeground() != Color.BLACK) {
        txt_cari_dtl.setText("");
        }
        txt_cari_dtl.setForeground(Color.black); 
    }//GEN-LAST:event_txt_cari_dtlKeyPressed

    private void txt_cari_dtlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cari_dtlFocusLost
        txt_cari_dtl.setText("masukan ID nota");
        txt_cari_dtl.setForeground(Color.gray);

    }//GEN-LAST:event_txt_cari_dtlFocusLost

    private void txt_cari_dtlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cari_dtlKeyReleased
        if (txt_cari_dtl.getText().equals("")) {
            refresh_dtlnota();
        }
        else{
        try {
            listdtl = daodtltransaksi.cari(Integer.parseInt(txt_cari_dtl.getText()));
            String[][] data = new String [listdtl.size()][5];
            int x =0;
            for (tb_detail_nota n :listdtl) {
                data [x][0] = String.valueOf(n.getId_nota());
                data [x][1] = String.valueOf(n.getId());
                data [x][2] = String.valueOf(n.getJumlah());
                data [x][3] = String.valueOf(n.getId_nota());
                data [x][4] = String.valueOf(n.getHarga());
                x++;
            }
            tbl_dtl_nota.setModel(new DefaultTableModel(data, new String[]{"ID Nota","ID Barang","Jumlah", "harga"}));
            
        } catch (Exception e) {
            System.out.println(e);
        }}
    }//GEN-LAST:event_txt_cari_dtlKeyReleased

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
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton delete;
    private javax.swing.JButton delt_nota;
    private javax.swing.JButton dlt_dtl;
    private javax.swing.JTextField hg;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChoosermulai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nb;
    private javax.swing.JTextField sp;
    private javax.swing.JTextField st;
    private javax.swing.JTable tbl_barang;
    private javax.swing.JTable tbl_dtl_nota;
    private javax.swing.JTable tbl_nota;
    private javax.swing.JTextField txt_cari_brng;
    private javax.swing.JTextField txt_cari_dtl;
    private javax.swing.JTextField txt_carinota;
    private javax.swing.JTextField txt_hg2;
    private javax.swing.JTextField txt_ib2;
    private javax.swing.JTextField txt_nb2;
    private javax.swing.JTextField txt_sp2;
    private javax.swing.JTextField txt_st2;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
