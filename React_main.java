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
public class React_main {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        Hewan[] hewanarray = new Hewan[4];
        hewanarray[1] = new Anjing();
        hewanarray[2] = new Kucing();
        hewanarray[3] = new Burung();
        
         System.out.println("pilih Hewan ");
        System.out.println("1. Anjing");
        System.out.println("2. Kucing");
        System.out.println("3. Burung");
        
        System.out.println("Pilih hewan dari 1 hingga 3");
        int pilihan = sc.nextInt();
        
        if(pilihan >= 0 && pilihan < hewanarray.length){
            hewanarray[pilihan].suara();
        }else{
            System.out.println("Pilihan tidak valid");
        }
        sc.close();
    }

   
}
