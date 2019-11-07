/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan54.koordinat;

/**
 *
 * @author user
 * Nama     : Andhyka Widariyanto
 * NIM      : 10117185
 * Kelas    : PBO-Ulang
 * Tugas    : Latihan 54 - Koordinat
 */
public class WarnaKoordinat extends Koordinat {
    //Atribute
    String namaWarna;
    
    //Construction
    WarnaKoordinat(int x, int y, String namaWarna){
        super (x,y);
        System.out.println("Warna Koordinat : "+namaWarna);
        System.out.println("Koordinat Sumbu x: "+x+", y : "+y);
    }
    
    //Function

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String parNamaWarna) {
        namaWarna = parNamaWarna;
    }
    
}
