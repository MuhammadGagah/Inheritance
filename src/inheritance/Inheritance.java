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
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ketua ketua = new Ketua ("00120018", "Dudung Saprudung", "Laki-laki", 2017,2);
        Kaprodi kaprodi = new Kaprodi ("12300011", "Yuyun Sapruyun", "Laki-laki", "Teknik Informatika");
        ketua.viewDosen();
        ketua.viewKetua();
        kaprodi.viewDosen();
        kaprodi.viewKaprodi ();
    }
    
}
