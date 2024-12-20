/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;
import java.util.ArrayList;

/**
 *
 * @author Auriga
 */
public class InputData {
    ArrayList<DataMahasiswa> listmahasiswa;

    public InputData() {
        listmahasiswa = new ArrayList<>();
    }

    public void insertData(String NIM, String Nama, String Alamat, String MataKuliah) {
        DataMahasiswa dmhs = new DataMahasiswa(NIM, Nama, Alamat, MataKuliah);
        listmahasiswa.add(dmhs);
    }

    public ArrayList<DataMahasiswa> getALL() {
        return listmahasiswa;
    }

    public void deleteData(int index) {
        if (index >= 0 && index < listmahasiswa.size()) {
            listmahasiswa.remove(index);
        }
    }

    public void setNilai(int index, double nilai1, double nilai2, double nilai3, double nilai4, double nilai5) {
        if (index >= 0 && index < listmahasiswa.size()) {
            DataMahasiswa dmhs = listmahasiswa.get(index);
            dmhs.setNilai1(nilai1);
            dmhs.setNilai2(nilai2);
            dmhs.setNilai3(nilai3);
            dmhs.setNilai4(nilai4);
            dmhs.setNilai5(nilai5);
        }
    }

    public double getNilaiAkhir(int index) {
        if (index >= 0 && index < listmahasiswa.size()) {
            return listmahasiswa.get(index).calculateNilaiAkhir();
        }
        return 0;
    }
}
