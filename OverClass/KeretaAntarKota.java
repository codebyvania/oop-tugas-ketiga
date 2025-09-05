/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverClass;

/**
 *
 * @author thinkpad
 */
class KeretaAntarKota extends Kereta {
    
    @Override
    public void memesan(String tiket){
        System.out.println("Kereta Listrik untuk menuju : " + tiket);
    }
    
    @Override
    public void memesan(String tiket, int jumlah){
        System.out.println("Tiket Kereta Listrik sebanyak : "+ jumlah + " untuk menuju "+ tiket);
    }
    
    @Override
    public void memesan(String[] tiketSeluruh){
        System.out.println("Pesanan Tiket Kereta untuk beberapa Stasiun : "+ String.join(", ", tiketSeluruh));
    }
}
