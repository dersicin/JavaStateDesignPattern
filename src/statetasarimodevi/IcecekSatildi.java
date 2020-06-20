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
public class IcecekSatildi implements Durum{

    Otomat otomat;
    
    public IcecekSatildi(Otomat otomat){
        this.otomat = otomat;
    }
    
    @Override
    public void paraAt() {
        System.out.println("Lütfen bekleyin.İçecek hazırlanıyor.");
        otomat.paraAtildiMi = true;
        otomat.setOtomatDurum(otomat.getParaAtildiDurum());
    }

    @Override
    public void paraIadeAt() {
        System.out.println("İçecek almıştın zaten");
    }

    @Override
    public void calis() {
        System.out.println("Kimi kandırıyorsun. 1 parayla 1 içecek alabilirsin");
    }

    @Override
    public void icecekVer() {
        if(otomat.icecekSayac == 0){
            System.out.println("İçecek yok!");
            otomat.setOtomatDurum(otomat.getIcecekYokDurum());
        }
        else{
            if(otomat.paraAtildiMi == true){
                System.out.println("İçecek geliyor");
                otomat.icecekSayac = otomat.icecekSayac - 1;
                otomat.paraAtildiMi = false;
            }
            else{
                System.out.println("Yeni bir içecek alabilmeniz için tekrardan para atmanız gerekmekte!");
                otomat.setOtomatDurum(otomat.getParaYokDurum());
            }    
            }   
        }
    } 
