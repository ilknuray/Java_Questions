package tum_Sorular;

import java.util.Scanner;

public class Soru_66 {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin ve tam bolenleri ve toplam kac tane olduklarini ekrana yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
         String sayac = "";

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                sayac+=i;



            }
        } System.out.print(sayac +" " + sayac.length());
    }
}