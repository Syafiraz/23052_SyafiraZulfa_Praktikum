/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author Auriga
 */
public class Kubus extends Shape {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    public double getLuasPermukaan() {
        return 6 * sisi * sisi;
    }
}
