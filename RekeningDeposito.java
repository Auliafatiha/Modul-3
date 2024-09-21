/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pratikum;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
import java.text.DecimalFormat;
public class RekeningDeposito extends Rekening{
            public RekeningDeposito() {
               this.saldo = saldo;
            }
            @Override
            public void Setoruang() {
              Scanner sc = new Scanner(System.in);
              System.out.print("Masukkan nominal Setoran Awal: ");
              int nominal = sc.nextInt();
              if(nominal > 5000000){
              int nomawal = nominal;
             } else{
              System.out.println("Nominal setoran tidak valid");
             }  
              double  bunga = 0.24;
              System.out.println(" Jangka Waktu: ");
              System.out.println("1. 12 bulan: ");
              System.out.println("2. 6 bulan: ");
              System.out.println("3. 3 bulan: ");
              System.out.println("Masukkan Jangka Waktu: ");
               int jangkawaktu = sc.nextInt();
              if(jangkawaktu == 1){
                  saldo = (nominal * bunga) + nominal;
                  System.out.print("Nominal yang akan Anda dapat selama 12 bulan sebesar:  "+ saldo);
              }else if(jangkawaktu == 2){
                  saldo = nominal * (bunga /2) + nominal;
                  System.out.print("Nominal yang akan Anda dapat selama 6 bulan sebesar:  "+ saldo);
              }else if(jangkawaktu == 3){
                  saldo = nominal * (bunga/4) + nominal;
                  System.out.print("Nominal yang akan Anda dapat selama 3 bulan sebesar: "+ saldo);
              }else{
                  return;
              }
            }

            @Override
            public void Tarikuang() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan jangka waktu: ");
            int jangkawaktu  = sc.nextInt();
            System.out.print("Masukkan nominal Penarikan: ");
            int nominal = sc.nextInt();
             if(nominal > 0 && nominal <= saldo && jangkawaktu > 6){
             saldo -= nominal;
             System.out.print("Saldo Anda sebesar "+ saldo);
            }else if(nominal > saldo){
           System.out.println("Saldo tidak mencukupi");
            }else {
           System.out.println("Nominal Penarikan tidak valid");
       }
            }

//   
            
           
        
           
       } 
    

