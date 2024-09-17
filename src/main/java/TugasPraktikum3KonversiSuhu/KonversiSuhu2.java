/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum3KonversiSuhu;

/**
 *
 * @author Auriga
 */
public class KonversiSuhu2 extends KonversiSuhu {

    public double fahrenheitToReamur(double fahrenheit) {

        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius * 4 / 5;
    }
}
