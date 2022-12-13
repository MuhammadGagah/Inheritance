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
public class Ketua extends Dosen {
    private int tahunMulai;
    private int jabatanke;
    public Ketua(String nidn, String nama, String jenisKelamin, int tahunMulai, int jabatanke) {
        super(nidn, nama, jenisKelamin);
        this.tahunMulai = tahunMulai;
        this.jabatanke = jabatanke;
    }
            public void viewKetua() {
                System.out.println("Tahun mulai jabatan: "+tahunMulai);
                System.out.println("Jabatan Ketua Ke-:" +jabatanke);
            }
}
