package tum_Sorular;

import java.util.Scanner;

public class Soru_38 {
    public static void main(String[] args) {
        //kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin


        Scanner sc = new Scanner(System.in);
        System.out.println("haftanin kacinci gununde oldugumuzu giriniz");
        int gunNo = sc.nextInt();

        switch (gunNo) {

            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecerli bir numara giriniz");

        }
    }}
