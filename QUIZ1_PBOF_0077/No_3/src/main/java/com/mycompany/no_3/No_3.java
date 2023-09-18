/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.no_3;

/**
 *
 * @author wahab
 */
public class No_3 {

    public class soal3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode penerbangan: ");
        String text = input.nextLine();
        
        String[] kata = text.split("\\-");
        
        String text1 = kata[0];
        String text2 = kata[1];
  
        
        System.out.println("Maskapai = "+text1);
        System.out.println("No.penerbangan = "+text2);

    }
}