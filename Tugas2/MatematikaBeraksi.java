/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPraktikum2Mtk;

/**
 *
 * @author Auriga
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mathq = new Matematika();
        
        System.out.println("Pertambahan: 20 + 10 = " + mathq.pertambahan(20, 10));
        System.out.println("Pengurangan: 10 - 5 = " + mathq.pengurangan(10, 5));
        System.out.println("Perkalian: 10 * 3 = " + mathq.perkalian(10, 3));
        System.out.println("Pembagian: 21 / 2 = " + mathq.pembagian(21, 2));
    }
    
}
