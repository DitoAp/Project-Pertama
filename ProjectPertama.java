/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpertama;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class ProjectPertama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nik, nama, tmpLahir, tglLahir, alamat, jeniskelamin ;
        int usia ;
        Scanner in = new Scanner(System.in) ;
        System.out.println("Masukkan NIK : ");
        nik=in.nextLine();
        System.out.println("Masukkan Nama : ");
        nama=in.nextLine();
        System.out.println("Masukkan Tempat Lahir : ");
        tmpLahir=in.nextLine();
        System.out.println("Masukkan Tanggal Lahir : ");
        tglLahir=in.nextLine();
        System.out.println("Masukkan Alamat : ");
        alamat=in.nextLine();
        System.out.println("Masukkan Jenis Kelamin [L/P]: ");
        jeniskelamin=in.nextLine();
        System.out.println("Masukkan Usia : ");
        usia=in.nextInt();
        System.out.println("Identitas Pribadi Kamu");
        System.out.println("======================");
        System.out.println("NIK     = " +nik);
        System.out.println("Nama    = " +nama);
        System.out.println("Tempat, Tanggal Lahir   =" +tmpLahir + ""+tglLahir);
        System.out.println("Alamat  ="+alamat);
        System.out.println("Jenis Kelamin   ="+jeniskelamin);        
        System.out.println("Usia    ="+usia);
//        String nama = "Dito" ;
//        int usia = 20 ;
//        char jeniskelamin = 'L';
//        String nik = "35056323563265215212" ;
//        String temlahir = "Jember", tgllahir = "07-10-2002" ;
//        double bb = 60 ;
//        String hobi = "Sepak Bola, Membaca, Memuncak, dan Mencintaimu" ;
//        System.out.println("Hello World");
//        System.out.println("Namaku :" + nama);
//        System.out.println("Usiaku : " + usia);
//        System.out.println("JenisKelaminku : " + jeniskelamin);
//        System.out.format("Tempat, Tanggal Lahir = %s %s %n",temlahir,tgllahir) ;
//        System.out.format("jeniskelaminku = %s %n",jeniskelamin);
//        System.out.println("NIK :" + nik);
//        System.out.println("Berat Badan :" + bb);
//        System.out.println("Hobby :" + hobi);
     
        
    }
    
}
