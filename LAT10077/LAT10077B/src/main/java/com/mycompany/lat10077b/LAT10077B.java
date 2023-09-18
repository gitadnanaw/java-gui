/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lat10077b;

/**
 *
 * @author wahab
 */
public class LAT10077B {

    public static void main(String[] args) {
        StringBuffer kata1,kata2,kata3;
        System.out.println("Balik Kalimat\n");
        kata1 = new StringBuffer(" Sistem ");
        kata2 = new StringBuffer("Basis");
        kata3 = new StringBuffer(" Data ");
        System.out.println("Kalimat Sebelum terbalik = " + kata1 + kata2 + kata3);
        System.out.println("Kalimat Setelah terbalik = " + kata1.reverse() + kata2.reverse() + kata3.reverse());
    }
    
}