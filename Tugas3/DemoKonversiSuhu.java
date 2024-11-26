/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum3KonversiSuhu;

/**
 *
 * @author Auriga
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();

        // Konversi Celsius ke Fahrenheit
        System.out.println("Celsius 25 ke Fahrenheit: " + konversi.celciusToFahrenheit(25));

        // Konversi Celsius ke Reamur
        System.out.println("Celsius 25 ke Reamur: " + konversi.celciusToReamur(25));

        // Konversi Fahrenheit ke Reamur
        System.out.println("Fahrenheit 77 ke Reamur: " + konversi.fahrenheitToReamur(77));
    }
}

