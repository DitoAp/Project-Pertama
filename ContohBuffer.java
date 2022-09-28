/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpertama;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lab Aplikasi
 */
public class ContohBuffer {
    public static void main(String[] args) throws IOException {
        String nama,hobi ;
        int usia ;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr) ;
        System.out.print("Masukkan Nama   ="); 
        nama = br.readLine();
        System.out.println("Namamu adalah ="+nama);
        System.out.print("Masukkan Hobby   ="); 
        hobi = br.readLine();
        System.out.println("Hobbyku adalah ="+hobi);
        System.out.print("Masukkan Usia   ="); 
        usia = Integer.parseInt(br.readLine());
//        usia = br.read();
        System.out.println("Usiamu adalah ="+usia);
    }
}

       
