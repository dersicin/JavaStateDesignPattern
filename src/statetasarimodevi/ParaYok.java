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
public class ParaYok implements Durum{

    Otomat otomat;
    
    public ParaYok(Otomat otomat){
        this.otomat = otomat;
    }
    
    @Override
    public void paraAt() {
        System.out.println("Para atıldı");
        otomat.paraAtildiMi = true;
        otomat.setOtomatDurum(otomat.getParaAtildiDurum());
    }

    @Override
    public void paraIadeAt() {
        System.out.println("Para zaten yok ki!");
    }

    @Override
    public void calis() {
        System.out.println("Parasız çalışmaz.");
    }

    @Override
    public void icecekVer() {
        System.out.println("Önce parayı görelim.");
    }
    
}
