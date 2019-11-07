/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan56umurbarangantik;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarangAntik BA = new BarangAntik(234);
        Radio radio = new Radio(0);
        
        radio.setName("Radio AM");
        
        System.out.println("Nama Barang Antik : " + radio.getName());
        BA.tampilUmur();
    }
    
}
