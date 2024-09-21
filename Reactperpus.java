/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pratikum;

/**
 *
 * @author LENOVO
 */
public class Reactperpus {
    public static void main(String[] args){
        Perpustakaan [] perpus =new Perpustakaan[4];
        perpus[0] = new Buku("Laut Bercerita", 2020,"Laila",230);
        perpus[1] = new Majalah("Dodo Anak Baik",2019,15,9);
        perpus[3] = new DVD("Qasidah",2015,5,"Islami");
        // menambah 1 array untuk ebook
        perpus[4] = new Ebook("Bumi Indah", 2021,"PDF");
       
        for(Perpustakaan Pustaka : perpus){
            Pustaka.info();
            System.out.println();
        }
    }
}
