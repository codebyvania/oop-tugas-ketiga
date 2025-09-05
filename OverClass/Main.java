/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverClass;

/**
 *
 * @author thinkpad
 */
public class Main {
    public static void main(String[] args){
        Kereta Lokal = new Kereta();
        Lokal.memesan("Stasiun Wonokromo");
        Lokal.memesan("Stasiun Pasar Turi", 3);
        Lokal.memesan(new String[] {"Stasiun Wonokromo", "Stasiun Pasar Turi"});
        
        System.out.println("");
        
        KeretaAntarKota Surabaya = new KeretaAntarKota();
        Surabaya.memesan("Stasiun Bandung");
        Surabaya.memesan("Stasiun Pasar Senen", 2);
        Surabaya.memesan(new String[]{"Stasiun Bandung", "Stasiun Pasar Senen"});
    }
}
