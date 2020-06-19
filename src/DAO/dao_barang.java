package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import ENTITY.tb_barang;
import KONEKSI.koneksi;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class dao_barang {

    private Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    tb_barang barang = null;

    public dao_barang() {
        koneksi k = new koneksi();
        con = k.getConnection();
    }

    public List<tb_barang> lihatdata() {
        List<tb_barang> data = new ArrayList<>();
        try {
            ps = con.prepareStatement("SELECT * FROM tb_barang");
            rs = ps.executeQuery();
            while (rs.next()) {
                barang = new tb_barang();
                barang.setId(rs.getInt(1));
                barang.setNama_barang(rs.getString(2));
                barang.setStok(rs.getInt(3));
                barang.setHarga(rs.getInt(4));
                barang.setSupplier(rs.getString(5));
                data.add(barang);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return data;
    }

    public List<tb_barang> cari(String nama) {
        List<tb_barang> data = new ArrayList<>();
        try {
            ps = con.prepareStatement("SELECT * FROM tb_barang WHERE nama_barang LIKE '%" + nama + "%'");
            rs = ps.executeQuery();
            while (rs.next()) {
                barang = new tb_barang();
                barang.setId(rs.getInt(1));
                barang.setNama_barang(rs.getString(2));
                barang.setStok(rs.getInt(3));
                barang.setHarga(rs.getInt(4));
                barang.setSupplier(rs.getString(5));
                data.add(barang);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return data;
    }

    public List<tb_barang> cari(int id) {
        List<tb_barang> data = new ArrayList<>();
        try {
            ps = con.prepareStatement("SELECT * FROM tb_barang WHERE id=" +id);
            rs = ps.executeQuery();
            while (rs.next()) {
                barang = new tb_barang();
                barang.setId(rs.getInt(1));
                barang.setNama_barang(rs.getString(2));
                barang.setStok(rs.getInt(3));
                barang.setHarga(rs.getInt(4));
                barang.setSupplier(rs.getString(5));
                data.add(barang);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return data;
    }

    public void update(int stock, int id) {
        try {
            ps = con.prepareStatement("UPDATE tb_barang SET stok ="
                    +stock+" WHERE id="+id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void update (int id,String nama, int stok, int harga, String supp ){
        try {
            ps = con.prepareStatement("UPDATE `tb_barang` SET `id`="+id+",`nama_barang`='"+nama+"',`stok`="+
                    stok+",`harga`="+harga+",`supplier`='"+supp+"' WHERE `id`="+id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }
    
    public void insert(int id, String nama_barang, int stok, int harga,  String supplier){
    try {
            ps = con.prepareStatement("INSERT INTO tb_barang (id, nama_barang, stok, harga, supplier)"
                    + "VALUES ("+id+",'"+nama_barang+"',"+stok+","+harga+",'"+supplier+"')");
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public void delete(int id){
        try {
            ps = con.prepareStatement("DELETE FROM `tb_barang` WHERE `id`="+id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }


}
