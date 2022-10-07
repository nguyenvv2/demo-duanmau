/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.DanhMuc;
import Reponsitories.DanhMucRepository;
import Services.DanhMucService;
import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public class DanhMucServiceImpl implements DanhMucService{

    private DanhMucRepository danhMucRepository = new DanhMucRepository();
    
    @Override
    public ArrayList<DanhMuc> getList() {
        return danhMucRepository.getListDanhMuc();
    }
    
}
