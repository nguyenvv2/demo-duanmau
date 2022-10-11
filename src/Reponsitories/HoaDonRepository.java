/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitories;

import DomainModels.HoaDon;
import Utilities.DBConnection;
import ViewModels.SanPhamViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nguyenvv
 */
public class HoaDonRepository {

    private DBConnection dBConnection;

    public Boolean saveHoaDon(HoaDon hoaDon) {

        int checkInsert = 0;

        String sql = "insert into hoa_don (ngay_tao, trang_thai) values (?, ?);";
        try (Connection con = dBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, hoaDon.getNgayTao());
            ps.setObject(2, hoaDon.getTrangThai());
            checkInsert = ps.executeUpdate();
            return checkInsert > 0;

        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public ArrayList<HoaDon> getListHoaDon() {
        ArrayList<HoaDon> list = new ArrayList<>();
        String sql = "SELECT * from hoa_don";
        try (Connection con = dBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon();
                hoaDon.setId(rs.getString(1));
                hoaDon.setNgayTao(rs.getDate(2));
                hoaDon.setTrangThai(rs.getInt(6));

                list.add(hoaDon);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return list;
    }
}
