package praktikum2;

import java.util.Scanner;

public class VolumeBalok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float vol, p, l, t;
        System.out.print("Selamat datang di kalkulator Volume Balok!\nPanjang balok: ");
        p = input.nextFloat();
        System.out.print("Lebar balok: ");
        l = input.nextFloat();
        System.out.print("Tinggi balok: ");
        t = input.nextFloat();
        vol = p*l*t;
        System.out.println("Volume balok tersebut adalah: " + vol);
        
    }
}
