/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916      
 * KELAS    : IF10K
 * Deskripsi Program : Nilai terbesar dan terkecil
 */

public class PBO0610119916Latihan39NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Nilai val = new Nilai();
        
        System.out.print("Masukkan Nama Petugas: ");
        val.nama_petugas = scan.next();
        System.out.print("Masukkan Banyak Nilai Mahasiswa: ");
        val.jumlah_mhs = scan.nextInt();
        val.array = new int[val.jumlah_mhs];
        
        val.TerbesarTerkecil(val.nama_petugas, val.jumlah_mhs, val.array);

       
    }
    
}
