/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractInterface;

/**
 *
 * @author thinkpad
 */
public class Main {
    public static void main(String []args){
       PesawatCitilink Indonesia = new PesawatCitilink("Citilink");
       
        System.out.println("DETAIL MASKAPAI");
        Indonesia.nama();
        Indonesia.kapasitas();
        Indonesia.kelas();
        
        System.out.println("");
        System.out.println("KELEBIHAN MASKAPAI");
        Indonesia.layananPenumpang();
        Indonesia.mengecekMesin();
        Indonesia.terbang();
        Indonesia.hiburanPesawat();
        Indonesia.mendarat();
    }
}
