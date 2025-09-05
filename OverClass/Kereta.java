/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverClass;

/**
 *
 * @author thinkpad
 */
class Kereta {
    public void memesan (String tiket ){
        System.out.println("Memesan tiket : "+ tiket);
    }
    
    public void memesan (String tiket, int jumlah){
        System.out.println("Memesan " + tiket + " sebanyak "+ tiket);
    }
    
    public void memesan (String[] tiketSeluruh){
        System.out.println("Memesan beberapa tiket : "+ String.join(", ", tiketSeluruh));
    }
}
