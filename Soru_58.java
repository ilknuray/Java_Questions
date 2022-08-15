package tum_Sorular;

import java.util.Scanner;

public class Soru_58 {
    public static void main(String[] args) {
       // kullanicidan 10 dan kucuk bir sayi isteyin ve faktoryelini bulun
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 10dan kucuk bir sayi giriniz");
        int sayi= scan.nextInt();

        faktoriyel(sayi);

    }

    public static void faktoriyel(int sayi) {

        int faktoriyel=1;
        for (int i = 1; i <=sayi; i++) {
            faktoriyel += faktoriyel * i;
        }
            System.out.print(faktoriyel);

        }
    }

