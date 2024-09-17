/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum1Nilai;

/**
 *
 * @author Auriga
 */
public class DemoNilai {
    public static void main(String[] args) {

        Nilai nilai = new Nilai();

        nilai.NIM = "123456789";
        nilai.nama = "John Doe";
        nilai.nilaiAbsen = 85;
        nilai.nilaiTugas = 90;
        nilai.nilaiUTS = 80;
        nilai.nilaiUAS = 88;

        nilai.Nilai();

        nilai.CetakNilai();
    }
}

