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
public class RekeningGiro extends Rekening {
        public RekeningGiro(){ 
           this.saldo = saldo;
        }
        @Override
        public void Setoruang() {
          Scanner sc = new Scanner(System.in); 
          System.out.print("Masukkan nominal Setoran: ");
          int nominal = sc.nextInt();
          if (nominal >= 1000000){
              saldo+= nominal;
              System.out.print("Nominal Saldo Anda sebesar "+ saldo);
          }else if (nominal < 1000000){
//             System.out.println("Nominal setoran tidak valid");
             System.out.println("Apakah Anda Ingin Melanjutkan? ");
             System.out.println("1. Iya ");
             System.out.println("2. Tidak ");
             
             int lanjutan = sc.nextInt();
             if (lanjutan == 1 ){
                 saldo = saldo + nominal - 150000;
                 System.out.print("Nominal Saldo Anda sebesar "+ saldo);
             }else{
                 return;               
             }
          }          
        }
        @Override
        public void Tarikuang() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan nominal Setoran: ");
            int nominal = sc.nextInt();
            if(saldo <= 1000000 && nominal < saldo){
                saldo-= nominal;
                System.out.print("Nominal Saldo Anda sebesar "+ saldo);
            }else {
               System.out.println("Saldo tidak mencukupi"); 
            }
           
        }

    
}
