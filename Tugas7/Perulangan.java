/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;
import java.util.Scanner;
/**
 *
 * @author Auriga
 */
public class Perulangan {
    public static void main(String[] args) {
        
        System.out.println("a. Deret bilangan prima dan bukan prima dari 0-20:");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " bukan bilangan prima");
            }
        }
        
        System.out.println("\nb. Deret bilangan ganjil dan genap dari 0-20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }
        
        System.out.println("\nc. Huruf Z-A:");
        for (char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("\nd. Lagu \"Anak Ayam Turun N\":");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam (N): ");
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            System.out.println("Anak ayam turunlah " + i);
            if (i > 1) {
                System.out.println("Mati satu tinggallah " + (i - 1));
            } else {
                System.out.println("Mati satu tinggallah induknya");
            }
        }

        scanner.close();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

