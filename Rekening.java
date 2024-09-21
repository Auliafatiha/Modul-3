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
 abstract class Rekening {
    private int norek;
    protected double saldo;
    private int password;
    
    public Rekening(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Masukkan password: ");
      this.password = sc.nextInt();
              
      System.out.print("Masukkan Nomor Rekening: ");
      this.norek = sc.nextInt();
      this.saldo = saldo;
    }
    public abstract void Setoruang();
    public abstract void Tarikuang();

}

class RekeningTabungan extends Rekening{
    public RekeningTabungan(){
     this.saldo = saldo;
    }
    public void Setoruang() {
       Scanner sc = new Scanner(System.in);
       System.out.print("Masukkan nominal Setoran: ");
      int nominal = sc.nextInt();
       if(nominal > 0){
           saldo += nominal;
           System.out.println("Proses Tranksaksi Berhasil");
           System.out.print("Nominal Saldo Anda sebesar "+ saldo);
       } else{
           System.out.println("Nominal setoran tidak valid");
       }
    }
    @Override
    public void Tarikuang() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nominal Penarikan: ");
        int nominal = sc.nextInt();
       if(nominal > 0 && nominal <= saldo){
          saldo -= nominal;
          System.out.println("Proses Tranksaksi Berhasil");
          System.out.print("Nominal Saldo Anda sebesar "+ saldo);
       }else if(nominal > saldo){
           System.out.println("Saldo tidak mencukupi");
       }else {
           System.out.println("Nominal Penarikan tidak valid");
       }
    }

//    @Override
//    public void Infosaldo() {
//        System.out.print("Nominal Saldo Anda Sekarang sebesar: "+ saldo);
//    }
    
    

   
    
}
