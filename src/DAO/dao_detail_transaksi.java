package DAO;

import ENTITY.tb_detail_nota;
import KONEKSI.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aylwin
 */
public class dao_detail_transaksi {
    Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    tb_detail_nota dtl_nota;
    
    public dao_detail_transaksi(){
        koneksi k = new koneksi();
        con = k.getConnection();
    }
    
    public List<tb_detail_nota> lihat(){
        List<tb_detail_nota> data = new ArrayList<>();
        try {
           ps = con.prepareStatement("SELECT * FROM tb_detail_transaksi");
           rs = ps.executeQuery();
           while(rs.next()){
               dtl_nota = new tb_detail_nota();
               dtl_nota.setId_nota(rs.getInt(1));
               dtl_nota.setId(rs.getInt(2));
               dtl_nota.setJumlah(rs.getInt(3));
               dtl_nota.setHarga(rs.getInt(4));
               data.add(dtl_nota);   
           }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }
    
    
    public void Insert_dtl_transaksi(int id_transakasi, int id, int jumlah, int harga){
        try {
            ps = con.prepareStatement("INSERT INTO `tb_detail_transaksi`(`id_nota`, `id_barang`, `jumlah`, `harga`) "
                    + "VALUES ("+id_transakasi+","+id+","+jumlah+","+harga+")");
            ps.execute();
        } catch (Exception e) {
        }
    }
    
    public List<tb_detail_nota> cari(int ID){
        List<tb_detail_nota> data = new ArrayList<>();
        try {
        ps = con.prepareStatement("SELECT * FROM `tb_detail_transaksi` WHERE id_nota = "+ID);
        rs = ps.executeQuery();
        while(rs.next()){
            dtl_nota = new tb_detail_nota();
            dtl_nota.setId_nota(rs.getInt(1));
            dtl_nota.setId(rs.getInt(2));
            dtl_nota.setJumlah(rs.getInt(3));
            dtl_nota.setHarga(rs.getInt(4));
            data.add(dtl_nota);
        }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }
    
      public void delete(int x){
        try {
        ps = con.prepareStatement("DELETE FROM `tb_detail_transaksi` WHERE Id_nota ="+x);
        ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
