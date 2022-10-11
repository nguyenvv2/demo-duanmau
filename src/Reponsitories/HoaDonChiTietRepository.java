/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitories;

import DomainModels.HoaDon;
import DomainModels.HoaDonChiTiet;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author nguyenvv
 */
public class HoaDonChiTietRepository {

    private DBConnection dBConnection;

    public Boolean saveHoaDon(HoaDonChiTiet hoaDonChiTiet) {

        int checkInsert = 0;

        String sql = "insert into hoa_don_chi_tiet "
                + " (hoa_don_id, san_pham_id, so_luong, don_gia)"
                + " VALUES(?,?,?,?)";
        try (Connection con = dBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, hoaDonChiTiet.getIdHoaDon());
            ps.setObject(2, hoaDonChiTiet.getIdSanPham());
            ps.setObject(3, hoaDonChiTiet.getSoLuong());
            ps.setObject(4, hoaDonChiTiet.getDonGia());
            checkInsert = ps.executeUpdate();
            return checkInsert > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
