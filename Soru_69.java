package tum_Sorular;

import java.util.Scanner;

public class Soru_69 {
    public static void main(String[] args) {
        //kullanicidan toplamak icin sayilar isteyin ve toplam 500e ulasincaya kadar istemeye devam edin
        //toplam 500e ulastiginda veya gectiginde toplami ve kac sayi girildigini yazin
        int toplam=0;
        int sayi=0;
        Scanner scan=new Scanner(System.in);
        while (sayi<500){
        System.out.println("lutfen toplamak icin sayilar giriniz");
       sayi= scan.nextInt();
       toplam += sayi;
        }
        System.out.println(toplam);

    }
}
