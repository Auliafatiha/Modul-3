/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pratikum;

/**
 *
 * @author LENOVO
 */
 abstract class Kendaraan {
    public abstract void nyalakanMesin();
    public void matikanMesin(){
        System.out.println("Mobil dimatikan");
    }
}
    class Mobil extends Kendaraan{

    @Override
    public void nyalakanMesin() {
    System.out.println("Mobil menyala");
    }     
    }
    class Motor extends Kendaraan{

    @Override
    public void nyalakanMesin() {
        System.out.println("Motor dinyalakan");
    }
        
    }
