/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum2Bingo;


/**
 *
 * @author Auriga
 */
public class LaguBingo1 {
    // Teks lagu untuk setiap baris
    private String[] teks = {
        "There was a farmer who had a dog,",
        "And Bingo was his name-o.",
        "B-I-N-G-O",
        "B-I-N-G-O",
        "B-I-N-G-O",
        "And Bingo was his name-o."
    };

    public LaguBingo1() {
        tampilkanLagu(); // method panggil lagu
    }

    private void tampilkanLagu() {
        // Looping 5 kali
        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j < 2; j++) {
                System.out.println(teks[j]);
            }

            for (int j = 2; j < 5; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print("(clap)-"); 
                }
                for (int k = i; k < 5; k++) {
                    System.out.print(teks[j].charAt(k * 2)); 
                    if (k < 4) {
                        System.out.print("-"); 
                    }
                }
                System.out.println();
            }

            System.out.println(teks[1]);
            System.out.println(); // 
        }
    }
}