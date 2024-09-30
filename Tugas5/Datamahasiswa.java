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

public class Datamahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NPM: ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.30 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);

        char nilai;
        String keterangan;
        if (nilaiAkhir <= 45) {
            nilai = 'E';
            keterangan = "KURANG SEKALI";
        } else if (nilaiAkhir <= 55) {
            nilai = 'D';
            keterangan = "KURANG";
        } else if (nilaiAkhir <= 65) {
            nilai = 'C';
            keterangan = "CUKUP";
        } else if (nilaiAkhir <= 75) {
            nilai = 'B';
            keterangan = "BAIK";
        } else {
            nilai = 'A';
            keterangan = "ISTIMEWA";
        }

        // Output data
        System.out.println("\nTampilan Output:");
        System.out.println("NPM: " + npm);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.printf("Nilai Rata-rata: %.2f\n", nilaiAkhir);
        System.out.println("Grade: " + nilai);
        System.out.println("Keterangan: " + keterangan);
    }
}
