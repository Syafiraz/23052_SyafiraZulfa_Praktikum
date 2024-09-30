/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5;
import java.util.Scanner;
/**
 *
 * @author Auriga
 */
public class DiskonCust {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total Pembelian (Rp): ");
        double totalPembelian = input.nextDouble();

        double potongan;
        if (totalPembelian > 50000) {
            potongan = totalPembelian * 0.05;  
        } else {
            potongan = totalPembelian * 0.20;  
        }

        System.out.printf("Besarnya Potongan: Rp %.0f\n", potongan);
        System.out.printf("Jumlah yang harus dibayarkan: Rp %.0f\n", totalPembelian - potongan);
    }
}
