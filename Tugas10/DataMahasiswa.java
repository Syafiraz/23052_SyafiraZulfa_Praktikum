/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;

/**
 *
 * @author Auriga
 */
public class DataMahasiswa {
    private String NIM;
    private String Nama;
    private String Alamat;
    private String MataKuliah;
    private double nilai1;
    private double nilai2;
    private double nilai3; // UTS
    private double nilai4;
    private double nilai5;
    
    // Constructor
    public DataMahasiswa(String NIM, String Nama, String Alamat, String MataKuliah) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.MataKuliah = MataKuliah;
    }
    
    public String getAlamat () {
        return Alamat;
    }
    public String getNIM() {
        return NIM;
    }
    public String getNama() {
        return Nama;
    }
    public String getMataKuliah() {
        return MataKuliah;
    }
    
    // Getter and Setter for each score
    public void setNilai1 (double nilail) { this.nilai1 = nilail; }
    public void setNilai2 (double nilai2) { this.nilai2 = nilai2; }
    public void setNilai3 (double nilai3) { this.nilai3 = nilai3; }
    public void setNilai4 (double nilai4) { this.nilai4 = nilai4; }
    public void setNilai5 (double nilai5) { this.nilai5 = nilai5; }
    public double getNilail() { return nilai1; }
    public double getNilai2() { return nilai2; }
    public double getNilai3() { return nilai3; }
    public double getNilai4() { return nilai4; }
    public double getNilai5() { return nilai5; }    

    public double calculateNilaiAkhir() {
        return (nilai1 * 0.10) + (nilai2 * 0.15) + (nilai3 * 0.25) + (nilai4 * 0.15) + (nilai5 * 0.35);
    }
    public double getNilaiAkhir() {
        return calculateNilaiAkhir();
    }
}
