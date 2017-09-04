/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author ChaVaZaSRL
 */
public class gajah extends hewan{
    public static void testClassMethod(){
        System.out.println("The Class Methode in Hewan...");
    }
    public void testInstanceMethod(){
        System.out.println("The Instance Mthode in Hewan...");
    }
    public static void main(String[] args){
        gajah myGajah = new gajah();
        hewan myHewan = myGajah;
        hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
    
}
