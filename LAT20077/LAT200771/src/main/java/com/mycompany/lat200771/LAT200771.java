/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lat200771;

import java.util.Scanner;

/**
 *
 * @author Adnan Wahabi
 */
public class LAT200771 {

    public static void main(String[] args) {
 int pertama, kedua, ketiga, terbesar;
 Scanner scan = new Scanner(System.in);
  
 System.out.print("Masukkan bilangan pertama = ");
    pertama = scan.nextInt();
  
 System.out.print("Masukkan bilangan kedua = ");
 kedua = scan.nextInt();
  
 System.out.print("Masukkan bilangan ketiga = ");
 ketiga = scan.nextInt();

 if(pertama>kedua && pertama>ketiga){
 terbesar = pertama;
 }else{
 if(kedua>ketiga){
 terbesar=kedua;
 }else{
 terbesar=ketiga;
 }
 }
  
 System.out.println("Bilangan terbesar adalah "+terbesar);
  
 }
 
}