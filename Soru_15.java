package tum_Sorular;

import java.util.Scanner;

public class Soru_15 {
    public static void main(String[] args) {
        //kullanicidan ismini alip bas harfini yazdirin
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= sc.nextLine();
        char ilkHarf=isim.charAt(0);
        System.out.println("isminizin ilk harfi : " +ilkHarf);
    }
}
