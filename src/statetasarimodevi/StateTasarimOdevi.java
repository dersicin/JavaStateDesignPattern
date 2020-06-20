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
public class StateTasarimOdevi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Output a dönen açıklamaları slaytta nasıl yazılmışsa aynen olduğu gibi kodladım.
        //yine fonksiyonları da slaytta olduğu gibi nasıl çalışıyorsa öyle kodladım.
        //fakat bazı kısımalarını kendimce düzenledim.
        
        Otomat otomat = new Otomat(2);
        
        otomat.icecekVer();   
        otomat.calis(); 
        otomat.paraAt();  
        otomat.icecekVer();  
        otomat.calis();
        otomat.icecekVer();
        otomat.calis(); 
        otomat.calis();  
        otomat.icecekVer();
        otomat.paraAt();
        otomat.calis();
        otomat.icecekVer();
        otomat.paraAt();
        
        
    }
    
}
