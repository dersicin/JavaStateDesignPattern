/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statetasarimodevi;

/**
 *
 * @author lenovo
 */
public class ParaAtildi implements Durum{

    Otomat otomat;
    
    public ParaAtildi(Otomat otomat){
        this.otomat = otomat;
    }
    
    @Override
    public void paraAt() {
        System.out.println("Para zaten atıldı");
    }

    @Override
    public void paraIadeAt() {
        System.out.println("Para iade edildi.");
        otomat.setOtomatDurum(otomat.getParaYokDurum());
    }

    @Override
    public void calis() {
        System.out.println("Çalışıyor.");
        otomat.setOtomatDurum(otomat.getIcecekSatildiDurum());
    }

    @Override
    public void icecekVer() {
        System.out.println("İçecek verilemedi.");

    }
}
