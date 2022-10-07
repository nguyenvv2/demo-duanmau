/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitories;

import DomainModels.DanhMuc;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author nguyenvv
 */
public class DanhMucRepository {

    private DBConnection dBConnection;

    public ArrayList<DanhMuc> getListDanhMuc() {
        ArrayList<DanhMuc> list = new ArrayList<>();
        String sql = "select id, ten_danh_muc from danh_muc";
        try (Connection con = dBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMuc danhMuc = new DanhMuc();
                danhMuc.setId(rs.getString(1));
                danhMuc.setTenDanhMuc(rs.getString(2));
                list.add(danhMuc);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return list;
    }
}
