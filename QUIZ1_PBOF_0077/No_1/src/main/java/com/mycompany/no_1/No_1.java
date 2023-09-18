/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.no_1;

import java.util.Scanner;

/**
 *
 * @author wahab
 */
public class No_1 {

    public static void main (String args[]){
        Scanner digit = new Scanner (System.in);
        long angka;
        int itung = 0;
        System.out.println("Masukkan angka : ");
        angka = digit.nextLong();
        while (angka > 0) {
        angka = angka / 10;
        itung++;
        }
        {
            System.out.println ("Jumlah digitnya adalah = " + itung);
           
        }
    }
}