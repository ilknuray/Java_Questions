package tum_Sorular;

import java.util.Scanner;

public class Soru_60 {
    public static void main(String[] args) {
        //kullanicidan pozitif bir rakama isteyin ve carpim tablosunu olusturun
        /*
        123
        246
        369
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();
        int sayi2= scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=sayi2 ; j++) {
                System.out.print(i*j);
            }
            System.out.println("");

        }



    }
}
