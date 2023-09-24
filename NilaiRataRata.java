/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2;
public class NilaiRataRata {
    public static void main(String[] args) {
        double a = 17;
        double b = 22;
        double c = 31;
        double d = 43;
        double nilaiRata = (a+b+c+d)/4;
        System.out.println("Hasil nilai rata-rata tanpa pembulatan ialah: " + nilaiRata);
        System.out.println("Nilai rata-rata jika di bulatkan: " + Math.round(nilaiRata));
    }
}
