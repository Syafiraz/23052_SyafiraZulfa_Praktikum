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
public class CalcuBMI {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input berat dan tinggi badan
        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggi = input.nextDouble();

        // Menghitung BMI
        double bmi = berat / (tinggi * tinggi);

        // Menentukan klasifikasi BMI
        String klasifikasi;
        if (bmi < 18.5) {
            klasifikasi = "Berat Badan Kurang";
        } else if (bmi <= 24.9) {
            klasifikasi = "Berat Badan Ideal";
        } else if (bmi <= 29.9) {
            klasifikasi = "Berat Badan Lebih";
        } else if (bmi <= 39.9) {
            klasifikasi = "Gemuk";
        } else {
            klasifikasi = "Sangat Gemuk";
        }

        System.out.printf("Nilai BMI: %.2f\n", bmi);
        System.out.println("Klasifikasi: " + klasifikasi);
    }
}
