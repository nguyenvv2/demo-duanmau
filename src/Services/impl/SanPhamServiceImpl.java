/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.SanPham;
import Reponsitories.SanPhamRepository;
import Services.SanPhamService;
import ViewModels.SanPhamViewModel;
import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public class SanPhamServiceImpl implements SanPhamService {

    private SanPhamRepository sanPhamRepository = new SanPhamRepository();

    @Override
    public ArrayList<SanPhamViewModel> getList() {
        return sanPhamRepository.getListSanPhamViewModel();
    }

    @Override
    public ArrayList<SanPham> getListSanPham() {
        return sanPhamRepository.getListSanPham();
    }

}
