/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pratikum;

/**
 *
 * @author LENOVO
 */
abstract class  Perpustakaan {
    String judul;
     int tahun;
    public Perpustakaan(String judul, int tahun){
        this.judul = judul;
        this.tahun = tahun;
    }
    public abstract void info();
    
}


class Buku extends Perpustakaan{
    private String pengarang;
    private int jumlah;
    
    public Buku(String judul, int tahun, String pengarang, int jumlah) {
        super(judul, tahun);
        this.jumlah = jumlah;
        this.pengarang = pengarang;
    }
    public void info(){
    System.out.println("Judul: "+ judul +" tahun: " + tahun +" page: " + jumlah +" pengarang: " + pengarang);
    
}
}
class Majalah extends Perpustakaan{
    private int edisi;
    private int vol;
    public Majalah(String judul, int tahun,int edisi,int vol) {
        super(judul, tahun);
        this.edisi = edisi;
        this.vol = vol;
    } 
    public void info(){
    System.out.println("Judul: " + judul +" tahun: " + tahun + " Edisi: " + edisi +" volume: " + vol);
}
}
class DVD extends Perpustakaan{
    private int durasi;
    private String genre;
    public DVD(String judul, int tahun,int durasi,String genre) {
        super(judul, tahun);
        
        this.durasi = durasi;
        this.genre = genre;
    }
    public void info(){
    System.out.println("Judul: " + judul +" tahun: " + tahun +" durasi: " + durasi +" genre: "+ genre);

} 
}
// untuk menambahkan item Ebook buat kelas baru
class Ebook extends Perpustakaan{
    private String tipe;
    public Ebook(String judul, int tahun, String tipe) {
        super(judul, tahun);
        this.tipe = tipe;
    }

    @Override
    public void info() {
       System.out.println("Judul: " + judul +" tahun: " + tahun +" Tipe: " +tipe );

    }
    
}
