package tum_Sorular;

import java.util.Scanner;

public class Soru_22 {
    public static void main(String[] args) {
        //kullanicidan gun isimlerinden birini ilk harfini girmesini isteyin
        //ve gun isimlerini yazdirin

        Scanner sc = new Scanner(System.in);
        System.out.println("Gun isimlerinin ilk harfini giriniz");
        String ilkHarf = sc.nextLine();

        if (ilkHarf.toUpperCase().contains("P")) {
            System.out.println("pazartesi,persembe,pazar");

        } else if (ilkHarf.toUpperCase().contains("C")) {
            System.out.println("carsamba,cuma,cumartesi");
        } else {
            System.out.println("sali");

        }
    }
}
