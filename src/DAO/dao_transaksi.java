package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import ENTITY.tb_nota;
import KONEKSI.koneksi;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Aylwin
 */
public class dao_transaksi {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    tb_nota nota = null;
    
    public dao_transaksi() {
        /**
         * konstraktor
         */
        koneksi k = new koneksi();
        con = k.getConnection();
    }
    
    public List<tb_nota> lihat(){
        List<tb_nota> data = new ArrayList<>();
        try {
            ps = con.prepareStatement("SELECT * FROM tb_transaksi");
            rs = ps.executeQuery();
            while(rs.next()){
                nota = new tb_nota();
                nota.setId_nota(rs.getInt(1));
                nota.setTotal_harga(rs.getInt(2));
                nota.setTanggal(rs.getString(3));
                data.add(nota);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }
    
    public void InsertData(int total_harga, String tanggal) {
        try {
  //          INSERT INTO `tb_transaksi2`(`total harga`, `tanggal`) VALUES (12000,'18 Dec 2016')
            ps = con.prepareStatement("INSERT INTO `tb_transaksi`(`total harga`, `tanggal`) VALUES (" + total_harga + ", '"+tanggal+"')");
            ps.execute();
      
        } catch (SQLException ex) {
        }
    }
   
    public List<tb_nota> searchData(String tanggal) {
        List<tb_nota> data = new ArrayList<>();
        try {
            ps = con.prepareStatement("SELECT * FROM tb_transaksi WHERE tanggal= '"+tanggal+"'");
            rs = ps.executeQuery();
            while (rs.next()){
                nota = new tb_nota();
                nota.setId_nota(rs.getInt("ID"));
                nota.setTotal_harga(rs.getInt("total harga"));
                data.add(nota);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return data;
    }
    
    public List<tb_nota> cari(int ID){
        List<tb_nota> data = new ArrayList<>();
        try {
            ps = con.prepareStatement("SELECT * FROM tb_transaksi WHERE id="+ID);
            rs = ps.executeQuery();
            while(rs.next()){
                nota = new tb_nota();
                nota.setId_nota(rs.getInt("ID"));
                nota.setTotal_harga(rs.getInt("total harga"));
                data.add(nota);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return data;
    }
    
    public void delete(int x){
        try {
        ps = con.prepareStatement("DELETE FROM `tb_transaksi` WHERE ID ="+x);
        ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}

