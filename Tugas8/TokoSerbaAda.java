/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8;
import java.util.Scanner;
/**
 *
 * @author Auriga
 */
public class TokoSerbaAda { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kodeBarang = {"a001", "a002", "a003"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {3000, 4000, 5000};

        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = input.nextInt();

        String[] inputKode = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            inputKode[i] = input.next();
            System.out.print("Masukkan jumlah beli: ");
            jumlahBeli[i] = input.nextInt();
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("******************************");
        System.out.println("No   Kode Barang   Nama Barang   Harga   Jumlah Beli   Jumlah Bayar");
        System.out.println("=====================================================================");

        int totalBayar = 0;

        for (int i = 0; i < jumlahItem; i++) {
            String kode = inputKode[i];
            int idxBarang = -1;

            for (int j = 0; j < kodeBarang.length; j++) {
                if (kode.equals(kodeBarang[j])) {
                    idxBarang = j;
                    break;
                }
            }

            if (idxBarang != -1) {
                int jumlahBayar = hargaBarang[idxBarang] * jumlahBeli[i];
                totalBayar += jumlahBayar;

                System.out.printf("%-4d %-13s %-13s %-7d %-13d %-13d\n", 
                    (i + 1), kodeBarang[idxBarang], namaBarang[idxBarang], 
                    hargaBarang[idxBarang], jumlahBeli[i], jumlahBayar);
            }
        }

        System.out.println("=====================================================================");
        System.out.println("Total Bayar: %-23" + totalBayar);
        System.out.println("=====================================================================");
    }
}

    

