/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tugas_Pratikum;

/**
 *
 * @author LENOVO
 */
public interface Alat_Elektronik {
    void hidupkan();
    void matikan();   
}
class Televisi implements Alat_Elektronik{
    @Override
    public void hidupkan() {
       System.out.println("Televisi dinyalakan");
    }
    @Override
    public void matikan() {
        System.out.println("Televisi dimatikan");
    } 
}
class Radio implements Alat_Elektronik{
    @Override
    public void hidupkan() {
       System.out.println("Radio dihidupkan");
    }
    @Override
    public void matikan() {
        System.out.println("Radio dimatikan");
    }
    
}
