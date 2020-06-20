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
public class IcecekYok implements Durum{

    Otomat otomat;
    
    public IcecekYok(Otomat otomat){
        this.otomat = otomat;
    }
    
    @Override
    public void paraAt() {
        System.out.println("Otomatta içecek yok.");
    }

    @Override
    public void paraIadeAt() {
        System.out.println("İçecek yok. Para girişine izin yok.");
    }
    

    @Override
    public void calis() {
        System.out.println("İçecek yok ki!");
    }

    @Override
    public void icecekVer() {
        System.out.println("İçecek yok!");
    }
    
}
