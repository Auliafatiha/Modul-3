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
public class React_alatelektro {
  public static void main (String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Alat Elektronik");
      System.out.println("1. Telivisi");
      System.out.println("2. Radio");
       System.out.print("Masukkan pilihan ");
      
      int pilihan = sc.nextInt();
      Alat_Elektronik alat;
      if (pilihan == 1){
          alat = new Televisi();  
      } else if(pilihan == 2){
          alat = new Radio();
      } else{
          System.out.println("Input pilihan tidak valid");
          return;
      }
      System.out.println("== Aksi ==");
      System.out.println("1. Menghidupkan");
      System.out.println("2. Matikan");
       System.out.print("Masukkan pilihan ");
      int aksi = sc.nextInt();
      if(aksi == 1){
          alat.hidupkan();   
      } else if(aksi == 2){
          alat.matikan();
      }else{
          System.out.println("Input pilihan aksi tidak valid");
      }
      sc.close();
  }  
}
