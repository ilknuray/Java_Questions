package tum_Sorular;

import java.util.Scanner;

public class Soru_64 {
    public static void main(String[] args) {
        //kullanicidan baslangic ve bitis harflerini alin
        //baslangic harfinde baslayip bitis harfinde biten tum harfleribuyuk harf olarak ekranda yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen baslangic harfini giriniz");
        char ilkHarf=scan.next().charAt(0);
        char sonHarf=scan.next().charAt(0);
        char temps=ilkHarf;
        String buyult="";
        while (temps<=sonHarf){
            buyult=(temps+"").toUpperCase();
            System.out.println(buyult + " ");
            temps+=1;
        }

    }
}
