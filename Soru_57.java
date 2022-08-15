package tum_Sorular;

import java.util.Scanner;

public class Soru_57 {
    public static void main(String[] args) {
       // kullanicidan iki sayi isteyin ve arasinda kalan sayilari yazdiran bir program yaziniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        toplamiBul(sayi1,sayi2);
    }

    public static void toplamiBul(int sayi1, int sayi2) {

        int toplam=0;

        for (int i =sayi1+1; i<=sayi2; i++) {
            toplam+=i;
            System.out.println(toplam);

        }
    }
}
  //kucuk sayinin dahil omasini istemiyorsak +1 ekleyebiliriz dahil olmasini istiyorsak gerek yok