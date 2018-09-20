/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author M. RAFI PUTRA
 */
public class GuruSMKTelkom {
    public String Guru;
    public String Mapel;
    public int Usia;
    
    
    public GuruSMKTelkom(String Guru, String Mapel, int Usia) {
        this.Guru = Guru;
        this.Mapel = Mapel;
        this.Usia = Usia;
        
    }
    
    public void info() {
        System.out.println("Nama Guru: "+ this.Guru);
        System.out.println("Mengajar Di Bidang: "+ this.Mapel);
        System.out.println("Usia: "+ this.Usia);
        
    }
    
}
