package tum_Sorular;

import java.util.Scanner;

public class Soru_12 {
    public static void main(String[] args) {
        //dikdortgenler prizmasinin uzun kisa kenarlari ve yuksekligini isteyip
        //prizmanin hacmini hesaplayin ve yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen kisa uzun kenar uzunlugunu ve yuksekligi giriniz");
        double kisaKenar= sc.nextDouble();
        double uzunKenar= sc.nextDouble();
        double yukseklik= sc.nextDouble();

        double hacim=kisaKenar*uzunKenar*yukseklik;
        System.out.println("hacim : " +hacim);
    }
}
