package tum_Sorular;

import java.util.Scanner;

public class Soru_14 {
    public static void main(String[] args) {
        //kullanicidan ismini ve soyismini alip
        //isim-soyisim : ilknur yilmaz
        //seklinde yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi girniz" );
        String isim= sc.nextLine();
        String soyisim= sc.nextLine();
        System.out.println("isim-soyisim : " +isim +" " +soyisim);
    }
}
