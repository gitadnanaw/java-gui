/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lat200772;

import java.util.Scanner;

/**
 *
 * @author Adnan Wahabi
 */
public class LAT200772 {
    public static void main(String[] args)
   {
      int angka, balik = 0;
      System.out.println("Masukkan angka yang ingin dibalik : ");
      Scanner input = new Scanner(System.in);
      angka = input.nextInt();
      while( angka != 0 )
      {
          balik = balik * 10;
          balik = balik + angka%10;
          angka = angka/10;
      }
      System.out.println("Kebalikan dari angka tersebut adalah : " + balik);
   }
}