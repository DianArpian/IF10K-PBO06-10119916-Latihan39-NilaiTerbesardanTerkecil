/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class Nilai {
     public String nama_petugas;
    public int maksimum, minimum, jumlah_mhs, i, array[];
    
    public void TerbesarTerkecil(String nama, int jlh, int arr[]){
     Scanner scan = new Scanner(System.in);
     for(i = 0; i < jlh; i++) {
          System.out.print("Masukan Nilai Mahasiswa Ke-"+ (i+1) +" = " );
          arr[i] = scan.nextInt();
        }
        maksimum = arr[0];        
        minimum = arr[0];

        for(i = 0; i < jlh; i++) {
          if (arr[i] > maksimum){
            maksimum = arr[i];
          }
          else if(arr[i] < minimum){
              minimum = arr[i];  
            }  
        }
        
        System.out.println();
        System.out.println("---------- Hasil Nilai Mahasiswa -----------");

        for(i = 0; i < jlh; i++) {
          System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " " + arr[i] );
          
        }        
        System.out.println();
        System.out.println("Nilai Terbesar adalah " + maksimum);
        System.out.println("Nilai Terkecil adalah " + minimum);        
        
        System.out.println();        
        System.out.println("Petugas : " + nama);

    }
}

