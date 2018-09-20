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
public class MengajarDiKelas extends GuruSMKTelkom{
    private String guruKelas;

    public MengajarDiKelas(String guruKelas, String Guru, String Mapel, int Usia) {
        super(Guru, Mapel, Usia);
        this.guruKelas = guruKelas;
    }
    
    public void info() {
        System.out.println("Mengajar siswa kelas: "+ this.guruKelas);
        super.info();
    }
    
}
