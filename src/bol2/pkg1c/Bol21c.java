/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2.pkg1c;

import java.util.Scanner;

/**
 *
 * @author eltitotarzy
 */
public class Bol21c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //entrada por teclado
        float base,altura;
        Scanner obx = new Scanner(System.in);
        
        System.out.print("teclea base :");
        base =obx.nextFloat () ;
        System.out.print("teclea altura :");
         altura=obx.nextFloat () ;
       
        System.out.print("area =" + base*altura/2);
   
    }
    
}
