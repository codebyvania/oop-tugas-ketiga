/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractInterface;

/**
 *
 * @author thinkpad
 */
abstract class Pesawat extends Transportasi{
    
    public Pesawat(String nama){
        super(nama);
    }
    
    abstract void kapasitas();
    
    void jumlahPenumpang(){
        System.out.println(nama + " dapat menampung 180 penumpang");
    }
}
