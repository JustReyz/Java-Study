/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2;

import java.util.Scanner;

public class Penentu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Silahkan masukkan Angka: ");
        int angka = in.nextInt();
        String hasil = (angka % 2 == 0) ? (angka + " merupakan angka genap") : (angka + " merupakan angka ganjil");
        
        System.out.println(hasil);
    }
}
