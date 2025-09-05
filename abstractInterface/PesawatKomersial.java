/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractInterface;

/**
 *
 * @author thinkpad
 */
abstract class PesawatKomersial extends Pesawat {
    
    public PesawatKomersial (String nama){
        super(nama);
    }
    
    abstract void layananPenumpang();
     
        
    void layarHiburan(){
        System.out.println("Pesawat Citilink memberikan layar hiuburan untuk penumpang");
    }
    }
    
