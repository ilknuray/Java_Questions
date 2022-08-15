package tum_Sorular;

import java.util.Scanner;

public class Soru_39 {
    public static void main(String[] args) {

        //kullanicidan bir sayi girmesini isteyin girilen sayi
        //10 ise iki basamakli en kucuk sayi
        //100 ise uc basamakli en kucuk sayi
        //1000 ise dort basamakli en kucuk sayi
        //diger durumlarda girdigin sayiyi degistir yazin

        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= sc.nextInt();

        switch (sayi){
            case 1:
                System.out.println("iki basamakli en kucuk sayi");
                break;
            case  2:
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 3:
                System.out.println("dort basamakli en kucuk sayi");
            default:
                System.out.println("lutfen gecerli bir sayi yazdirin");

        }

    }
}
