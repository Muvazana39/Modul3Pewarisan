/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author ChaVaZaSRL
 */
public class employe extends person{
    private String nokaryawan;
    
    public employe(String nama, int usia, String nokaryawan) {
        super(nama, usia);
        this.nokaryawan = nokaryawan;
    }
    public void info(){
        System.out.println("No. Karyawan : "+this.nokaryawan);
        super.info();
    }
}
