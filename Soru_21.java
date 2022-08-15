package tum_Sorular;

import java.util.Scanner;

public class Soru_21 {
    public static void main(String[] args) {
        //kullanicidan dort basamakli bir sayi alin ve rakamlar toplamini hesaplayin

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir tamsayi giriniz");
        int sayi= sc.nextInt();

        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int ilkGirilenSayi=sayi;

        birlerBasamagi=sayi%10;
        rakamlarToplami=+birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami=+birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami=+birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami=+birlerBasamagi;
        sayi/=10;

        System.out.println("ilk girilen sayi : " +ilkGirilenSayi +"rakamlar toplami : " + rakamlarToplami
        );
    }
}
