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
public class Kaprodi extends Dosen {
    private String jurusan;
    public Kaprodi (String nidn, String nama, String jenisKelamin, String jurusan) {
        super (nidn, nama, jenisKelamin);
        this.jurusan = jurusan;
    }
    public void viewKaprodi() {
        System.out.println("Jurusan :"+jurusan);
    }
}
