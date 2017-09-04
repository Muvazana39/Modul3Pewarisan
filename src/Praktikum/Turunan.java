/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author ChaVaZaSRL
 */
public class Turunan extends Induk{

    public void Overload(String s)
    {   
        super.Overload();
        System.out.println("Method di dalam kelas Turunan");
        System.out.println("S : \"" + s + "\"");
    }
    public void Override()
    {
        super.Override();
        System.out.println("TestOverride. Method Di dalam Kelas Turunan");
    }
}
