package tum_Sorular;

import java.util.Scanner;

public class Soru_10 {
    public static void main(String[] args) {
        //kullanicidan karenin bir kenar uzunlugunu alip alan ve cevresini hesaplayip yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("Karenin bir kenar uzunlugunu giriniz");
        double kenar= sc.nextDouble();

        double alan=kenar*kenar;
        double cevre=kenar*4;
        System.out.println("Cevre : " + cevre +"\nAlan : " + alan);
    }
}
