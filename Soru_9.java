package tum_Sorular;

import java.util.Scanner;

public class Soru_9 {
    public static void main(String[] args) {
        //kullanicidan iki tamsayi alip bu sayilarin toplam fark ver carpimlarini yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        int sayi1= sc.nextInt();
        int sayi2= sc.nextInt();

        int carpim=sayi1*sayi2;
        int toplam=sayi1+sayi2;
        int fark=sayi1-sayi2;
        System.out.println("carpim : " +carpim +"\ntoplam : " +toplam +"\nfark : " +fark);
    }
}
