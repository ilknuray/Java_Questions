package tum_Sorular;

import java.util.Scanner;

public class Soru_31 {
    public static void main(String[] args) {
        //kullanicidan 4 basamakli bir sayi girmesini isteyin girdigi sayi 5e tam bolunuyorsa
        //son rakamini kontrol edin.son rakami 0 ise ekrana 5e bolunen cift sayi yazdirin.
        //son rakami 0degilse 5e bolunen tek sayi yazdirin.sayi 5e bolunmuyorsa
        //tekrar deneyin yazdirin


        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir sayi giriniz");
        int sayi = sc.nextInt();

        if (sayi%5==0) {
            if (sayi%10==0) {
                System.out.println("5'e bolunen cift sayi");
            } else if (sayi%10!=0) {
                System.out.println("5'e bolunen tek sayi");
            }
        } else if (sayi%5!=0) {
            System.out.println("tekrar deneyin");
        }
    }
}