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
public class React_Bank {
  public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("=== REKENING ===");
      System.out.println("1. Rekening Tabungan");
      System.out.println("2. Rekening Giro");
      System.out.println("3. Rekening Deposito");
      System.out.print("Masukkan pilihan Rekening: ");
      
      int pilihan = sc.nextInt();
      Rekening rekening;
      if (pilihan == 1){
          rekening = new RekeningTabungan(); 
          rekening.saldo = 2000000;
      }else if (pilihan == 2){
          rekening = new RekeningGiro();
          rekening.saldo = 5000000;
     }else if(pilihan == 3){
          rekening = new RekeningDeposito();
   }else{
         return;
     } 
  
      System.out.println("=== MENU ===");
       System.out.println("1.Setor Uang");
       System.out.println("2. Tarik uang");
       System.out.print("Masukkan pilihan menu: ");
       int menu = sc.nextInt();
       
       if(menu == 1){
           rekening.Setoruang();
       }else if(menu == 2){
           rekening.Tarikuang();
       }
//     
       sc.close();
  }
}

