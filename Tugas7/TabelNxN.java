/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas7;
import java.util.Scanner;
/**
 *
 * @author Auriga
 */
public class TabelNxN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n (1-10): ");
        int n = scanner.nextInt();

        // Membatasi n antara 1 dan 10
        n = Math.max(1, Math.min(n, 10));

        // Mencetak baris atas
        System.out.printf("%4s", "");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Mencetak garis pemisah
        System.out.print("   ");
        for (int i = 0; i <= n; i++) {
            System.out.print("----");
        }
        System.out.println();

        // Mencetak isi tabel
        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        scanner.close();
    }
    
}
