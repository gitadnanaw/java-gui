/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.no_2;

import java.util.Scanner;

/**
 *
 * @author wahab
 */
public class No_2 {

    public static void main (String args[]){
    Scanner masuk = new Scanner(System.in);{
        System.out.print("Masukkan kalimat: ");
        String string = masuk.nextLine();
        int[] array = new int[256];
        for (int i = 0; i < string.length(); i++) {
            array[string.charAt(i)]++;
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.println("Karakter paling banyak muncul adalah karakter = " + " ' " + (char) i + " ' ");
            }
        }
        }
    }
}
