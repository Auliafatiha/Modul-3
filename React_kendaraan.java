/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pratikum;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class React_kendaraan {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Kendaraan ===");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Masukkan pilihan Kendaraan");
        int pilihan = sc.nextInt();
        Kendaraan kendaraan;    
        if (pilihan == 1){
            kendaraan = new Mobil();
        } else if(pilihan == 2){
           kendaraan = new Motor();
        } else{
            System.out.println(" pilihan salah, ulangi kembalu");
            return;
        }
        System.out.println("== Aksi ==");
         System.out.println("1. Nyalakan Mesin");
          System.out.println("2. Matikan Mesin");
          System.out.print("Masukkan pilihan aksi");
          int aksi = sc.nextInt();
          if (aksi == 1){
              kendaraan.nyalakanMesin();
          }else if(aksi == 2){
              kendaraan.matikanMesin();
          }
        sc.close();
    }
    
}
