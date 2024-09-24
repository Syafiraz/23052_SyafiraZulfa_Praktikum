/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas4;

/**
 *
 * @author Auriga
 */
public class KubusBalokBeraksi {
    public static void main(String[] args) {
        Balok balok = new Balok(5, 3, 2);
        Kubus kubus = new Kubus(4);

        System.out.println("Balok:");
        System.out.println("Volume: " + balok.getVolume());
        System.out.println("Luas Permukaan: " + balok.getLuasPermukaan());

        System.out.println("\nKubus:");
        System.out.println("Volume: " + kubus.getVolume());
        System.out.println("Luas Permukaan: " + kubus.getLuasPermukaan());
    }
}
