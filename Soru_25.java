package tum_Sorular;

import java.util.Scanner;

public class Soru_25 {
    public static void main(String[] args) {

        //kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf mi degilmi
        //oldugunu yazdirin


        Scanner sc = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char karakter = sc.next().charAt(0);

        if (karakter>='a' && karakter <= 'z') {
            System.out.println("harf");
        }else if( karakter>='A'&& karakter<='Z') {
            System.out.println("harf");
        } else {
            System.out.println("harf degil");
        }
    }
}