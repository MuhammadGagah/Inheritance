/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author muhammad
 */
public class Dosen {
    private String nidn;
    private String nama;
    private String jenisKelamin;
    public Dosen(String nidn, String nama, String jenisKelamin) {
        this.nidn = nidn;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }
    public void viewDosen() {
        System.out.println("NIDN : " + nidn);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
    }
}
