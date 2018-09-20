/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author M. RAFI PUTRA
 */
public class DemoOverride2 {
    public static void main(String[] args) {
    B OBJ = new B();
    OBJ.setA(50);
    OBJ.setB(150);
    //akan memanggil method yang terdapat pada kelas A
    OBJ.tampilkanNilai();
    }
    
}
