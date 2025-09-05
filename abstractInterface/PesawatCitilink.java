/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractInterface;

/**
 *
 * @author thinkpad
 */
public class PesawatCitilink  extends PesawatKomersial implements Persiapan, Penerbangan, Pelayanan { 
    public PesawatCitilink(String nama){
        super(nama);
    }
    
    void kelas(){
        System.out.println(nama + " memiliki kelas ekonomi dan bisnis.");
    }
    
    void kapasitas(){
        System.out.println(nama + " memiliki kapasitas hingga 180 penumpang.");
    }
    
    void layananPenumpang(){
        System.out.println(nama + " memiliki pelayanan yang baik pada penumpang.");
    }
    
    public void mengecekMesin(){
        System.out.println(nama + " selalu mengecek mesin sebelum terbang.");
    }
    
    public void terbang(){
        System.out.println(nama + " dapat terbang dengan mulus di udara.");
    }
    
    public void hiburanPesawat(){
        System.out.println(nama + " memiliki layar hiburan untuk penumpang.");
    }
    
    public void mendarat(){
        System.out.println(nama + " dapat mendarat dengan aman.");
    }
}
