/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPraktikum3Matematika;

/**
 *
 * @author Auriga
 */
public class MatematikaInheritance {

    public static void main(String[] args) {
        Matematika2 mti = new Matematika2 ();
        
        System.out.println("Pertambahan 5 + 7: " + mti.pertambahan(5, 7));
        
        System.out.println("Pengurangan 5 - 7: " + mti.pengurangan(5, 7));

        System.out.println("Perkalian 4 * 6: " + mti.perkalian(4, 6));
        
        System.out.println("Pembagian 8 / 2: " + mti.pembagian(8, 2));

        System.out.println("Modulus 10 % 3: " + mti.modulus(10, 3));

    }
    
}
