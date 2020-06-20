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
public class Otomat {
    Durum icecekSatildi;
    Durum paraYok;
    Durum paraAtildi;
    Durum icecekYok;
    
    Durum suankiDurum;
    
    int icecekSayac = 0;
    boolean paraAtildiMi = false;
    
    public Otomat(int icecekSayac){
        this.icecekSayac = icecekSayac;
        paraAtildi = new ParaAtildi(this);
        paraYok = new ParaYok(this);
        icecekSatildi = new IcecekSatildi(this);
        icecekYok = new IcecekYok(this);
        
        if(icecekSayac > 0){
            suankiDurum = paraYok;
        } 
    }
    
    public void setOtomatDurum(Durum suankiDurum){
        this.suankiDurum = suankiDurum;
    }
    public void paraAt(){
        suankiDurum.paraAt();
    }
    public void paraIadeEt(){
        suankiDurum.paraIadeAt();
    }
    public void calis(){
        suankiDurum.calis();
    }
    public void icecekVer(){
        suankiDurum.icecekVer();
    }
    public Durum getParaAtildiDurum() {
        return paraAtildi;
    }
    public Durum getParaYokDurum() {
        return paraYok;
    }
    public Durum getIcecekSatildiDurum() {
        return icecekSatildi;
    }
    public Durum getIcecekYokDurum() {
        return icecekYok;
    }
}
