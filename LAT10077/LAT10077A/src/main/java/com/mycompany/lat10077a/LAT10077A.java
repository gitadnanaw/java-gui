/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lat10077a;

import java.util.Random;

/**
 *
 * @author wahab
 */
public class LAT10077A {

    public static void main(String[] args) {
Random angkaRandom = new Random() ;
       int bil;
       int i;

      
      
       for (i = 1; i <= 10; i++) { 
           bil = angkaRandom.nextInt(100) + 1 ;
           System.out.print(bil + " ");
       } 
             
    }
}