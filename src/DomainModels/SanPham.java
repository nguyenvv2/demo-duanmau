/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author hangnt
 */
public class SanPham {
    private String id;
    
    private String tenSanPhamString;
    
    private String mieuTa;
    
    private Double giaNhap;
    
    private Double giaBan;
    
    private int soLuong;

    public SanPham() {
    }

    public SanPham(String id, String tenSanPhamString, String mieuTa, Double giaNhap, Double giaBan, int soLuong) {
        this.id = id;
        this.tenSanPhamString = tenSanPhamString;
        this.mieuTa = mieuTa;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSanPhamString() {
        return tenSanPhamString;
    }

    public void setTenSanPhamString(String tenSanPhamString) {
        this.tenSanPhamString = tenSanPhamString;
    }

    public String getMieuTa() {
        return mieuTa;
    }

    public void setMieuTa(String mieuTa) {
        this.mieuTa = mieuTa;
    }

    public Double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
