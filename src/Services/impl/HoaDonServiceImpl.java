/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.HoaDon;
import Reponsitories.HoaDonRepository;
import Services.HoaDonService;

/**
 *
 * @author nguyenvv
 */
public class HoaDonServiceImpl implements HoaDonService{
    
    private HoaDonRepository hoaDonRepository = new HoaDonRepository();

    @Override
    public Boolean saveHoaDon(HoaDon hoaDon) {
        if (hoaDon.getTrangThai()==3) {
            System.out.println("tranjg thai khong =3");
        }
        return hoaDonRepository.saveHoaDon(hoaDon);
    }
    
}
