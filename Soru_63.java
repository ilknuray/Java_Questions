package tum_Sorular;

import java.util.Scanner;

public class Soru_63 {
    public static void main(String[] args) {
        //kullanicidan baslangic ve bitis degerleerini alin
        // aralarindaki tum cift sayilari while loop kullanarak ekrana yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen baslangic ve bitis degerleri giriniz");
        int bas = scan.nextInt();
        int bitis = scan.nextInt();
        int temps=bas;

        while (temps <= bitis) {
            if (temps % 2 == 0) {


                System.out.println(temps);
            }
             temps++;

        }
    }
}