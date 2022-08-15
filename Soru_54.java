package tum_Sorular;

import java.util.Scanner;

public class Soru_54 {
    public static void main(String[] args) {
        /*kullanicidan ismini soyismini ve k.karti bilgilerini isteyin ve asagidaki gibi yazdirin
        isim-soyisim:i****** y*****
        kartno:**** **** **** 1234
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyIsim=scan.nextLine();
        System.out.println("kart numaranizi giriniz");
        String kartNo=scan.nextLine();


       String ilkHarf=isim.substring(0,1).toUpperCase();
       String isimGeriyeKalan=isim.substring(1).replaceAll("\\w","*");
       String ilkHarfsoyIsim=soyIsim.substring(0,1).toUpperCase();
       String soyIsimGeriyeKalan=soyIsim.substring(1).replaceAll("\\w","*");
        String sonDortkartNo=kartNo.substring(kartNo.length()-4);
        String kartGeriyeKalan=kartNo.replaceAll("\\d","*");
        System.out.println(ilkHarf + isimGeriyeKalan);
        System.out.println( ilkHarfsoyIsim+ soyIsimGeriyeKalan);
        System.out.println(kartGeriyeKalan + sonDortkartNo);
    }
}
