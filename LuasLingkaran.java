/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2;

import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double pi = 3.141592;
        double hasil, jari;
        System.out.print("Program menghitung luas lingkaran\nNilai jari-jari Lingkaran: ");
        jari = in.nextDouble();
        hasil = pi*jari*jari;
        System.out.println("Luas Lingkaran Ialah: " + hasil);
        System.out.println("Hasil pembulatan luas lingkaran: " + Math.round(hasil));
    }
}
