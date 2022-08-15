package tum_Sorular;

import java.util.Scanner;

public class Soru_53 {
    public static void main(String[] args) {
        /*kullanicidan bir sifre girmesini isteyinasagidaki sartlari sagliyorsa sifre basarili
        degilse yeni bir sifre girin yazdirin

        -ilk harf buyuk olmali
        -son harf kucuk olmali
        -sifre bosluk icermemeli
        -sifre uzunlugu en az 8 karakter olmali
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir sifre giriniz");
        String sifre = scan.nextLine();
        int kontrol = 0;

        if (sifre.length() >= 8) {
            kontrol++;
        }else{
            System.out.println("sifre en az 8 karakter olmali");

        } if (sifre.charAt(0) >= 'A' && (sifre.charAt(0) <= 'Z')) {

            kontrol++;
        } else {
            System.out.println("sifre buyuk harfle baslamali");

        }if  (!sifre.contains("\\s")){
            kontrol++;
        } else{
            System.out.println("sifre bosluk icermemeli");


        }  if (sifre.length() - 1 >= 'a' && sifre.length() - 1 <= 'z') {

            kontrol++;

        } else {

            System.out.println("son harf kucuk olmali");

        }if (kontrol==4){
            System.out.println("sifre basarili");
        }else{
            System.out.println("gecerli bir sifre giriniz");
        }
    }
}
