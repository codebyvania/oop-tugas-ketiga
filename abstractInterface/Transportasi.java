/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractInterface;

/**
 *
 * @author thinkpad
 */
abstract class Transportasi {
    String nama;
    public Transportasi(String nama){
        this.nama = nama;
    }
    abstract void kelas();

    void nama(){
        System.out.println("Nama Pesawat : "+ nama);
    }
}
