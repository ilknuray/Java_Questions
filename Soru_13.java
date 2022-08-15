package tum_Sorular;

import java.util.Scanner;

public class Soru_13 {
    public static void main(String[] args) {
        //kullanicidan ismini soyismini alip asagidaki sekilde yazdirin
        //isminiz:Ilknur
        //soyisminiz:Yilmaz
        //kursumuza katiliminiz alinmistir tesekkur ederiz

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soy isminizi giriniz");
        String isim= sc.nextLine();
        String soyisim= sc.nextLine();

        System.out.println("isminiz :" + isim +"\nsoyisminiz :" +soyisim +"\nkursumuza kayit yaptirdiginiz icin tesekkur ederi");
    }
}
