package tum_Sorular;

import java.util.Scanner;

public class Soru_37 {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin uc basamkli ise uc basamakli degilse degil yazdirin

        Scanner sc=new Scanner(System.in);
        int sayi= sc.nextInt();

        String sonuc=(sayi>=100 && sayi<=999)?("uc basamakli sayi"):("uc basamakli degil");
        System.out.println(sonuc);
    }
}
